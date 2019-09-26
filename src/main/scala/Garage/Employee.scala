package Garage

case class Employee(employeeName: String, position: String) extends Person {
   def name = employeeName

  override def toString = s"Person($employeeName)"
}