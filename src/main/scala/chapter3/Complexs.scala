package chapter3

object Complexs extends App {
  val c1 = new Complex(1, 2)
  val c2 = new Complex(2, -3)
  val c3 = new Complex(2, 2)
  val sum = c1 + c2 * c3
  println(s"(${c1}) + (${c2})* ($c3) = $sum")
}
