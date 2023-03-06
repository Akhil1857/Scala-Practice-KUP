object StringPalindrome {
  //palindromeCheck Function is use to check whether the string is palindrome or not
  def palindromeCheck(letter: String, letterLength: Int): Int = {
    for (index <- 0 to letterLength) {
      if (letter.charAt(index) != letter.charAt(letterLength - index))
        return 0;
    }
    return 1;
  }

  def main(args: Array[String]): Unit = {
    val letter = scala.io.StdIn.readLine("Enter the String ")
    val letterLength: Int = letter.length() - 1
    try {
      var result = palindromeCheck(letter, letterLength)
      if (result == 0)
        print("NO")
      else
        print("YES")
    }
    catch {
      case a: Exception => {
        println("IOException occurred.")
      }
    }
  }
}
