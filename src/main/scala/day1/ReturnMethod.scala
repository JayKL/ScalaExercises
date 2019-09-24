package day1

object ReturnMethod extends App{
  def returnMethod(input: Any): Any={
    input
  }
  println(returnMethod(2.0))
  println(returnMethod("Check String"))
  println(returnMethod(1))
  println(returnMethod(true))
}
