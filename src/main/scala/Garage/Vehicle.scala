package Garage

abstract class Vehicle {
  var model: String
  var ownerCustomerID: Int
  var regID: Int
  override def toString = s"Vehicle($model, $ownerCustomerID , $regID)"
}