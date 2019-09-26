package Garage

class Garage {

  private var listOfCustomers: List[Customer] = List()
  private var listOfEmployees: List[Employee] = List()
  private var listOfVehicles: List[Vehicle] =  List()
  var openOrNot: Boolean = false

  def addCustomer(customerToBeAdded: Customer, vehicleToBeAdded: Vehicle ): Unit ={
/*    listOfCustomers.contains(customerToBeAdded.getCustomerID())  match{
      case true => listOfCustomers.filter(customerVal => customerVal.getCustomerID()==customerToBeAdded.getCustomerID()).head.addToListOfVehicles(vehicleToBeAdded)
      case false => {
        listOfCustomers = listOfCustomers :+ customerToBeAdded
      }
    }*/
  }

  def addVehicle(vehicleToBeAdded: Vehicle): Unit ={
/*    listOfVehicles = listOfVehicles :+ vehicleToBeAdded
    addCustomer(vehicleToBeAdded.getOwner(), vehicleToBeAdded)*/
  }

  def removeVehicle(vehicleToBeRemoved: Vehicle): Unit ={
/*    listOfVehicles.contains(vehicleToBeRemoved) match {
      case true => {
        listOfVehicles = listOfVehicles.filterNot(vehicleVal => vehicleVal.getOwner().getCustomerID()==vehicleToBeRemoved.getOwner().getCustomerID())
        listOfCustomers.filter()
      }
      case false => println("VEHICLE NOT FOUND")
    }*/
  }


  def registerEmployee: Unit ={

  }

  def fixVehicle: Unit ={

  }

  def calculateBill: Unit ={

  }

  def getContentsOfGarage: List[Vehicle] ={
    listOfVehicles
  }

  def openGarage: Unit ={
    openOrNot=true
  }

  def closeGarage: Unit ={
    openOrNot=false
  }

}
