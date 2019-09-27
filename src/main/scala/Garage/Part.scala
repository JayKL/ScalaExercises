package Garage

import scala.util.Random

class Part {

  var broken: Boolean = new Random().nextInt(2) match{
    case 0 => true
    case 1 => false
  }
  val priceToFix: Int = new Random().nextInt(150)
  val timeToFix: Int=new Random().nextInt(4)

  override def toString = s"Part()"
}
