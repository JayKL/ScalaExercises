package day2

import scala.io.{BufferedSource, Source}

object KeyboardWordGenerator extends App {

  //def checkIfCharIsInString(inputString: String, inputChar: Char): Boolean = { removed for efficiency
   // if (inputString.count(char => char.toString.matches(inputChar.toString)) == 0) {
   //   false
   // } else {
   //   true
  //  }
 // }


 // def checkIfArrayOfCharIsInString(inputString: String, inputCharArray: Array[Char]): Boolean = { removed for efficiency
 //   var doesItContainAnyChar = false
//    if (inputCharArray.count(char => checkIfCharIsInString(inputString, char)) == 0) {
//      false
 //   } else {
 //     true
//    }
//  }

 def checkIfSetOfCharIsInStringMoreE(inputString: String, inputSetChars: Set[Char]): Boolean = {
   if (inputString.toSet.subsetOf(inputSetChars)) {
     false
   } else {
     true
   }
 }


  def findLargestWord(listOfPossibleWords: List[String], charsToBeTested: Set[Char]): String = {
  //  val arrayOfDifference = (Set('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')).diff(charsToBeTested) artifact of improvement, removed for efficiency
    listOfPossibleWords.filterNot(word => checkIfSetOfCharIsInStringMoreE(word, charsToBeTested)).maxBy(_.length) //this one had arrayOfDifference
  }

  def findLargestWordsToList(listOfPossibleWords: List[String], charsToBeTested: Set[Char]): List[String] = {
    listOfPossibleWords.filterNot(word => checkIfSetOfCharIsInStringMoreE(word, charsToBeTested)).toList
  }

  def listLargestWordsMadeByKeyboards(arrayOfCharsToCheck: Array[String], listOfPossibleWords: List[String]): List[String] = {
    arrayOfCharsToCheck.map(stringToConvertToChars => findLargestWord(listOfPossibleWords,stringToConvertToChars.toCharArray.toSet)).toList
  }

//  def listWordsMadeUpOfAtLeastOneCharacter(arrayOfChars: Array[Char], listOfPossibleWords: List[String]): Array[List[String]] = {
 //   arrayOfChars
 // }

  val listOfWordsToBeChecked: List[String] = Source.fromURL("http://norvig.com/ngrams/enable1.txt").mkString.split("\n").toList

  println("Please Input Amount of Lines to read, then the chars that are available to the keyboard")
  val arrayOfCharactersToCheck = Array.ofDim[String](scala.io.StdIn.readLine().toInt)
  println("lines to read is " + arrayOfCharactersToCheck.size)
  for (i <- 1 to arrayOfCharactersToCheck.size) {
    println("please input characters to be checked")
    arrayOfCharactersToCheck(i - 1) = scala.io.StdIn.readLine()
  }
  println("Finding largest words made by keyboards please wait")
  listLargestWordsMadeByKeyboards(arrayOfCharactersToCheck, listOfWordsToBeChecked).foreach(word => println(word))
 // listWordsMadeUpOfAtLeastOneCharacter(Array("ab"),listOfWordsToBeChecked).foreach(word => println(word))

}
