object scalaPractice {
  private def check(str: String, len: Int): Int = {
    for (index <- 0 to len) {
      if (str.charAt(index).isDigit) {
        return 0
      }
    }
    return 1
  }

  def main(args: Array[String]): Unit = {
    val str: String = "Knoldus3"
    val strlen: Int = str.length - 1
    var res: Int = check(str, strlen)
    if (res == 0)
      print("True")
    else
      print("false")
  }
}
