package com.helloworld

object Interpollation {
def main(args: Array[String]): Unit={
  var country = "India"
  var age:Int = 20
  var bankBalance: Double = 4000.67
  println(s"Country: $country, Age is $age, bankBalance: $bankBalance")
  println(f" Country: $country%s, Age is $age%d, BankBalance: $bankBalance%f")
  var myArray = Array(100,200,300,400,500)
  var i = 0
  while(i<10){
    println("i is:"+i)
    i+=1
  }
  // like each do loop
  for(n <- myArray){
    println(n)
  }
}
}
