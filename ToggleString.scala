import java.util.InputMismatchException
import scala.io.StdIn.readLine

object ToggleString extends App {
  def stringConversion(givenString: String): String = {
    var index = 0
    var requiredString = ""
    for (index <- 0 until givenString.length) {
      if (Character.isLowerCase(givenString.charAt(index))) {
        requiredString += Character.toUpperCase(givenString.charAt(index))
      }
      else {
        requiredString += Character.toLowerCase(givenString.charAt(index))
      }
    }
    return requiredString
  }

  val givenString: String = readLine("Enter the String: ")
  try {
    if (givenString.isEmpty) {
      throw new NullPointerException()
    }
  } catch {
    case e: NullPointerException => println("Please enter the valid String it can not be "+e.getMessage)
  }
  print(stringConversion(givenString))
}
