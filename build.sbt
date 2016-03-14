name := """Tweet Fetcher (InspiringSolutions)"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies ++= {
  val akkaVersion = "2.4.2"

  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-http-experimental" % akkaVersion,
    "com.typesafe.akka" %% "akka-stream" % akkaVersion,
    "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,

    "org.json4s" %% "json4s-native" % "3.3.0",
    "com.hunorkovacs" %% "koauth" % "1.1.0",

    // logging
    "ch.qos.logback" % "logback-core" % "1.1.6",
    "ch.qos.logback" % "logback-classic" % "1.1.6",

    "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test,
    "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
    "org.scalatest" %% "scalatest" % "3.0.0-M15" % Test
  )
}

// makes compilation faster on Java 8
scalacOptions ++= Seq("-Xfatal-warnings", "-feature", "-Ybackend:GenBCode", "-Ydelambdafy:method", "-target:jvm-1.8")

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

routesGenerator := InjectedRoutesGenerator

herokuAppName in Compile := "calm-stream-23878"
