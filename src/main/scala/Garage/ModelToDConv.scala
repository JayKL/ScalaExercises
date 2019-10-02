package Garage

import com.google.gson.Gson
import org.mongodb.scala.Document


trait ModelToDConv {

  val gson=new Gson
  def convertCarToDoc(carToConv: Car): Document = {
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
    val ownercustomerID = docToConver("_id").asInt32().getValue()
     new Car(model,regID,ownercustomerID)
  }

}
