package second

object profit {
    def main(args:Array[String]){
      def attendees(price:Int):Int=120+(15-price)/5*20
      def revenue(price:Int):Int=attendees(price)*price
      def cost(price:Int):Int=500+attendees(price)
      def Profit(price:Int):Int=revenue(price)-cost(price)
      
       printf("Total profit (Ticket price is Rs.15)  :Rs.")
       println(Profit(15))
       
       printf("Total profit (Ticket price is Rs.20)  :Rs.")
       println(Profit(20))
       
       printf("Total profit (Ticket price is Rs.10)  :Rs.")
       println(Profit(10))
    }
  
}