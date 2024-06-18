object temperature_in_c{
  def main(args: Array[String]): Unit = {
   
    def temperature(x: Double): Double = {
      x * 1.8000 + 32.00
    }

    // Calculating the area
    val Fahr =temperature(35)
    print(s"The temperature of 35 in fahrenhrit: $Fahr")
  }
}