package com.helloworld

object Operation {
  def main(args: Array[String]): Unit ={
    // normal function with name and age input and print them
    println(intro("Ayan",10))
    // factorial function
    println("Factorial is: "+fact(5))
    // fibonacci
    println("Fibonacci series is:"+fib(5))
    //Prime
    println("Prime?:"+isPrime(81))
    println("Prime?:"+isPrime(23))
  }
 def intro(name: String,age: Int): String = {
  s"Hello my name is $name and age is $age"
 }
  def fact(num: Int): Int = {
    if (num <=1)
       1
    else
      (num*fact(num-1))
  }

  def fib(num: Int): Int = {
    if (num<=2)
      1
    else {
      fib(num-1) + fib(num-2)
    }
  }

  def isPrime(num:Int):Boolean = {
    //auxiliary func
    def isPrimeUntil(t: Int): Boolean={
        if (t<=1) true
        else (num%t!=0 && isPrimeUntil(t-1))
    }
    isPrimeUntil(num/2)
  }
}


