package Garage

case class Bike(var model: String, var regID: Int, var ownerCustomerID: Int) extends Vehicle {


  override def toString: String = s"Vehicle($model, $regID, $ownerCustomerID)"
}