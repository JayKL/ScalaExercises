package Garage

case class Bike(bikeModel: String, bikeRegID: Int, bikeOwner: Customer) extends Vehicle {
    def model: String = bikeModel

   def regID: Int = bikeRegID

   def owner: Customer = bikeOwner

  override def toString: String = s"Vehicle($bikeModel, $bikeRegID)"
}