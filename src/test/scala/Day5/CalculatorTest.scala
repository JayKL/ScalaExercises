package Day5

import day5.Calculator
import resources.ScalaExercisesTesting

class CalculatorTest extends ScalaExercisesTesting {

  "When creating Calculator reference variable" should "exist" in {
    assertCompiles("new Calculator()")
  }

  "When calling sum function" should "require two Integer inputs" in {
    var calcRefVar = new Calculator()
    calcRefVar.sum(1,2)
  }

  "When calling sum function" should "return the summation of two Integer inputs" in {
    var calcRefVar = new Calculator()
    assertResult(5){
      calcRefVar.sum(2,3)
    }
  }


}
