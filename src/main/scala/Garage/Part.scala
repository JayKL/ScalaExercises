package Garage

import scala.util.Random

class Part {

  var broken: Boolean = new Random().nextInt(2) match{
    case 0 => true
    case 1 => false
  }

  def setPartBrokenValue(valueToBeSet:Boolean): Part={
    broken=valueToBeSet
    this
  }

  def getTimeToFix(): Int={
    timeToFix
  }
  val priceToFix: Int = new Random().nextInt(100) + 50
  val timeToFix: Int=new Random().nextInt(3) + 1

  override def toString: String = s"Part($broken, $priceToFix, $timeToFix)"
}
