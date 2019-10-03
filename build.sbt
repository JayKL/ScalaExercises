name := "ScalaExercises"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.8" % Test,
  "org.slf4j" % "slf4j-log4j12" % "1.7.25",
  "org.mongodb.scala" %% "mongo-scala-driver" % "2.6.0",
  "com.google.code.gson" % "gson" % "1.7.1",
  "org.mockito" % "mockito-core" % "3.0.0" % Test
)