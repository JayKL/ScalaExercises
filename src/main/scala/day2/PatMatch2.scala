package day2

object PatMatch2 extends App {
  def patMatchTwo( inputIntegers: Any): Any = inputIntegers match{
    case isArrayOfInts: Array[Int]  =>
      inputIntegers match{
        case arraySizeCheck: Array[Int] if arraySizeCheck.size>2 => arraySizeCheck.take(2) match{
          case arrayVar:Array[Int] => arrayVar.reverse
        }
        case arrayVar:Array[Int] => arrayVar.reverse
        case _ => 0
      }
    case isListOfInts: List[Int] => inputIntegers match{
      case listSizeCheck: List[Int] if listSizeCheck.size>2 => listSizeCheck.take(2) match {
        case listVar: List[Int] => listVar.reverse
      }
      case listVar: List[Int] => listVar.reverse
      case _ => 0

    }
    case (a,b) => (b,a)
    case _ => (0,0)
  }
  val testArray = new Array[Int](3)
  testArray(0)=2
  testArray(1)=4
  testArray(2)=5
  val testList = 1:: 2::3::Nil
 patMatchTwo(testArray)
}
