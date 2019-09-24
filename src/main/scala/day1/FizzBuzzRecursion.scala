package day1

object FizzBuzzRecursion extends App {
  var returnString = ""

  def fizzBuzzRecursion(fizz: String, buzz: String, limitOfLoop: Int): Unit = {
    if (!(limitOfLoop == 0)) {
      fizzBuzzRecursion(fizz, buzz, limitOfLoop - 1)
      if (limitOfLoop % 3 == 0) {
        returnString = fizz
      }
      if (limitOfLoop % 5 == 0) {
        returnString += buzz
      }
      if (!(returnString.equals(""))) {
        println(returnString)
        returnString = ""
      } else {
        println(limitOfLoop)
      }
    }
  }

  fizzBuzzRecursion("fizz", "buzz", 15)
}
