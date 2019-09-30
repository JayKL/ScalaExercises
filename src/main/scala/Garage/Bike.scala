package Garage

case class Bike(var model: String, var regID: Int, var ownerCustomerID: Int) extends Vehicle {
  var listOfParts = List(new Part)

  override def getListOfParts: List[Part] = {
    listOfParts
  }

  override def getCustomerID: Int = {
    ownerCustomerID
  }

  def setListOfParts(listToBeSet: List[Part]): Unit ={
    listOfParts=listToBeSet
  }

  override def toString: String = s"Vehicle($model, $regID, $ownerCustomerID)"
}