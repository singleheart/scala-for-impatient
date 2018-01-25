import java.util.Calendar._

import scala.collection.mutable._

// ex 4.1
val gizmos = Map("first" -> 10, "second" -> 20)
val discounted = for ((k, v) <- gizmos) yield (k, v * 0.9)

// ex 4.2
val in = new java.util.Scanner(new java.io.File("/Users/jinn.kim/work/scala-for-impatient/myfile.txt"))
val m = scala.collection.mutable.Map[String, Int]()
while (in.hasNext()) {
  val item = in.next()
  m(item) = m.getOrElse(item, 0) + 1
}
for ((k, v) <- m) {
  println(k, v)
}

// ex 4.3
val in2 = new java.util.Scanner(new java.io.File("/Users/jinn.kim/work/scala-for-impatient/myfile.txt"))
var m2 = Map[String, Int]()
while (in2.hasNext()) {
  val item = in2.next()
  val value = m2.getOrElse(item, 0) + 1
  m2 += (item -> value)
}
for ((k, v) <- m2) {
  println(k, v)
}

// ex 4.4
val in3 = new java.util.Scanner(new java.io.File("/Users/jinn.kim/work/scala-for-impatient/myfile.txt"))
val m3 = SortedMap[String, Int]()
while (in3.hasNext()) {
  val item = in3.next()
  m3(item) = m3.getOrElse(item, 0) + 1
}
for ((k, v) <- m3) {
  println(k, v)
}

// ex 4.5
val in4 = new java.util.Scanner(new java.io.File("/Users/jinn.kim/work/scala-for-impatient/myfile.txt"))
val m4 = TreeMap[String, Int]()
while (in4.hasNext()) {
  val item = in4.next()
  m4(item) = m4.getOrElse(item, 0) + 1
}
for ((k, v) <- m4) {
  println(k, v)
}

// ex 4.6
var linkedHashMap = LinkedHashMap[String, Int]()
linkedHashMap += ("Monday" -> MONDAY)
linkedHashMap += ("Tuesday" -> TUESDAY)
linkedHashMap += ("Wednesday" -> WEDNESDAY)
linkedHashMap += ("Thursday" -> THURSDAY)
linkedHashMap += ("Friday" -> FRIDAY)
linkedHashMap += ("Saturday" -> SATURDAY)
linkedHashMap += ("Sunday" -> SUNDAY)
for ((k, v) <- linkedHashMap) {
  println(k, v)
}

// ex 4.7
val properties = System.getProperties()
var en = properties.keys()
var maxlen = 0
while (en.hasMoreElements()) {
  val e = en.nextElement()
  println(e, e.toString.length())
  maxlen = math.max(e.toString().length(), maxlen)
}

en = properties.keys()
while (en.hasMoreElements()) {
  val key = en.nextElement()
  val value = properties.get(key)
  print(key)
  for (i <- 1 to (maxlen - key.toString.length()))
    print(' ')
  print("| ")
  println(value)
}

// ex 4.8
def minmax(values: Array[Int]): (Int, Int) = {
  (values.min, values.max)
}

val (min, max) = minmax(Array(1,2,3,4,5))

// ex 4.9
def lteqgt(value: Array[Int], v: Int): (Int, Int, Int) = {
  (value.count(_ < v), value.count(_ == v), value.count(_ > v))
}

val (lt, eq, gt) = lteqgt(Array(1,2,3,4,5), 3)

// ex 4.10
for ((l, r) <- "Hello".zip("World")) {
  println("" + l + r)
}
