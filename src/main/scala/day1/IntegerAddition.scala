package day1


object IntegerAddition extends App {

  case class A(intValueOfA: Int) {
    def +++++(inputA: A): Int = {
      intValueOfA + inputA.intValueOfA
    }
  }

  val a = A(2)
  val b = A(4)

  println(a +++++ b)

  def IntegerAdditionTwo(inputInt: Int, inputIntTwo: Int, addYesOrNo: Boolean): Int = {
    val isFirstInputZero= inputInt==0
    val isSecondInputZero= inputIntTwo==0

    if (isFirstInputZero & isSecondInputZero) {
      0
    } else if (isFirstInputZero) {
      inputInt
    } else if (isSecondInputZero) {
      inputIntTwo
    } else if (addYesOrNo) {
      inputInt + inputIntTwo
    } else {
      inputInt * inputIntTwo
    }
  }


}
