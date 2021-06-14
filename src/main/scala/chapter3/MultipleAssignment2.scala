package chapter3

object MultipleAssignment2 extends App {
  def getPerson(id: Int): (String, String, Int) = {
    ("tom", "jerry", 3)
  }

  val (firstName, secondName, age) = getPerson(1)
  println(s"$firstName $secondName $age")
  val p = getPerson(1)
  println(s"$p")
  println(s"${p._1} ${p._2} ${p._3} ")
}
