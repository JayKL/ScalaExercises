package Garage

import scala.util.Random

class GarageInit {

  var garageRefVal = new Garage
  garageRefVal.openGarage()
  garageRefVal.registerEmployee(new Employee("a", "Big Boss", 1,employeeWorkOrNot()))
  garageRefVal.registerEmployee(new Employee("a", "Mechanic 1", 2,employeeWorkOrNot()))
  garageRefVal.registerEmployee(new Employee("a", "Mechanic 2", 3,employeeWorkOrNot()))
  garageRefVal.registerEmployee(new Employee("a", "Mechanic 3", 4,employeeWorkOrNot()))
  garageRefVal.registerEmployee(new Employee("a", "Mechanic 4", 5,employeeWorkOrNot()))
  garageRefVal.registerEmployee(new Employee("a", "Mechanic 5", 6,employeeWorkOrNot()))
  garageRefVal.registerEmployee(new Employee("a", "Mechanic 6", 7,employeeWorkOrNot()))
  garageRefVal.registerEmployee(new Employee("a", "Mechanic 7", 8,employeeWorkOrNot()))
  garageRefVal.registerEmployee(new Employee("a", "Mechanic 8", 9,employeeWorkOrNot()))
  garageRefVal.registerEmployee(new Employee("a", "Mechanic 9", 10,employeeWorkOrNot()))

  def employeeWorkOrNot(): Boolean={
    new Random(5).nextInt() match{
      case 0 => true
      case 1 => true
      case 2 => true
      case 3 => true
      case 4 => false
      case _ => false
    }
  }

  def addCarsToBeFixed(garageRefVal: Garage, amountOfCars: Int, initialCount: Int): Unit = {
    if (amountOfCars > 0) {
      garageRefVal.addVehicle(new Car("QA Car", 0, initialCount + 1))
      addCarsToBeFixed(garageRefVal, amountOfCars - 1, initialCount + 1)
    }
  }

  def printAmountOfCars(): Unit = {
    print("Amount of Cars to be fixed: ")
    print(garageRefVal.getContentsOfGarage().size)
    print("\n")
  }

  def printTimeToFixAllCars(): Unit = {
    print("Time to fix all Cars: ")
    print(garageRefVal.getContentsOfGarage().flatMap(vehicle => vehicle.getListOfParts()).filter(part => part.broken == true).map(part => part.getTimeToFix()).sum)
    print("\n")
  }

  def printEmployeeWorkHours(): Unit = {
    print("Available Employee Work Hours: ")
    print(garageRefVal.getContentsOfEmployees().filter(employee => employee.canThisEmployeeWork == true).map(employee => employee.workableHours).sum)
    print("\n")
  }

  if (garageRefVal.openOrNot == true) {
    addCarsToBeFixed(garageRefVal, new Random().nextInt(11) + 10, 0)
    printAmountOfCars()
    printTimeToFixAllCars()
    printEmployeeWorkHours()

    val employeeWorkHours = garageRefVal.getContentsOfEmployees().filter(employee => employee.canThisEmployeeWork == true).map(employee => employee.workableHours).sum

    garageRefVal.fixAllVehicles(garageRefVal.getContentsOfGarage(), employeeWorkHours, garageRefVal.getContentsOfEmployees().size, 0, 0)


  }

  garageRefVal.closeGarage()
}