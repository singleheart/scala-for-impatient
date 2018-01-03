import java.awt.datatransfer._

import scala.collection.mutable

// ex 3.1

val n = 5
val a = (for (i <- 1 to n) yield scala.util.Random.nextInt(n)).toArray

// ex 3.2
var ar = Array(1, 2, 3, 4, 5)

for (i <- 1 until ar.length by 2) {
  if (i + 1 != ar.length && i % 2 == 1) {
    val temp = ar(i - 1)
    ar(i - 1) = ar(i)
    ar(i) = temp
  }
}

ar

// ex 3.3
var ar2 = (for (i <- 0 until ar.length) yield {
  if (i % 2 == 1) {
    ar(i - 1)
  } else if (i + 1 == ar.length) {
    ar(i)
  } else {
    ar(i + 1)
  }
}).toArray

// ex 3.4
val ar3 = Array(1, -1, 0, 3, 3, -3, 0, 5)
ar3.filter(x => x > 0) ++ ar3.filter(x => x <= 0)

// ex 3.5
val ar4 = Array(78.5, 80.5, 77.0, 83.0)
val average = ar4.sum / ar4.length

// ex 3.6
ar3.sortWith((x, y) => x > y)

var buffer1 = ar3.toBuffer
buffer1.sorted.reverse

// ex 3.7
ar3.distinct

// ex 3.8

// ex 3.9
ar3.takeWhile(x => x > 0)

// ex 3.10
var am = java.util.TimeZone.getAvailableIDs().filter(s => s.startsWith("America")).transform(s => s.substring(8)).sorted

// ex 3.11

val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
var buffer: mutable.Buffer[String] = collection.JavaConverters.asScalaBuffer(flavors.getNativesForFlavor(DataFlavor.imageFlavor))
