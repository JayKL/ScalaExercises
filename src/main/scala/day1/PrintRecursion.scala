package day1

object PrintRecursion extends App{
  def printRecursion(stringToBePrinted: String, iterateValue: Int): Unit ={
    println(stringToBePrinted)
    if (iterateValue>0) {
      printRecursion(stringToBePrinted,iterateValue-1)
    }
  }
  printRecursion("Kitty",5)
}
