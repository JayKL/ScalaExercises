package Day5

import day5.Calculator
import resources.ScalaExercisesTesting

class CalculatorTest extends ScalaExercisesTesting {
  var calcRefVar = new Calculator()

  "When creating Calculator reference variable" should "exist" in {
    assertCompiles("new Calculator()")
  }

  "When calling sum function" should "require two Integer inputs" in {
    calcRefVar.sum(1, 2)
  }

  "When calling sum function" should "return the summation of two Integer inputs" in {
    assertResult(5) {
      calcRefVar.sum(2, 3)

    }
  }

 "When calling sum function" should "not allow integers beyond +ve bounds" in {
    assertResult("result out of bounds") {
      calcRefVar.sum(inputIntOne =2147483647,inputIntTwo = 1)
    }
  }

  "When calling sum function" should "not allow integers beyond -ve bounds" in {
    assertResult("result out of bounds") {
      calcRefVar.sum(inputIntOne = -2147483647,inputIntTwo = -1)
    }
  }

  "When calling multiplication function" should "require two Integer Inputs" in {
    calcRefVar.multi(2, 3)
  }

  "When calling multiplication function" should "return the multiplication of two Integer inputs" in {
    assertResult(6) {
      calcRefVar.multi(2, 3)
    }
  }

  "When calling multiplication function" should "not allow integers beyond +ve bounds" in {
    assertResult("result out of bounds") {
      calcRefVar.multi(inputIntOne =2147483647,inputIntTwo = 2)
    }
  }

  "When calling multiplication function" should "not allow integers beyond -ve bounds" in {
    assertResult("result out of bounds") {
      calcRefVar.multi(inputIntOne = -2147483647,inputIntTwo = 2)
    }
  }

  "When calling minus function" should "require two integer inputs" in {
    calcRefVar.minus(2,3)
  }

  "When calling minus function" should "return the first number minus the second number" in {
    assertResult(-1) {
      calcRefVar.minus(2,3)
    }
  }

  "When calling minus function" should "not allow integers beyond +ve bounds" in {
    assertResult("result out of bounds") {
      calcRefVar.minus(inputIntOne =2147483647,inputIntTwo = -1)
    }
  }

  "When calling minus function" should "not allow integers beyond -ve bounds" in {
    assertResult("result out of bounds") {
      calcRefVar.minus(inputIntOne = -2147483647,inputIntTwo = 1)
    }
  }

  "When calling divide function" should "require two integers" in {
    calcRefVar.divide(4,2)
  }

  "When calling divide function" should "return the two numbers divided" in {
    assertResult(15)  {
      calcRefVar.divide(30,2)
    }
  }

  "When calling divide function" should "not allow zero as the denominator" in {
    assertResult("zero is not allowed as the denominator")  {
      calcRefVar.divide(30,0)
    }
  }

}
