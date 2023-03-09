import sun.jvm.hotspot.HelloWorld.e

import java.util.InputMismatchException
import scala.io.StdIn.readInt

object Profile_Picture extends App {
  private def operationOnPicture(lengthOfPicture: Int, widthOfPicture: Int, heightOfPicture: Int): String = {

    if (widthOfPicture < lengthOfPicture || heightOfPicture < lengthOfPicture) {
      "Upload Another one"
    }
    else {
      if (widthOfPicture == heightOfPicture) {
        "Accepted"
      }
      else
        "CROP IT"
    }
  }

  try {
    println("Enter the number of photos")
    val noOfPicture = readInt()
    for (index <- 1 to noOfPicture) {
      print("Enter the length:-")
      val lengthOfPicture: Int = readInt()
      print("Enter the width:-")
      val widthOfPicture: Int = readInt()
      print("Enter the height:-")
      val heightOfPicture: Int = readInt()
      print(operationOnPicture(lengthOfPicture, widthOfPicture, heightOfPicture))
    }
  }
  catch {
    case exception: Exception => println("Error occured " + exception.getMessage)
  }
}

