package day1

object PatMatch extends App{
  def integerAdditionPatMatch(inputIntOne: Int, inputIntTwo: Int,addOrNot: Boolean): Int = addOrNot match{
    case addOrNot=> inputIntOne*inputIntTwo
    case _ => inputIntOne+inputIntTwo
  }
  println(integerAdditionPatMatch(2,3,false))
}
