package Garage

class Garage {

  private var listOfCustomers: List[Customer] = List()
  private var listOfEmployees: List[Employee] = List()
  private var listOfVehicles: List[Vehicle] =  List()


  def addCustomer(customerToBeAdded: Customer, vehicleToBeAdded: Vehicle ): Unit ={
    listOfCustomers.contains(customerToBeAdded.getCustomerID())  match{
      case true => listOfCustomers.filter(customerVal => customerVal.getCustomerID()==customerToBeAdded.getCustomerID()).head.addToListOfVehicles(vehicleToBeAdded)
      case false => {
        customerToBeAdded.setToListOfVehicles(vehicleToBeAdded)
        listOfCustomers = listOfCustomers :+ customerToBeAdded
      }
    }
  }

  def addVehicle(vehicleToBeAdded: Vehicle): Unit ={
    listOfVehicles = listOfVehicles :+ vehicleToBeAdded
    addCustomer(vehicleToBeAdded.getOwner(), vehicleToBeAdded)
  }

  def removeVehicle(): Unit ={

  }

  def registerEmployee: Unit ={

  }

  def fixVehicle: Unit ={

  }

  def calculateBill: Unit ={

  }

  def getContentsOfGarage: Unit ={

  }

  def openGarage: Unit ={

  }

  def closeGarage: Unit ={

  }

}
