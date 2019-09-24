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

  def IntegerAdditionTwo(inputInt: Int, inputIntTwo: Int, addYesOrNo: Boolean ): Int ={
    if (inputInt==0 & inputIntTwo==0) {
      0
    }else if (inputInt==0){
      inputInt
    } else if (inputIntTwo==0){
      inputIntTwo
    }else if (addYesOrNo){
      inputInt + inputIntTwo
    } else {
      inputInt*inputIntTwo
    }
  }


}
