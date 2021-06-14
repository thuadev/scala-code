package chapter3

object DefaultValues extends App {
  def mail(destination: String = "head Office", mailClass: String = "first"): Unit = {
    println(s"sending to $destination by $mailClass class ")
  }

  mail()
  //pass named parameter which designed to be implicit
  mail(mailClass = "second")
  mail("CEO office")

}
