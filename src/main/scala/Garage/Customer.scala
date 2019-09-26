package Garage

case class Customer(var name: String, customerIDInput: Int) extends Person {
  var customerID = customerIDInput

  def getCustomerID(): Int = customerID



  override def toString = s"Person($name, $customerIDInput)"
}