package Garage

import scala.util.Random

case class Employee(var name: String, positionInput: String, employeeIDInput: Int) extends Person {
  var position = positionInput
  var employeeID = employeeIDInput
  var workableHours = 12
  var canThisEmployeeWork: Boolean = new Random().nextInt(5) match{
    case 0 => true
    case 1 => true
    case 2 => true
    case 3 => true
    case 4 => false
    case _ => false
  }

  override def toString = s"Person($name, $positionInput, $employeeIDInput, $workableHours, $canThisEmployeeWork)"
}