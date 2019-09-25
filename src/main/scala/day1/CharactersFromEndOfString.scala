package day1

object CharactersFromEndOfString extends App{
 def charactersFromEndOfString(stringFromEnd: String, numberOfCharactersFromEnd: Integer): String={
   val inputStringLength=stringFromEnd.length()
   stringFromEnd.substring(inputStringLength-numberOfCharactersFromEnd,inputStringLength)
 }
  println(charactersFromEndOfString("Testing",4))
}
