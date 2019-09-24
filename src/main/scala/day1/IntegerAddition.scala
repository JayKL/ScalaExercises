package day1


object IntegerAddition extends App {

  case class A(intValueOfA: Int) {
    def +++++(inputA: A): Int = {
      intValueOfA + inputA.intValueOfA
    }

    intValueOfA
  }

  val a = A(2)
  val b = A(4)

  println(a +++++ b)

}
