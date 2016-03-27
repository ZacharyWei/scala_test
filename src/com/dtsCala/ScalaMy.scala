package com.dtsCala

/**
 * @author Zachary
 */
object ScalaMy {
  def main(args: Array[String]):Unit={
    print("hello world,you are my sunshine in the Summer"+" 3+4="+(test(3,4)))
    println()
    print(test(7,8))
  }
  def test(x:Int,y:Int):Int={
    return x+y
  }
}