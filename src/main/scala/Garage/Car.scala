package Garage


case class Car(carModel: String, carRegID: Int) extends Vehicle {
   def model: String = carModel

   def regID: Int = carRegID

  override def toString: String = s"Vehicle($carModel, $carRegID)"
}