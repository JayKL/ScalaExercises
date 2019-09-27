package Garage

case class Employee(var name: String, positionInput: String, employeeIDInput: Int) extends Person {
  var position = positionInput
  var employeeID = employeeIDInput

  override def toString = s"Person($name, $positionInput)"
}