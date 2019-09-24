package day1

object printRecursion extends App{
  def printRecursion(stringToBePrinted: String, iterateValue: Int): Unit ={
    println(stringToBePrinted)
    if (!(iterateValue==1)) {
      printRecursion(stringToBePrinted,iterateValue-1)
    }
  }
  printRecursion("Kitty",5)
}
