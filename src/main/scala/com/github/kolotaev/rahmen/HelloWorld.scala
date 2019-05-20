package com.github.kolotaev.rahmen

object HelloWorld extends App {
  Console.println("Hello World!")
  val m = Map(1 -> 100)
  val t = m.getOrElse(1, default={
    throw new Exception("tt")
  })
  Console.println(t)
}
