class UserData(var name:String,var age:Int){
  def printName()
  {
    println(name)
  }
  def printAge
  {
    println(age)
  }
  def printDetails(): Unit =
  {
    println(name + " " + age)
  }


}
object User {
  def main(args: Array[String]): Unit = {
    var user = new UserData("Akhil", 18)
    user.printName;
    user.printAge;
    user.printDetails()
  }
}
