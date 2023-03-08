package com.helloworld

object HelloWorld {
def main(args: Array[String]): Unit = {
 // Program for basic arithmatic operator ,logical and bitwise operator
  println("Hello to scala program....")
  var a:Int = 10
  var b:Int = 12
  var c = a + b
  var correct = true
  var incorrect  = false
  println("C:" +c)
  if (a==b)
  {
    println("a and b are same")
  }
  else
  {
    println("a and b are different!!")
  }
  println("The value of correct OR incorrect is:"+(correct || incorrect))
  println("The value of correct AND incorrect is:"+(correct && incorrect))
}
}
