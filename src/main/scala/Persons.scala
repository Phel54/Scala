
object Persons {
  def main(args: Array[String]): Unit = {
    class Persons ( val first:String, val last:String, val age:Int=23){
      def isAdult(adultThreshold:Int):Boolean=age>=adultThreshold
    }
    var p = new Persons("Phelim","Isichei")
    println(p.isAdult(26))
  }
}
