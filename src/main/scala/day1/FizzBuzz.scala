package day1

object FizzBuzz extends App {
  def fizzBuzz(fizz: String, buzz: String, iterateValue: Int): Unit = {
    var returnString = ""
    for (i <- 1 to iterateValue) {
      returnString = ""
      if (i % 3 == 0) {
        returnString = fizz
      }
      if (i % 5 == 0) {
        returnString += buzz
      }
      if (!returnString.equals("")) {
        println(returnString)
      } else{
        println(i)
      }
    }
  }
  fizzBuzz("fizz", "buzz", 15)
}
