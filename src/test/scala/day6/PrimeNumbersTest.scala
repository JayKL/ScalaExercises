package day6

import resources.ScalaExercisesTesting

class PrimeNumbersTest extends ScalaExercisesTesting {
  val primeNumbersRefVal = new PrimeNumbers()

  "When creating a prime numbers object" should "create the object" in {
    new PrimeNumbers()
  }

  "When calling the wheel hit positions" should "return the wheel" in {
    assertResult(List(1, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 49, 53, 59)) {
      primeNumbersRefVal.wheelHitPositions
    }
  }

  "The object primeNumbersRefVal has a prime numbers finder" should "require integer input" in {
    primeNumbersRefVal.findPrimeNumbersUpTo(1,100)
  }

  "When limit is entered" should "create a sieve list" in {
    assertResult(List(1,2,3,4,5,6,7,8,9)) {
      primeNumbersRefVal.createSieveList(1,10)
    }
  }

}