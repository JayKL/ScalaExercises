package day3

object TooHot extends App {
  def upperLimitSetter(isSummer:Boolean): Int={
    isSummer match{
      case true => 100
      case _ => 90
    }
  }

  def tooHot(temperature: Int, isSummer: Boolean): Boolean ={
    temperature match{
      case temperatureVal if temperatureVal>60 & temperatureVal<upperLimitSetter(isSummer) => true
      case _ => false
    }
  }
}
