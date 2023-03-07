object ArrayProduct {
  //this function is use to find the product of all array elements.
  private def findProduct(nums: Array[Int]): Int = {
    var product: Int = 1
    for (index <- 0 to nums.length - 1) {
      product = product * nums(index)
    }
    return product
  }

  def main(args: Array[String]): Unit = {
    var index = 0
    var nums: Array[Int] = Array(1, 2, 3, 4, 5)
    val result = findProduct(nums)
    print(result)
  }
}
