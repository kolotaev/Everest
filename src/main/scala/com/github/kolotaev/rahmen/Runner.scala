package com.github.kolotaev.rahmen

import com.github.kolotaev.rahmen.configurator.Config

// todo - delete me when there won't be a need for development
object Runner {
  def main(args: Array[String]): Unit = {
    val conf = new Config()
    Server.run(conf)
  }
}
