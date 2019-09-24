package day1

object StringReplacer extends App {

  def charChecker(inputChar: Char, replaceChar: Char, insertChar: Char): Char = {
    var returnChar = inputChar
    if (inputChar.equals(replaceChar)) {
      returnChar = insertChar
    }
    returnChar
  }

  def stringReplacer(inputStringOne: String, inputStringTwo: String, replaceChar: Char, insertChar: Char): String = {

    var finalString = inputStringOne + inputStringTwo
    finalString.map(letter => charChecker(letter, replaceChar, insertChar))
  }

  println(stringReplacer("Ha", "lloa", 'a', 'e'))
}