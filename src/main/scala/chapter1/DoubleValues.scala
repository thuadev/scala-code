package chapter1

object DoubleValues extends App {
  def doubleValues(list: List[Int]) = {
    list.map(_ * 2)
  }

  println(doubleValues(List(1, 2, 3, 4)))

  val values = List(1, 2, 3, 4, 5)
  println(values.map(item => item * 2))
  println(values.map(_ * 2))
}
