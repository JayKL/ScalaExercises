package day3

object UniqueSum extends App {
  def uniqueSum(inputIntOne: Int, inputIntTwo: Int, inputIntThree: Int): Int ={
    (inputIntOne,inputIntTwo,inputIntThree) match {
      case (a,b,c) if a==b==c => 0
      case (a,b,c) if a==b => c
      case (a,b,c) if b==c => a
      case (a,b,c) if a==c =>b
      case _ => inputIntOne+inputIntTwo+inputIntThree
    }
  }
}
