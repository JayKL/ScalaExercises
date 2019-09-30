package day5

class Calculator {
  def sum(inputIntOne: Int, inputIntTwo: Int): Any = {
    val inputIntOneLong = inputIntOne.toLong
    val inputIntTwoLong = inputIntTwo.toLong
    inputIntOneLong + inputIntTwoLong match{
      case resultMaxValueChecker: Long if resultMaxValueChecker>Integer.MAX_VALUE => "result out of bounds"
      case resultMinValueChecker: Long if (-resultMinValueChecker)>Integer.MAX_VALUE => "result out of bounds"
      case _ => inputIntOne + inputIntTwo
    }
  }

  def multi(inputIntOne: Int, inputIntTwo: Int): Int = {
    inputIntOne * inputIntTwo
  }

  def minus(inputIntOne: Int, inputIntTwo: Int): Int = {
    inputIntOne - inputIntTwo
  }

  def divide(numerator: Int, denominator: Int): Any = {
    numerator / denominator
  }
}
