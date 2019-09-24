package day1

object rectangleRecursion extends App {
  var firstTime = true
  var saveIterateValue = 0


  def printRecursion(stringToBePrinted: String, iterateValue: Int): Unit = {
    var iterateValue2 = iterateValue
    if (firstTime) {
      iterateValue2 = iterateValue * iterateValue
      saveIterateValue = iterateValue
      firstTime = false
    }
    else if (iterateValue2 % saveIterateValue == 0) {
      print("\n")
    }
    print(stringToBePrinted)
    if (!(iterateValue2 == 1)) {
      printRecursion(stringToBePrinted, iterateValue2 - 1)
    }
  }

  printRecursion("Kitty", 2)
}
