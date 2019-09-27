package Garage

class Garage {

  private var listOfCustomers: List[Customer] = List()
  private var listOfEmployees: List[Employee] = List()
  private var listOfVehicles: List[Vehicle] = List()
  var openOrNot: Boolean = false

  def addCustomer(customerToBeAdded: Customer): Unit = {
    listOfCustomers = listOfCustomers :+ customerToBeAdded
  }

  def addVehicle(vehicleToBeAdded: Vehicle): Unit = {
    listOfVehicles = listOfVehicles :+ vehicleToBeAdded
  }

  def removeVehicle(vehicleToBeRemoved: Vehicle): Unit = {
    listOfVehicles.contains(vehicleToBeRemoved) match {
      case true => {
        listOfVehicles = listOfVehicles.filterNot(vehicleVal => vehicleVal.getCustomerID == vehicleToBeRemoved.getCustomerID)
      }
      case false => println("VEHICLE NOT FOUND")
    }
  }


  def registerEmployee: Unit = {

  }

  def fixVehicle: Unit = {

  }

  def calculateBill: Unit = {

  }

  def getContentsOfGarage: List[Vehicle] = {
    listOfVehicles
  }

  def openGarage: Unit = {
    openOrNot = true
  }

  def closeGarage: Unit = {
    openOrNot = false
  }

}