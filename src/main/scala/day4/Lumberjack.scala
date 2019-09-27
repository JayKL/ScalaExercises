package day4


object Lumberjack extends App {
  val rowSizeWoodPile: Int=3
  var amountOfLumber = 7
  var woodPile: Seq[Int] = Seq(1, 1, 1, 2, 1, 3, 1, 4, 1)
  var count=0

  def printPileOfWood(): Unit ={
    if (count % rowSizeWoodPile==0){
      print("\n")
    }
    print(woodPile(count))
    count+=1
    if (count==woodPile.size){
    } else {
      printPileOfWood()
    }
  }

  def lumberJackPileCalculator(): Unit = {
    if (amountOfLumber > 0) {
      if (count == woodPile.size) {
        count = 0
      }
      if (woodPile(count) == woodPile.min) {
        woodPile=woodPile.updated(count, woodPile(count) + 1)
        amountOfLumber -= 1
      }
      count+=1
      lumberJackPileCalculator()
    } else{
      count=0
      printPileOfWood()
    }
  }
  lumberJackPileCalculator()
}
