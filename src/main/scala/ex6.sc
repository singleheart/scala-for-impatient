// ex 1
object Conversions {
  def inchesToCentimeters(value: Double): Double = value * 2.54

  def gallonsToLiters(value: Double): Double = value * 3.78541

  def milesToKilometers(value: Double): Double = value * 1.60934
}

Conversions.inchesToCentimeters(1)
Conversions.gallonsToLiters(1)
Conversions.milesToKilometers(1)

// ex 2

abstract class UnitConversions {
  def convert(value: Double): Double
}

object InchesToCentimeters extends UnitConversions {
  override def convert(value: Double): Double = value * 2.54
}

object GallonsToLiters extends UnitConversions {
  override def convert(value: Double): Double = value * 3.78541
}

object MilesToKilometers extends UnitConversions {
  override def convert(value: Double): Double = value * 1.60934
}

InchesToCentimeters.convert(1)
GallonsToLiters.convert(1)
MilesToKilometers.convert(1)

// ex 3
// static instance is appropriate for Origin

// ex 4
class Point(val x: Int, val y: Int) {
}

object Point {
  def apply(x: Int, y: Int) = new Point(x, y)
}

val p = Point(3, 4)

// ex 5
// Reverse.sc

// ex 6
object PlayingCardSuits extends Enumeration {
  type PlayingCardSuits = Value

  val CLUB = Value("♣")
  val DIAMOND = Value("♦")
  val HEART = Value("♥")
  val SPADE = Value("♠")
}

// ex 7
def checkRed(card: PlayingCardSuits.PlayingCardSuits) = {
  card == PlayingCardSuits.DIAMOND || card == PlayingCardSuits.HEART
}

// ex 8
object RGBColorCube extends Enumeration {
  val BLACK = Value(0x000000)
  val BLUE = Value(0x0000ff)
  val GREEN = Value(0x00ff00)
  val CYAN = Value(0x00ffff)
  val RED = Value(0xff0000)
  val MAGENTA = Value(0xff00ff)
  val YELLOW = Value(0xffff00)
  val WHITE = Value(0xffffff)
}
