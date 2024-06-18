object Test{
  def main(args: Array[String]): Unit = {
    def priceOfBook(x:Int): Double ={
        24.95*x;
    }
    def discount_price(amount:Double): Double ={
        amount * .4;
    }

    def shippingCost(No_of_books : Int): Double = {
        50 * 3 + (No_of_books - 50) * 0.75;
    }

    val total_wholsale = priceOfBook(60) + shippingCost(60) - discount_price(priceOfBook(60))
    print(s"The total cost for book is: $total_wholsale" )

    }
}