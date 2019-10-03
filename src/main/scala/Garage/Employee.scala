package Garage

import scala.util.Random

case class Employee(var name: String, positionInput: String, employeeIDInput: Int,canThisEmployeeWorkInput: Boolean) extends Person {
  var position = positionInput
  var employeeID = employeeIDInput
  var workableHours = 12
  var canThisEmployeeWork = canThisEmployeeWorkInput
  override def toString = s"Person($name, $positionInput, $employeeIDInput, $workableHours, $canThisEmployeeWork)"
}