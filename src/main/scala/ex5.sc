import javax.print.attribute.standard.PrinterMoreInfoManufacturer

import scala.beans.BeanProperty
// ex1

class Counter {
  private var value = 0

  def increment() {
    if (value < Int.MaxValue)
      value += 1
  }

  def current = value
}

var counter = new Counter
println(counter.current)


// ex 2
class BankAccount(private var balance: Int = 0) {
  def deposit(amount: Int) = {
    balance = amount
  }

  def withdraw() = balance
}

var account = new BankAccount()
println(account.withdraw())


// ex 3
class Time(val hours: Int, val minutes: Int) {
  def before(other: Time): Boolean = {
    this.hours < other.hours || (this.hours == other.hours && this.minutes < other.minutes)
  }
}

val aTime = new Time(12, 34)
val bTime = new Time(13, 25)
aTime before bTime

// ex 4
class Time2(val hours: Int, val minutes: Int) {
  private val minutesInADay = hours * 60 + minutes

  def before(other: Time2): Boolean = {
    this.minutesInADay < other.minutesInADay
  }
}

val aTime2 = new Time2(12, 34)
val bTime2 = new Time2(13, 25)
aTime2 before bTime2

// ex 5
class Student(@BeanProperty var name: String, @BeanProperty var id: Long) {}

// ex 6
class Person(val newAge: Int) {
  private val privateAge: Int = if (newAge >= 0) newAge else 0

  def age = privateAge
}

val p = new Person(-1)
p.age

// ex 7
class Person2(fullName: String) {
  val firstName = fullName.split(" ")(0)
  val lastName = fullName.split(" ")(1)
}

val p2 = new Person2("Fred Smith")
p2.firstName
p2.lastName

// ex 8
class Car(val manufacturer: String, val name: String) {
  private var mYear = -1
  private var mLicensePlate = ""

  def this(manufacturer: String, name: String, year: Int, licensePlate: String) {
    this(manufacturer, name)
    mYear = year
    mLicensePlate = licensePlate
  }

  def year = mYear

  def licensePlate = mLicensePlate
}

val c = new Car("Kia", "K3", 2018, "Seoul Ga 9999")
c.manufacturer
c.name
c.year
c.licensePlate

// ex 10

class Employee(val name: String = "John Q. Public", var salary: Double = 0.0) {
  val mName: String = name
  var mSalary = salary
}

