object Test {
  def main(args: Array[String]): Unit = {
   def easy_pace(x:Double): Double ={
    x* 8;
   }
   def Tempo(y: Double): Double = {
    y * 7;
   }
   
   val total_time = easy_pace(2) + Tempo(3) + easy_pace(2)

   println(s"The total time taken to running is $total_time");
  }
}

