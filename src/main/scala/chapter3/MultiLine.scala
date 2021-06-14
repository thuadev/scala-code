package chapter3

object MultiLine extends App {
  val str =
    """in his famous inaugural speech,John F.
      |Kennedy said"And so,my fellow Americans: ask not what country can do
      |for you-ask what you can do for you country."he then proceeded
      |to speak to the citizens of the world...
      """.stripMargin
  println(str)
  val price = 25.12
  //s-interpolator
  println(s"$price")

  val discount = 10

  println(s"${price * (1 - discount / 100.0)}")
  println(s"$$${price * (1 - discount / 100.0)}")
  //f-interpolator
  println(f"$$${price * (1 - discount / 100.0)}%5.2f")
  //raw-interpolator
  println(
    raw"""$$${price * (1 - discount / 100.0)}
         |
         |
         |""".stripMargin)

}
