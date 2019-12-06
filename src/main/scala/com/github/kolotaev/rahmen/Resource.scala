package com.github.kolotaev.rahmen

import java.time.Instant

case class Resource(id: String,
                    etag: String,
                    updatedAt: Instant,
                    createdAt: Instant,
                    links: Seq[Link],
                    data: Map[String, Any]) {}
