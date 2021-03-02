object Helloworld {
  def main(args: Array[String]): Unit = {
    println("HelloWorld")
    fieldsCollector("bin:x:1:1:bin:/bin:/sbin/nologin")
  }



  def fieldsCollector(s:String) = {
    var order = s

    println(order.matches("^(#.*|[a-z]*:[^:]*:[0-9]*:[0-9]*:[^:]*:/[^:]*:/[^:]*)$"))

  }
}
