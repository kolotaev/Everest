package com.github.kolotaev.rahmen

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.http.scaladsl.server.Directives._
import akka.stream.ActorMaterializer

import scala.concurrent.ExecutionContextExecutor
import scala.io.StdIn

import java.time.Instant


object Server {
  def run(config: Config): Unit = {
    implicit val system: ActorSystem = ActorSystem("my-system")
    implicit val materializer: ActorMaterializer = ActorMaterializer()
    // needed for the future flatMap/onComplete in the end
    implicit val executionContext: ExecutionContextExecutor = system.dispatcher

    val route =
      path("hello") {
        get {
          val data = Resource(
            "asdf12", "qwert",
            now(), now(), List[Link](), Map("foo" -> 123)
          )
          complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, data.toString))
        }
      }

    val hostPort = ("0.0.0.0", 8888)
    val bindingFuture = Http().bindAndHandle(route, hostPort._1, hostPort._2)

    println(s"Server online at $hostPort\nPress RETURN to stop...")
    StdIn.readLine() // let it run until user presses return
    bindingFuture
      .flatMap(_.unbind()) // trigger unbinding from the port
      .onComplete(_ => system.terminate()) // and shutdown when done
  }

  def now(): Instant = Instant.now()
}
