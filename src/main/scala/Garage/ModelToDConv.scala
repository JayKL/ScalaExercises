package Garage

import com.google.gson.Gson
import org.mongodb.scala.Document


trait ModelToDConv {

  val gson=new Gson
  def convertCarToDoc(carToConv: Vehicle): Document = {
    Document(
      "_id" -> carToConv.ownerCustomerID,
      "model" -> carToConv.model,
      "regID" -> carToConv.regID,
      "listOfParts" -> carToConv.getListOfParts().map(part => convertPartToDoc(part))
    )
  }

  def convertPartToDoc(partToConv: Part): Document={
    Document(
      "broken" -> partToConv.broken,
      "priceToFix" -> partToConv.priceToFix,
      "timeToFix" -> partToConv.timeToFix
    )
  }

  def convertDocToCar(docToConver: Document): Car ={
    val model =   docToConver("model").asString().getValue()
    val regID = docToConver("regID").asInt32().getValue()
    val ownerCustomerID = docToConver("_id").asInt32().getValue()
     new Car(model,regID,ownerCustomerID)
  }

  def convertEmployeeToDoc(employeeToConvert: Employee): Document={
    Document(
      "name" -> employeeToConvert.name,
      "position" -> employeeToConvert.position,
      "employeeID" -> employeeToConvert.employeeIDInput,
      "workableHours" -> employeeToConvert.workableHours,
      "canThisEmployeeWork" -> employeeToConvert.canThisEmployeeWork
    )
  }

  def convertDocToEmployee(docToConver:Document): Employee={
    val name= docToConver("name").asString().getValue()
    val position=docToConver("position").asString().getValue()
    val employeeID=docToConver("employeeID").asInt32().getValue()
    val canThisEmployeeWork=docToConver("canThisEmployeeWork").asBoolean().getValue()
    new Employee(name,position,employeeID,canThisEmployeeWork)
  }
}
