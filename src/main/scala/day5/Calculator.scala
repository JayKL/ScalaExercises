package day5

class Calculator {

  val outOfBounds = "result out of bounds"

  def upperBound(numberToBeChecked: Long) = {
    if (numberToBeChecked > Integer.MAX_VALUE) true else false
  }

  def lowerBound(numberToBeChecked: Long): Boolean={
    if (numberToBeChecked>Integer.MAX_VALUE) true else false
  }

  def sum(inputIntOne: Int, inputIntTwo: Int): Any = {
    inputIntOne.toLong + inputIntTwo.toLong match {
      case resultMaxValueChecker: Long if upperBound(resultMaxValueChecker) => outOfBounds
      case resultMinValueChecker: Long if lowerBound(resultMinValueChecker)  => outOfBounds
      case _ => inputIntOne + inputIntTwo
    }
  }

  def multi(inputIntOne: Int, inputIntTwo: Int): Any = {
    inputIntOne.toLong * inputIntTwo.toLong match {
      case resultMaxValueChecker: Long if upperBound(resultMaxValueChecker) => outOfBounds
      case resultMinValueChecker: Long if lowerBound(resultMinValueChecker) => outOfBounds
      case _ => inputIntOne * inputIntTwo
    }
  }

  def minus(inputIntOne: Int, inputIntTwo: Int): Any = {
    inputIntOne.toLong - inputIntTwo.toLong match {
      case resultMaxValueChecker: Long if upperBound(resultMaxValueChecker)=> outOfBounds
      case resultMinValueChecker: Long if lowerBound(resultMinValueChecker)=> outOfBounds
      case _ => inputIntOne - inputIntTwo
    }
  }

  def divide(numerator: Int, denominator: Int): Any = {
    denominator match {
      case 0 => "cannot divide by zero"
      case _ => numerator / denominator
    }
  }
}
