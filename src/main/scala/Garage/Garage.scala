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

  def fixVehicle(vehicleToBeFixed: Vehicle, currentTotalEmployeeWorkTime: Int, workableEmployees: Int): Unit = {
    val differenceBetweenWorkTimeFixTime = currentTotalEmployeeWorkTime - calculateFixTime(vehicleToBeFixed)
    if (differenceBetweenWorkTimeFixTime >= 0) {
      vehicleToBeFixed.setListOfParts(vehicleToBeFixed.getListOfParts().map(part => part.setPartBrokenValue(true)))
      removeVehicle(vehicleToBeFixed)
      printInfoToUser(vehicleToBeFixed,currentTotalEmployeeWorkTime)
      val amountOfEmployeesRequired=calculateAmountOfEmployeesToFixVehicle(calculateFixTime(vehicleToBeFixed),0,(differenceBetweenWorkTimeFixTime%12))
      amountOfEmployeesRequired
    } else{
      print("not enough employee work time to fix car")
    }
  }

  def calculateCurrentEmployeeWorking(amountOfEmployeesRequired:Int, remainder:Int): Unit ={
    amountOfEmployeesRequired

  }

  def calculateAmountOfEmployeesToFixVehicle(timeToFixVehicle: Int,numberOfEmployees: Int,remainder: Int): Int = {
    timeToFixVehicle match {
      case greaterThanTwelveCheck: Int if greaterThanTwelveCheck>=(12-remainder) =>       calculateAmountOfEmployeesToFixVehicle(timeToFixVehicle-(12-remainder),numberOfEmployees+1,0)
      case isZero: Int if isZero==0 => numberOfEmployees
      case isNonZero: Int if isNonZero!=0 => numberOfEmployees+1
    }
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