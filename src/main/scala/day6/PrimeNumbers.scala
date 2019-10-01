package day6

class PrimeNumbers {
  val wheelHitPositions=List(1, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 49, 53, 59)

  def findPrimeNumbersUpTo(startSieve:Int,limitSieve: Int): Unit ={
    createSieveList(startSieve,limitSieve)
  }

  def createSieveList(startSieve:Int,limitSieve:Int): List[Long]={
   List.range(startSieve,limitSieve)
  }


}
