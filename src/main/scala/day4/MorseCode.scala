package day4

object MorseCode extends App {

  def convertMorseSentence(sentenceToBeTranslated: String): String ={
    sentenceToBeTranslated.split(" / ").map(word => convertMorseWord(word)).mkString(" ")
  }

  def convertMorseWord(wordToBeTranslated: String): String={
    wordToBeTranslated.split(" ").map(letter => convertMorseAlphabet(letter)).mkString("")
  }

  def convertMorseAlphabet(letterToBeTranslated: String): String={
    letterToBeTranslated match{
      case ".-" => "A"
      case "-..." => "B"
      case "-.-." => "C"
      case "-.." => "D"
      case "." => "E"
      case "..-." => "F"
      case "--." => "G"
      case "...." => "H"
      case ".." => "I"
      case ".---" => "J"
      case "-.-" => "K"
      case ".-.." => "L"
      case "--" => "M"
      case "-." => "N"
      case "---" => "O"
      case ".--." => "P"
      case "--.-" => "Q"
      case ".-." => "R"
      case "..." => "S"
      case "-" => "T"
      case "..-" => "U"
      case "...-" => "V"
      case ".--" => "W"
      case "-..-" => "X"
      case "-.--" => "Y"
      case "--.." => "Z"
    }
  }

  print(convertMorseSentence("... -.-. .- .-.. .- / .. ... / ..-. ..- -."))

}
