package Garage

import org.mongodb.scala.Document


trait ModelToDConv {



  def convertCarToDoc(carToConv: Car): Document  ={
    Document(
      "_id" -> carToConv.ownerCustomerID,
      "model" -> carToConv.model,
      "regID" -> carToConv.regID
    )
  }



}
