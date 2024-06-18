object CircleAreaCalculator {
  def main(args: Array[String]): Unit = {
   
    def calculateArea(radius: Double): Double = {
      math.Pi * math.pow(radius, 2)
    }

    // Calculating the area
    val area = calculateArea(5)
    println(s"The area of circle with radius 5 is: $area")
  }
}

