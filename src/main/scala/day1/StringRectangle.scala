package day1

object StringRectangle extends App {
  def printRectangle(printString: String, amountToPrint: Int): Unit = {
    for (j <- 1 to amountToPrint) {
      for (i <- 1 to amountToPrint) {
        print(printString)
      }
      println()
    }
  }

  printRectangle("Kitty", 3)

}
