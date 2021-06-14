package chapter3

object Parameters extends App {
  def max(values: Int*) = {
    //print arg type
    println(values.getClass)
    values.foldLeft(values(0)) {
      Math.max
    }
  }

  val maxNum = max(1, 2, 3, 4, 5)
  println(maxNum)
  val values = List(6, 7, 8, 9, 10)
  //invoke with a array parameter like this way
  println(max(values: _*))
}
