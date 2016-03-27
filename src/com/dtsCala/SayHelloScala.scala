package com.dtsCala

/**
 * @author Zachary
 */
object SayHelloScala {
  def main(args:Array[String]):Unit={
    print("Hello Scala!")
    for(arg <- args) println(arg)
  }
}