
sealed trait Person {
  def name: String
  def surname: String
  def address: String
  def address_=(addr: String): Unit
}

case class Student(name:String, surname: String, private var _address: String) extends Person {

  override def address: String = this._address

  override def address_=(addr: String): Unit = this._address = addr
}


object TestApp extends App {

  val student = Student("Francesco", "Grandinetti", "via x")

  student.address = "Via zaccherini 25"

  println(student)

}