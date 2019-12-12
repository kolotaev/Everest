package com.github.kolotaev.everest

class Config {
  val database: Option[Database] = None
  val schema: Option[Schema] = None
}

class Database {
  val host: String = ""
  val port: Int = 0
  val database: String = ""
  val DSN: String = ""
}

class Schema {

}
