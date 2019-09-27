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


  def registerEmployee(employeeToBeRegistered: Employee): Unit = {
    listOfEmployees= listOfEmployees :+ employeeToBeRegistered
  }

  def fixVehicle(vehicleToBeFixed: Vehicle): Unit = {
    vehicleToBeFixed.setListOfParts(vehicleToBeFixed.getListOfParts().map(part => part.setPartBrokenValue(true)))
    print("Total amount to pay: £")
    print(calculateBill(vehicleToBeFixed))
    print("\n")
    print("Total time to fix: ")
    print(calculateFixTime(vehicleToBeFixed))
    print(" hrs")
  }

  def calculateFixTime(vehicleToBeFixed: Vehicle):Int={
    vehicleToBeFixed.getListOfParts().map(part => part.timeToFix).sum
  }

  def calculateBill(vehicleToBeFixed: Vehicle): Int = {
    vehicleToBeFixed.getListOfParts().map(part => part.priceToFix).sum
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