package Garage

import scala.util.Random

object GarageApp extends App {
  var garageRefVal = new Garage
  garageRefVal.openGarage

  if (garageRefVal.openOrNot == true) {

    garageRefVal.fixVehicle(new Car("a", 2, 3))


  }
}
