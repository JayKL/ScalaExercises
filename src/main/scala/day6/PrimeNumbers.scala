package day6

class PrimeNumbers {
  val wheelHitPositions=Array(1, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 49, 53, 59)

  def findPrimeNumbersUpTo(startSieve:Long,limitSieve: Long): Unit ={
    createSieveList(startSieve,limitSieve)
  }

  def createSieveList(startSieve:Long,limitSieve:Long): Array[Long]={
   Array.range(startSieve,limitSieve)
  }



}
