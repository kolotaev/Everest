val username = "kolotaev"
val repo = "Rahmen"

name := "rahmen"
organization := s"com.github.$username"
version := "0.0.1-SNAPSHOT"

scalaVersion := "2.12.8"
javacOptions ++= Seq(
  "-source", "1.8", "-target", "1.8", "-Xlint"
)

licenses := Seq("MIT" -> url("https://opensource.org/licenses/MIT"))
homepage := Some(url(s"https://github.com/$username/$repo"))
