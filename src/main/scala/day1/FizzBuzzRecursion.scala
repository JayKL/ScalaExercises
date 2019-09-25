package day1

object FizzBuzzRecursion extends App {
  var returnString = ""

  def fizzBuzzRecursion(fizz: String, buzz: String, limitOfLoop: Int): Unit = {
    if (!(limitOfLoop == 0)) {
      fizzBuzzRecursion(fizz, buzz, limitOfLoop - 1)
      val fizzBoolean= limitOfLoop % 3 == 0
      val buzzBoolean= limitOfLoop % 5 == 0
      if (fizzBoolean & buzzBoolean) {
        println(fizz+buzz)
      } else if (buzzBoolean) {
        println(buzz)
      } else if (fizzBoolean ){
        println(fizz)
      } else{
        println(limitOfLoop)
      }
    }
  }

  fizzBuzzRecursion("fizz", "buzz", 15)
}
