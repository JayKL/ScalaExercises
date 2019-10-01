package day5

class Calculator {
  def sum(inputIntOne: Int, inputIntTwo: Int): Any = {
    inputIntOne.toLong + inputIntTwo.toLong match {
      case resultMaxValueChecker: Long if resultMaxValueChecker > Integer.MAX_VALUE => "result out of bounds"
      case resultMinValueChecker: Long if (-resultMinValueChecker) > Integer.MAX_VALUE => "result out of bounds"
      case _ => inputIntOne + inputIntTwo
    }
  }

  def multi(inputIntOne: Int, inputIntTwo: Int): Any = {
    inputIntOne.toLong * inputIntTwo.toLong match {
      case resultMaxValueChecker: Long if resultMaxValueChecker > Integer.MAX_VALUE => "result out of bounds"
      case resultMinValueChecker: Long if (-resultMinValueChecker) > Integer.MAX_VALUE => "result out of bounds"
      case _ => inputIntOne * inputIntTwo
    }
  }

  def minus(inputIntOne: Int, inputIntTwo: Int): Any = {
    inputIntOne.toLong - inputIntTwo.toLong match {
      case resultMaxValueChecker: Long if resultMaxValueChecker > Integer.MAX_VALUE => "result out of bounds"
      case resultMinValueChecker: Long if (-resultMinValueChecker) > Integer.MAX_VALUE => "result out of bounds"
      case _ => inputIntOne - inputIntTwo
    }  }

  def divide(numerator: Int, denominator: Int): Any = {
    denominator match  {
      case 0 => "cannot divide by zero"
      case _ =>  numerator / denominator
    }
  }
}
