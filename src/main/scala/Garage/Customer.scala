package Garage

case class Customer(var name: String, customerVehicle: Vehicle, customerIDInput: Int) extends Person {
  var listOfVehiclesInCustomer: List[Vehicle] = List()
  var customerID = customerIDInput

  def getCustomerID(): Int = customerID

  def addToListOfVehicles(vehicleToAdd: Vehicle): Unit = {
    listOfVehiclesInCustomer = listOfVehiclesInCustomer :+ vehicleToAdd
  }

  def setToListOfVehicles(vehicleToSet: Vehicle): Unit ={
    listOfVehiclesInCustomer = vehicleToSet :: Nil
  }

  override def toString = s"Person($name, $customerVehicle)"
}