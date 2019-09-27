package day3

object FunctionalOne extends App {
 java.util.TimeZone.getAvailableIDs.map(word => word.split("/").toList).toList.filter(word => word.size == 2).grouped(10).map(word => word(0)).map(word => word(1)).foreach(word => println(word))
}
