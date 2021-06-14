package chapter1

import scala.collection.parallel.immutable._
import scala.collection.parallel.CollectionConverters._


object TopStock extends App {


  var symbols = List("AMD", "AAPL", "AMZN", "IBM", "ORCL", "MSFT")
  var year = 2017
  val list = (1 to 10000).toList
  list.par.map {
    num => println(num)
  }

  case class Record(year: Int, month: Int, date: Int, open: BigDecimal, high: BigDecimal, low: BigDecimal, closePrice: BigDecimal)

  var (topStock, topPrice) =
    symbols.map {
      ticker =>
        (ticker, getYearEndClosingPrice(ticker, year))
    }.maxBy {
      stockPrice =>
        stockPrice._2
    }

  println(s"Top stock of $year is $topStock closing at price $topPrice")

  def getYearEndClosingPrice(symbol: String, year: Int): BigDecimal = {
    val url = s"https://raw.githubusercontent.com/ReactivePlatform/" +
      s"Pragmatic-Scala-StaticResources/master/src/main/resources/" +
      s"stocks/daily/daily_$symbol.csv"
    val data = io.Source.fromURL(url).mkString
    val maxClosePrize = data.split("\n").filter(record => record.startsWith(s"$year-12"))
      .map(record => {
        val Array(timestamp, open, high, low, close, volume) = record.split(",")
        val Array(year, month, date) = timestamp.split("-")
        val r = Record(year.toInt, month.toInt, date.toInt, BigDecimal(open.trim), BigDecimal(high.trim), BigDecimal(low.trim), BigDecimal(close.trim))
        println(r)
        r
      })
      .sortBy(_.date)(Ordering[Int].reverse)
      .take(1)
      .map(_.closePrice).head
    maxClosePrize
  }

}
