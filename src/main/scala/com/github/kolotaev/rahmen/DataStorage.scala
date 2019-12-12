package com.github.kolotaev.rahmen


trait DataStorage {
  def find(resource: String, request: Request, lookup: Lookup, doCount: Boolean = false)
  def insert(resource: String, items: Items)
  def update(resource: String, item: Item, old: Item)
  def delete(resource: String, item: Item)
  def clear(resource: String, lookup: Lookup)
}
