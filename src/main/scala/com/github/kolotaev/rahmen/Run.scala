package com.github.kolotaev.rahmen

object Run {
  def main(args: Array[String]): Unit = {
    val conf = new Config
    Server.run(conf)
  }
}
