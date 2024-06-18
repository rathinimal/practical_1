object volume_sphere{
  def main(args: Array[String]): Unit = {
   
    def volume(r: Int): Double = {
        4/3*math.Pi * math.pow(r,3)
    }

    // Calculating the area
    val v1 = volume(5)
    print(s"The volume of sphere with radius 5 is: $v1")
  }
}