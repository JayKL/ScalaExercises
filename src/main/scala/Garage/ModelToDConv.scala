package Garage

import org.mongodb.scala.Document


class ModelToDConv {



  def convertCarToDoc(carToConv: Car): Document  ={
    Document(
      "_id" -> carToConv.ownerCustomerID,
      "model" -> carToConv.model,
      "regID" -> carToConv.regID,
      "List of Parts" -> carToConv.getListOfParts()
    )
  }



}
