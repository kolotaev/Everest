package com.github.kolotaev.everest

class Config {
  val dataSources: Seq[DataSource] = List.empty
  val resources: Seq[Resource] = List.empty
}

class DataSource(
  val host: String = "",
  val port: Int = 0,
  val databaseName: String = "",
  val DSN: String = "",
  val User: String = "",
  val Password: String = ""
)

class Resource(
  val schema: Schema,
  val title: Option[String],
  val additionalLookup: Map[String, String],
  val cacheExpires: String,
  val cache: CacheOptions,
  val methods: HTTPMethod.Value
//  val dataSource: DataSource
)

class CacheOptions(val control: String, val expires: String)

class Schema(val description: String, fields: Fields)

object HTTPMethod extends Enumeration {
  val GET, POST, DELETE, PUT = Value
}

trait FieldRequirement

class Field(val )
