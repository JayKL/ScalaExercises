package Garage

import scala.util.Random
import scala.collection.mutable.ListBuffer

case class Car(var model: String, var regID: Int, var ownerCustomerID: Int, var listOfPartsInput: List[Part]) extends Vehicle {


  var listOfParts: List[Part] =listOfPartsInput

  def getListOfParts(): List[Part] ={
    listOfParts
  }

  override def setListOfParts(listToBeSet: List[Part]): Unit ={
    listOfParts=listToBeSet
  }

  override def toString: String = s"Vehicle($model, $regID, $ownerCustomerID, $listOfParts)"

  override def getCustomerID: Int = ownerCustomerID
}