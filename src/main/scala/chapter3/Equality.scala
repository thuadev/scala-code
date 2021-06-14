package chapter3

/**
 * scala中 == 是值的比较，eq是引用的比较
 */
object Equality extends App {
  val str1 = "hello"
  val str2 = "hello"
  val str3 = new String("hello")
  println(str1 == str2) //等价于java的str1.equals(str2)，
  println(str1 eq str2) //等价于java的str1 == str2
  println(str1 == str3)
  println(str1 eq str3)
}
