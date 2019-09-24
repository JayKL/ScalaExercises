package day1

object RectangleRecursion extends App {
  var firstTime = true
  var saveIterateValue = 0
  def printRecursion(stringToBePrinted: String, iterateValue: Int): Unit = {
    var totalPrintNeeded = iterateValue
    if (firstTime) {
      totalPrintNeeded = iterateValue * iterateValue
      saveIterateValue = iterateValue
      firstTime = false
    }
    else if (totalPrintNeeded % saveIterateValue == 0) {
      print("\n")
    }
    print(stringToBePrinted)
    if (totalPrintNeeded >0) {
      printRecursion(stringToBePrinted, totalPrintNeeded - 1)
    }
  }

  printRecursion("Kitty", 2)
}
