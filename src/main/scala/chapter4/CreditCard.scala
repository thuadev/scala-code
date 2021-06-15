package chapter4

class CreditCard(val number: Int, var creditLimit: Int) {
  override def toString: String = {
    s"$number limit: $creditLimit"
  }
}

object CreditCard extends App {
  val c = new CreditCard(123, 10000)
  println(c)
  c.creditLimit = 12000
  println(c)
}