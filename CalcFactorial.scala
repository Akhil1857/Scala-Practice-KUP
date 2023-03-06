object CalcFactorial {

  def factorial(number: Int): Int = {
    var raw = 1
    for (index<-1 to number)
    {
      raw *= index;
    }
    raw
  }
  def main(args: Array[String]): Unit = {
    println(factorial(5))

  }



}
