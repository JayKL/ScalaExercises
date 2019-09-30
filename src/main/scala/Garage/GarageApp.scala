package Garage

import scala.util.Random

object GarageApp extends App {
  var garageRefVal = new Garage
  garageRefVal.openGarage()
  garageRefVal.registerEmployee(new Employee("a", "Big Boss", 1))
  garageRefVal.registerEmployee(new Employee("a", "Mechanic 1", 2))
  garageRefVal.registerEmployee(new Employee("a", "Mechanic 2", 3))
  garageRefVal.registerEmployee(new Employee("a", "Mechanic 3", 4))
  garageRefVal.registerEmployee(new Employee("a", "Mechanic 4", 5))
  garageRefVal.registerEmployee(new Employee("a", "Mechanic 5", 6))
  garageRefVal.registerEmployee(new Employee("a", "Mechanic 6", 7))
  garageRefVal.registerEmployee(new Employee("a", "Mechanic 7", 8))
  garageRefVal.registerEmployee(new Employee("a", "Mechanic 8", 9))
  garageRefVal.registerEmployee(new Employee("a", "Mechanic 9", 10))

  def addCarsToBeFixed(garageRefVal: Garage, amountOfCars: Int, initialCount: Int): Unit = {
    if (amountOfCars > 0) {
      garageRefVal.addVehicle(new Car("QA Car", 0, initialCount + 1))
      addCarsToBeFixed(garageRefVal, amountOfCars - 1, initialCount + 1)
    }
  }

  def printAmountOfCars(): Unit ={
    print("Amount of Cars to be fixed: ")
    print(garageRefVal.getContentsOfGarage().size)
    print("\n")
  }

  def printTimeToFixAllCars(): Unit ={
    print("Time to fix all Cars: ")
    print(garageRefVal.getContentsOfGarage().flatMap(vehicle => vehicle.getListOfParts()).filter(part => part.broken == true).map(part => part.getTimeToFix()).sum)
    print("\n")
  }

  def printEmployeeWorkHours(): Unit={
    print("Available Employee Work Hours: ")
    print(garageRefVal.getContentsOfEmployees().filter(employee => employee.canThisEmployeeWork==true).map(employee => employee.workableHours).sum)
    print("\n")
  }

  if (garageRefVal.openOrNot == true) {
    addCarsToBeFixed(garageRefVal, new Random().nextInt(11) + 10, 0)
    printAmountOfCars()
    printTimeToFixAllCars()
    printEmployeeWorkHours()

    var employeeWorkHours = garageRefVal.getContentsOfEmployees().filter(employee => employee.canThisEmployeeWork==true).map(employee => employee.workableHours).sum
    garageRefVal.fixVehicle(garageRefVal.getContentsOfGarage()(0),employeeWorkHours,employeeWorkHours/12)
  }

  garageRefVal.closeGarage()
}
