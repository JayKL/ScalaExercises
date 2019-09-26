package Garage


case class Car(var model: String, var regID: Int, var owner: Customer) extends Vehicle {

  override def getOwner(): Customer = owner

  override def toString: String = s"Vehicle($model, $regID, $owner)"
}