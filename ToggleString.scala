object ToggleString extends App {
  private val givenString: String = "KnolDus"
  private var requiredString = ""
  var index = 0
  for (index <- 0 until givenString.length) {
    if (Character.isLowerCase(givenString.charAt(index))) {
      requiredString += Character.toUpperCase(givenString.charAt(index))
    }
    else {
      requiredString += Character.toLowerCase(givenString.charAt(index))
    }
  }
  print(requiredString)
}
