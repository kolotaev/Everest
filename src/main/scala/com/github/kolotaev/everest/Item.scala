package com.github.kolotaev.everest

import java.time.Instant

case class Item(id: String,
                etag: String,
                updatedAt: Instant,
                createdAt: Instant,
                links: Seq[Link],
                data: Map[String, Any])
