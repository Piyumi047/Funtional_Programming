package second

object Salary {
   def main(args:Array[String]){
     def Normalpayment(hours:Int):Int=hours*150
     def OTpayment(hours:Int):Int=hours*75
     def income(h1:Int,h2:Int):Int=Normalpayment(h1)+OTpayment(h2)
     def tax(h1:Int,h2:Int):Double=income(h1,h2)*0.1
     def TakehomeSalary(h1:Int,h2:Int):Double=income(h1,h2)-tax(h1,h2)
      println("Take home salary of an Employee :")
      print(TakehomeSalary(40,20))
   }
}