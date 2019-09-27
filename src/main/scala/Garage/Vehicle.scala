package Garage

abstract class Vehicle {
  var model: String
  var ownerCustomerID: Int
  var regID: Int
  var listOfParts: List[Part]
  def getCustomerID(): Int
  def getListOfParts(): List[Part]
  def setListOfParts(listToBeSet: List[Part])
  override def toString = s"Vehicle($model, $ownerCustomerID , $regID)"
}