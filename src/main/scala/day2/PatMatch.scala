package day2

object PatMatch extends App{
  def integerAdditionPatMatch(inputIntOne: Int, inputIntTwo: Int,addOrNot: Boolean): Int = inputIntOne match{
    case 0 if inputIntTwo!=0 => inputIntTwo
    case _ => inputIntTwo match {
        case 0 if inputIntOne!=0 => inputIntOne
        case 0 if inputIntTwo==0 => 0
        case _ =>  addOrNot match{
            case addOrNot=> inputIntOne*inputIntTwo
            case _ => inputIntOne+inputIntTwo
          }
      }

  }
  println(integerAdditionPatMatch(2,3,true))
}
