package chapter1

object FindMaxImperative extends App {
  def findMax(temperatures: List[Int]) = {
    var high = Integer.MIN_VALUE
    for (temperature <- temperatures) {
      if (high < temperature) {
        high = temperature
      }
    }
    temperatures.foreach(temperature => if (high < temperature) {
      high = temperature
    })
    high
  }

  println(findMax(List(12, 3, 4, 5, 6)))
}
