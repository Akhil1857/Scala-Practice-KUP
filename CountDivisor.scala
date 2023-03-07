import java.io.IOException
import scala.io.StdIn._;

object CountDivisor {
  private def numberOfDivisor(num1: Int, num2: Int, divisor: Int): Int = {
    var count: Int = 0
    try {
      if (num1 > num2) {
        throw new IOException()
      } else {
        for (index <- num1 to num2) {
          if (index % divisor == 0)
            count += 1
        }
      }
    }
    return count

  }

  def main(args: Array[String]): Unit = {
    val number1: Int = readInt()
    val number2: Int = readInt()
    val divisor: Int = readInt()
    print(numberOfDivisor(number1, number2, divisor))

  }
}