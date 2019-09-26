package Garage

case class Bike(bikeModel: String, bikeRegID: Int) extends Vehicle {
   def model: String = bikeModel
   def regID: Int = bikeRegID

  override def toString: String = s"Vehicle($bikeModel, $bikeRegID)"
}