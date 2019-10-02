package Garage

import org.mongodb.scala.Document


trait ModelToDConv {

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


}
