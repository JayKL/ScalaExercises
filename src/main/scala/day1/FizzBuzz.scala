package day1

object FizzBuzz extends App {
  def fizzBuzz(fizz: String, buzz: String, iterateValue: Int): Unit = {
    for (i <- 1 to iterateValue) {
      val fizzBoolean= i % 3 == 0
      val buzzBoolean= i % 5 == 0
      if (fizzBoolean & buzzBoolean) {
       println(fizz+buzz)
      } else if (buzzBoolean) {
        println(buzz)
      } else if (fizzBoolean ){
        println(fizz)
      } else{
        println(i)
      }
    }
  }
  fizzBuzz("fizz", "buzz", 15)
}
