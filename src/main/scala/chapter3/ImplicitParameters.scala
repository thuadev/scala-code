package chapter3

object ImplicitParameters extends App{
  class Wifi(name: String) {
    override def toString: String = name
  }

  def connectToNetwork(user: String)(implicit wifi: Wifi): Unit = {
    println(s"$user connect to $wifi")
  }

  def atOffice(): Unit = {
    println("------at office------")

    implicit def officeNetwork: Wifi = new Wifi("office Wifi")

    val cafeteriaNetwork: Wifi = new Wifi("cafe Wifi")
    connectToNetwork("guest")(cafeteriaNetwork)
    connectToNetwork("jojo")
    connectToNetwork("timi")
  }

  def atHome(): Unit = {
    println("------at home-------")

    implicit def homeNetwork: Wifi = new Wifi("home Wifi")

    connectToNetwork("guest")(homeNetwork)
    connectToNetwork("jessy")
  }

  atHome()
  atOffice()
}
