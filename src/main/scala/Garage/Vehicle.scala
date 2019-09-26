package Garage

abstract class Vehicle {
  def model: String

  def regID: Int

  override def toString = s"Vehicle($model, $regID)"
}