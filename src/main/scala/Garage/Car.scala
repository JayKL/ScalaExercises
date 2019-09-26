package Garage


case class Car(carModel: String, carRegID: Int, carOwner: Customer) extends Vehicle {
   def model: String = carModel

   def regID: Int = carRegID

  def owner: Customer = carOwner

  override def toString: String = s"Vehicle($carModel, $carRegID)"
}