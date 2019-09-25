package day1

object PatMatch extends App{
  def integerAdditionPatMatch(inputIntOne: Int, inputIntTwo: Int): Int = inputIntOne match{
    case _ => inputIntOne+inputIntTwo
  }
  println(integerAdditionPatMatch(2,3))
}
