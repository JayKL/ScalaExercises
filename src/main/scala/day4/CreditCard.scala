package day4


object CreditCard extends App {
  var identifyingNumber: Seq[Int] = Seq(7, 9, 9, 2, 7, 3, 9, 8, 7, 1)
  var startPos: Int = identifyingNumber.size - 2
  var alternateVal: Boolean = true

  def addCheckNumber(numberToAppend: Int): Unit = {
    identifyingNumber = identifyingNumber :+ numberToAppend
    startPos = identifyingNumber.size - 2
  }

  def numberDoubler(numberToBeDoubled: Int): Int = {
    if (numberToBeDoubled * 2 >= 10) {
      (numberToBeDoubled * 2).toString.toStream.map(char => char.toInt - 48).toList.sum
    } else {
      numberToBeDoubled * 2
    }
  }

  def checkIfVaidNumber(): Boolean = {
    if (startPos >= 0) {
      alternateVal match {
        case true => {
          alternateVal = false
          identifyingNumber = identifyingNumber.updated(startPos, numberDoubler(identifyingNumber(startPos)))
        }
        case false => {
          alternateVal = true
        }
      }
      startPos = startPos - 1
      checkIfVaidNumber()
    } else {
      identifyingNumber.sum % 10 == 0
    }
  }

  addCheckNumber(3)
  println(checkIfVaidNumber())
  println("this is a valid number")
}sssssss
