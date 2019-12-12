val username = "kolotaev"
val repo = "Everest"

name := "everest"
organization := s"com.github.$username"
version := "0.0.1-SNAPSHOT"

scalaVersion := "2.12.8"
javacOptions ++= Seq(
  "-source", "1.8", "-target", "1.8", "-Xlint"
)

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http"   % "10.1.11",
  "com.typesafe.akka" %% "akka-stream" % "2.5.26", // or whatever the latest version is

  "org.scalatest" %% "scalatest" % "3.0.4" % "test"
)

licenses := Seq("MIT" -> url("https://opensource.org/licenses/MIT"))
homepage := Some(url(s"https://github.com/$username/$repo"))
