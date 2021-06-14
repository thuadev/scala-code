package chapter1

object FindMaxFunctional extends App {
  def findMax(temperatures: List[Int]): Int = {
    temperatures.foldLeft(Integer.MIN_VALUE) {
      Math.max
    }
  }
 //findMax等价于findMax2
  def findMax2(temperatures: List[Int]): Int = {
    temperatures.foldLeft(Integer.MIN_VALUE)((a, b) => {
      val max = Math.max(a, b)
      max
    })
  }

  println(findMax(List(12, 34, 56, 78)))

}
