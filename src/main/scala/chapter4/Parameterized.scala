package chapter4

class Parameterized {
  def echo[T](input1: T, input2: T) =
    println(s"got $input1 (${input1.getClass}) $input2(${input2.getClass})")
}
