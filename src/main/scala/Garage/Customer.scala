package Garage

case class Customer(var name: String, customerVehicle: Vehicle, customerIDInput: Int) extends Person {
  var listOfVehicles: List[Vehicle] = List()
  var customerID = customerIDInput

  def getCustomerID(): Int = customerID

  def addToListOfVehicles(vehicleToAdd: Vehicle): Unit = {
    listOfVehicles = listOfVehicles :+ vehicleToAdd
  }

  def setToListOfVehicles(vehicleToSet: Vehicle): Unit ={
    listOfVehicles = vehicleToSet :: Nil
  }

  override def toString = s"Person($name, $customerVehicle)"
}