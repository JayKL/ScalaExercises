package Garage

import scala.util.Random
import scala.collection.mutable.ListBuffer

case class Car(var model: String, var regID: Int, var ownerCustomerID: Int) extends Vehicle {

  def generateListOfParts(count: Int, outputList: ListBuffer[Part]): List[Part] = {
    if (count>0){
      outputList += new Part
      generateListOfParts(count-1,outputList :+ new Part)
    }
    outputList.toList
  }
  var listOfParts: List[Part] = generateListOfParts(new Random().nextInt(6) + 10,  ListBuffer() )
  override def toString: String = s"Vehicle($model, $regID, $ownerCustomerID, $listOfParts)"

  override def getCustomerID: Int = ownerCustomerID
}