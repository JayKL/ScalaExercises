package Garage

import org.mongodb.scala.{MongoClient, MongoDatabase}

import scala.concurrent.Await
import scala.concurrent.duration.Duration


class Garage extends MongoConnection {
  val mongoClient: MongoClient = MongoClient(getConnectionVal())
  val database: MongoDatabase = mongoClient.getDatabase(getDatabaseVal())
  val modelToDConvRefVal: ModelToDConv=new ModelToDConv {}

  def Initialize(): Unit ={
    println("retrieving Data from database")
    println("retrieving list of vehicles")
    listOfVehicles=Await.result(database.getCollection("Vehicles").find().toFuture(),Duration.Inf).map(doc => convertDocToCar(doc)).toList
    println(listOfVehicles)
    println("retrieving list of employees")
    listOfEmployees=Await.result(database.getCollection("Employees").find().toFuture(),Duration.Inf).map(doc => convertDocToEmployee(doc)).toList
    println(listOfEmployees)
  }

  var listOfVehiclesFuture: List[Vehicle] = List()
  var listOfEmployeesFuture: List[Employee] = List()
  private var listOfCustomers: List[Customer] = List()
  private var listOfEmployees: List[Employee] = List()
  private var listOfVehicles: List[Vehicle] = List()
  Initialize()
  var openOrNot: Boolean = false
  private var currentEmployee: Int = 0

  def getContentsOfGarage(): List[Vehicle] = {
    listOfVehicles
  }

  def getContentsOfEmployees(): List[Employee] = {
    listOfEmployees
  }

  def addCustomer(customerToBeAdded: Customer): Unit = {
    listOfCustomers = listOfCustomers :+ customerToBeAdded
  }

  def addVehicle(vehicleToBeAdded: Vehicle): Unit = {
    addDocument(modelToDConvRefVal.convertCarToDoc(vehicleToBeAdded),database.getCollection( "Vehicles"))
    listOfVehicles = listOfVehicles :+ vehicleToBeAdded
  }

  def registerEmployee(employeeToBeRegistered: Employee): Unit = {
    addDocument(modelToDConvRefVal.convertEmployeeToDoc(employeeToBeRegistered),database.getCollection("Employees"))
    listOfEmployees = listOfEmployees :+ employeeToBeRegistered
  }

  def removeVehicle(vehicleToBeRemoved: Vehicle): Unit = {
    listOfVehicles.contains(vehicleToBeRemoved) match {
      case true => {
        listOfVehicles = listOfVehicles.filterNot(vehicleVal => vehicleVal.getCustomerID == vehicleToBeRemoved.getCustomerID)
      }
      case false => println("VEHICLE NOT FOUND")
    }
  }



  def printInfoToUser(vehicleToBeFixed: Vehicle, currentTotalEmployeeWorkTime: Int): Unit = {
    print("\n")
    println("The current vehicle is")
    println(vehicleToBeFixed)
    print("Total amount to pay: £")
    print(calculateBill(vehicleToBeFixed))
    print("\n")
    print("Total time to fix: ")
    print(calculateFixTime(vehicleToBeFixed))
    print(" hrs")
    currentTotalEmployeeWorkTime - calculateFixTime(vehicleToBeFixed)

  }

  def findRemainder(vehicleToBeFixed: Vehicle): Int = {
    calculateFixTime(vehicleToBeFixed) % 12
  }

  def isThereEnoughTimeToFix(currentTotalEmployeeWorkTime: Int, fixTime:Int): Boolean ={
    currentTotalEmployeeWorkTime - fixTime match {
      case isGreaterThanZero: Int if isGreaterThanZero>=0 => true
      case _ => false
    }
  }

  def fixAllVehicles(vehicleToBeFixed: List[Vehicle], currentTotalEmployeeWorkTime: Int, workableEmployees: Int, remainder: Int, whichVehicle: Int): Unit = {
    if (isThereEnoughTimeToFix(currentTotalEmployeeWorkTime,calculateFixTime(vehicleToBeFixed(whichVehicle)))) {
      fixVehicle(vehicleToBeFixed(whichVehicle), currentTotalEmployeeWorkTime, workableEmployees, remainder)
      fixAllVehicles(vehicleToBeFixed, currentTotalEmployeeWorkTime - calculateFixTime(vehicleToBeFixed(whichVehicle)), workableEmployees, findRemainder(vehicleToBeFixed(whichVehicle)), whichVehicle + 1)
    } else {
      print("\n")
      println("employees are exhausted")
    }
  }

  def fixVehicle(vehicleToBeFixed: Vehicle, currentTotalEmployeeWorkTime: Int, workableEmployees: Int, remainder: Int): Unit = {
    val differenceBetweenWorkTimeFixTime = currentTotalEmployeeWorkTime - calculateFixTime(vehicleToBeFixed)
    if (differenceBetweenWorkTimeFixTime >= 0) {
      printInfoToUser(vehicleToBeFixed, currentTotalEmployeeWorkTime)
      vehicleToBeFixed.setListOfParts(vehicleToBeFixed.getListOfParts().map(part => part.setPartBrokenValue(true)))
      removeVehicle(vehicleToBeFixed)
      calculateAmountOfEmployeesToFixVehicle(calculateFixTime(vehicleToBeFixed), 0, remainder)
    } else {
      print("not enough employee work time to fix vehicle")
    }
  }

  def printCurrentEmployee(): Unit = {
    print("\n")
    println("The current employee working on this vehicle is: ")
    print(getContentsOfEmployees()(currentEmployee).position)
  }

  def calculateAmountOfEmployeesToFixVehicle(timeToFixVehicle: Int, numberOfEmployees: Int, remainder: Int): Int = {
    timeToFixVehicle match {
      case greaterThanTwelveCheck: Int if greaterThanTwelveCheck >= (12 - remainder) => {
        printCurrentEmployee()
        currentEmployee += 1
        calculateAmountOfEmployeesToFixVehicle(timeToFixVehicle - (12 - remainder), numberOfEmployees + 1, 0)
      }
      case isZero: Int if isZero == 0 => numberOfEmployees
      case isNonZero: Int if isNonZero != 0 => {
        printCurrentEmployee()
        numberOfEmployees + 1
      }
    }
  }

  def calculateFixTime(vehicleToBeFixed: Vehicle): Int = {
    vehicleToBeFixed.getListOfParts().map(part => part.timeToFix).sum
  }

  def calculateBill(vehicleToBeFixed: Vehicle): Int = {
    vehicleToBeFixed.getListOfParts().map(part => part.priceToFix).sum
  }

  def openGarage(): Unit = {
    openOrNot = true
  }

  def closeGarage(): Unit = {
    openOrNot = false
  }

}