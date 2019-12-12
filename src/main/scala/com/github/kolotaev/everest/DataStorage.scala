package com.github.kolotaev.everest


/**
 * Generic interface for particular DB backends.
 */
trait DataStorage {
  /**
   * Find resource items that match a lookup query.
   */
  def find(resource: String, request: Request, lookup: Lookup, doCount: Boolean = false)

  /**
   * Insert resource items into a data storage.
   */
  def insert(resource: String, items: Items)

  /**
   * Update particular resource item.
   */
  def update(resource: String, item: Item, old: Item)

  /**
   * Delete resource item
   */
  def delete(resource: String, item: Item)

  /**
   * Remove resource items from the storage that match a lookup query.
   */
  def clear(resource: String, lookup: Lookup)
}
