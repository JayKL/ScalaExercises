package Garage

abstract class Vehicle {
  var model: String
  var owner: Customer
  var regID: Int
  def getOwner(): Customer
  override def toString = s"Vehicle($model, $owner , $regID)"
}