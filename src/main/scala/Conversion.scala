import java.text.SimpleDateFormat


object Conversion {


  def convert(c:Int): Unit = {
   var f = (c * 9 / 5) + 32
    println(f)
  }

  def dateConvert(s: String): Unit ={
    var dateformat = new SimpleDateFormat("dd/mm/yyyy")
    var date = dateformat.parse(s)

    println("Converted date is " + date)
  }

  def main(args: Array[String]): Unit = {
  convert(300)
    dateConvert("01/02/15")
  }

}
