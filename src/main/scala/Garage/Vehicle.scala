package Garage

abstract class Vehicle {
  def model: String
  def owner: Customer
  def regID: Int

  override def toString = s"Vehicle($model, $owner , $regID)"
}