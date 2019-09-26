package day3

object GarageApp extends App {

  abstract class Vehicle {
    def model: String

    def regID: Int

    def getModel: String = model

    def getRegID: Int = regID

    override def toString = s"Vehicle($model, $regID)"
  }

  abstract class Person {
    def name: String

    def getName: String = name

    override def toString = s"Person($name, $getName)"
  }

  case class Car(carModel: String, carRegID: Int) extends Vehicle {
    def model: String = carModel

    def regID: Int = carRegID

    override def toString: String = super.toString
  }

  case class Bike(bikeModel: String, bikeRegID: Int) extends Vehicle {
    def model: String = bikeModel

    def regID: Int = bikeRegID

    override def toString: String = super.toString
  }

  case class Employee(employeeName: String, position: String) extends Person {
    def name = employeeName

    override def toString: String = super.toString
  }

  case class Customer(customerName: String, vehicle: Vehicle) extends Person {
    def name = customerName

    override def toString: String = super.toString
  }

}
