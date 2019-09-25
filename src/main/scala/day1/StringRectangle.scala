package day1

object StringRectangle extends App {
  def printRectangle(printString: String, amountToPrint: Int): Unit = {

    for (j <- 1 to amountToPrint; i <- 1 to amountToPrint) {
      print(printString)
      if (i==amountToPrint) {
        println()
      }
    }
  }


  printRectangle("Kitty", 3)

}
