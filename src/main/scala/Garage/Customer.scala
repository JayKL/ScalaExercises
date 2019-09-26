package Garage

case class Customer(customerName: String, customerVehicle: Vehicle) extends Person {
   def name = customerName
   def vehicle = customerVehicle
  override def toString = s"Person($name)"
}