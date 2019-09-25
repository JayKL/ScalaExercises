package day1

object StringPrintRepeater extends App {
  def printXTimes(printString: String, amountToPrint: Int): Unit = {
    for (i <- 1 to amountToPrint){
      println(printString)
    }
  }
  printXTimes("Hello",3)
}
