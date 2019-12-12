package com.github.kolotaev.everest

import scala.concurrent.Future

/**
 * Generic interface for particular DB backends.
 */
trait DataStorage {
  /**
   * Find resource items that match a lookup query.
   */
  def find(resource: String, request: Request, lookup: Lookup, doCount: Boolean = false): Future[Items]

  /**
   * Insert resource items into a data storage.
   */
  def insert(resource: String, items: Items): Future[Item]

  /**
   * Update particular resource item.
   */
  def update(resource: String, item: Item, old: Item): Future[Boolean]

  /**
   * Delete resource item
   */
  def delete(resource: String, item: Item): Future[String]

  /**
   * Remove resource items from the storage that match a lookup query.
   */
  def clear(resource: String, lookup: Lookup): Future[Long]
}
