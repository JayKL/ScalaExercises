package day3

object BlackJack extends App {

  def checkIfValidBlackJackNumber(numberToBeChecked: Int): Boolean = {
    numberToBeChecked >= 4 & numberToBeChecked <= 21
  }

  def blackJack(inputIntegerOne: Int, inputIntegerTwo: Int): Int = {
    (checkIfValidBlackJackNumber(inputIntegerOne), checkIfValidBlackJackNumber(inputIntegerTwo)) match {
      case (true, true) => inputIntegerOne match {
       case inputIntegerOneVar if inputIntegerOneVar>=inputIntegerTwo => inputIntegerOne
       case _ => inputIntegerTwo
      }
      case (true, false) => inputIntegerTwo
      case (false, true) => inputIntegerOne
      case (false, false) => 0
    }
  }
}
