class Person {
  def main(args: Array[String]): Unit = {
    class Person ( val first:String, val last:String, val age:Int){
      val name = s"$first $last"
      println(name)
      println(s"making object for the $first $last")
    }
  }



}
