package chapter3

object Access extends App {
  class Microwave{
    def start()=println("started")
    def stop() = println("stopped")
    private def turnTable()=println("turning table")
  }
  val microwave = new Microwave
  microwave.start()
  class Vehicle{
    protected def checkEngine(){}
  }
  class Car extends Vehicle{
    def start(): Unit ={
      checkEngine()
    }
    def tow(car: Car): Unit ={
      car.checkEngine()
    }
    def tow(v:Vehicle): Unit ={
      v.checkEngine()
    }
  }
}
