package Garage


case class Car(var model: String, var regID: Int, var ownerCustomerID: Int) extends Vehicle {

  override def toString: String = s"Vehicle($model, $regID, $ownerCustomerID)"

  override def getCustomerID: Int = ownerCustomerID
}