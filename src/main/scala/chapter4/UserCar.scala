package chapter4


class car(val year: Int) {
  private var milesDriven: Int = 0;

  def miles: Int = milesDriven

  def drive(distance: Int) = {
    milesDriven += Math.abs(distance)
  }

}
object UserCar extends App{
  val car = new car(2015)
  println(s"car made in year ${car.year}")
  println(s"Miles driven ${car.miles}")
  println("Drive for 10 miles")
  car.drive(10)
  println(s"Miles driven ${car.miles}")
}

