package Garage

abstract class Person {
  def name: String

  override def toString = s"Person($name)"
}