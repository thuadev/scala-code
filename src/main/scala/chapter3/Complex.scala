package chapter3

case class Complex(val real: Int, val imaginary: Int) {
  def +(operand: Complex): Complex = {
    println("calling +")
    Complex(real + operand.real, imaginary + operand.imaginary)
  }

  def *(operand: Complex): Complex = {
    println("calling *")
    Complex(real * operand.real - imaginary * operand.imaginary,
      real * operand.imaginary + imaginary * operand.real)
  }

  override def toString: String = {
    val sign = if (imaginary < 0) "" else "+"
    s"$real$sign${imaginary}i"
  }
}
