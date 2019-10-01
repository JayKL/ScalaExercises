package day6

import resources.ScalaExercisesTesting

class PrimeNumbersTest extends ScalaExercisesTesting {
  val primeNumbersRefVal = new PrimeNumbers()

  "When creating a prime numbers object" should "create the object" in {
    new PrimeNumbers()
  }

  "When calling the wheel hit positions" should "return the wheel" in {
    assertResult(List(1, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 49, 53, 59)) {
      primeNumbersRefVal.getWheelHitPositions
    }
  }

}