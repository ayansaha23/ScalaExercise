package com.helloworld

object Action {
  def main(args: Array[String]): Unit = {
    println("Hi starting action operations....")
    //Perform even ,odd ,looping through arrays and performing range operations
    println("Please enter a value:")
    val num:Int = scala.io.StdIn.readInt()
    // check if even or odd
    if (num%2 == 0){
      println("The number is even")
    }
    else{
      println("The number is odd")
    }
   var name = "ayan"
    println(s"$name is a leader")
  }

}
