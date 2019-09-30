package Day5

import resources.ScalaExercisesTesting

class CalculatorTest extends ScalaExercisesTesting {

  "When creating Calculator reference variable" should "exist" in {
    assertCompiles("new Calculator()")
  }
}
