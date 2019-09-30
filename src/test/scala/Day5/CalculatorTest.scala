package Day5

import day5.Calculator
import resources.ScalaExercisesTesting

class CalculatorTest extends ScalaExercisesTesting {

  "When creating Calculator reference variable" should "exist" in {
    assertCompiles("new Calculator()")
  }

  "When calling sum function" should "require two Integer inputs" in {
    var calcRefVar = new Calculator()
    Calculator.sum(1,2)
  }


}
