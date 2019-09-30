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
    listOfEmployees = listOfEmployees :+ employeeToBeRegistered
  }

  def printInfoToUser(vehicleToBeFixed: Vehicle, currentTotalEmployeeWorkTime: Int): Unit={
    print("Total amount to pay: £")
    print(calculateBill(vehicleToBeFixed))
    print("\n")
    print("Total time to fix: ")
    print(calculateFixTime(vehicleToBeFixed))
    print(" hrs")
    currentTotalEmployeeWorkTime - calculateFixTime(vehicleToBeFixed)

  }

  def fixVehicle(vehicleToBeFixed: Vehicle, currentTotalEmployeeWorkTime: Int, workableEmployees: Int): Int = {
    if (currentTotalEmployeeWorkTime - calculateFixTime(vehicleToBeFixed) >= 0) {
      calculateAmountOfEmployeesToFixVehicle(calculateFixTime(vehicleToBeFixed),0,true)
      vehicleToBeFixed.setListOfParts(vehicleToBeFixed.getListOfParts().map(part => part.setPartBrokenValue(true)))
      removeVehicle(vehicleToBeFixed)
      printInfoToUser(vehicleToBeFixed,currentTotalEmployeeWorkTime)
    } else{
      print("not enough hours to fix")
      0
    }
  }

  def calculateAmountOfEmployeesToFixVehicle(timeToFixVehicle: Int,numberOfEmployees: Int,firstRun: Boolean,Remainder: Int): Int = {
    if (timeToFixVehicle>=12){
      calculateAmountOfEmployeesToFixVehicle(timeToFixVehicle-12,numberOfEmployees+1,false,0)
      (numberOfEmployees,0)
    }
    numberOfEmployees
  }

  def calculateFixTime(vehicleToBeFixed: Vehicle): Int = {
    vehicleToBeFixed.getListOfParts().map(part => part.timeToFix).sum
  }

  def calculateBill(vehicleToBeFixed: Vehicle): Int = {
    vehicleToBeFixed.getListOfParts().map(part => part.priceToFix).sum
  }

  def getContentsOfGarage(): List[Vehicle] = {
    listOfVehicles
  }

  def getContentsOfEmployees(): List[Employee] = {
    listOfEmployees
  }

  def openGarage(): Unit = {
    openOrNot = true
  }

  def closeGarage(): Unit = {
    openOrNot = false
  }
}