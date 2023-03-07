object AnonymousFunction {
  def main(args: Array[String]): Unit = {
    val a: Int = 12
    val b: Int =10
//    (x: Int) => // def
//      { (x: Int, y: String) =>
//        // multi line def
//      }
    val number: (Int, Int) => String = (a:Int, b:Int)=>a*b+"abc"



  }

}
