package day6

import resources.ScalaExercisesTesting

class PrimeNumbersTest extends ScalaExercisesTesting {
  val primeNumbersRefVal = new PrimeNumbers()

  "When creating a prime numbers object" should "create the object" in {
    new PrimeNumbers()
  }

  "When calling the wheel hit positions" should "return the wheel" in {
    assertResult(Array(1, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 49, 53, 59)) {
      primeNumbersRefVal.wheelHitPositions
    }
  }

  "The object primeNumbersRefVal has a prime numbers finder" should "require long input" in {
    primeNumbersRefVal.findPrimeNumbersUpTo(1, 10)
  }

  "When limit is entered" should "create a sieve list" in {
    assertResult(Array(2, 3, 4, 5, 6, 7, 8, 9)) {
      primeNumbersRefVal.createSieveList(2, 10)
    }
  }

  "When calling function stepThreeOne" should "return the possible solutions to 4x^2 + y^2=n" in {
    primeNumbersRefVal.stepThreeOne(7)
  }
}