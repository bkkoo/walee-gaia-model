name := """walee-gaia-model"""

version := "1.0"

scalaVersion := "2.11.1"

resolvers ++= Seq(
    "Typesafe Releases" at "http://repo.typesafe.com/typesafe/maven-releases/"
)

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
    "org.slf4j" % "slf4j-nop" % "1.6.4",
    "org.scalatest" %% "scalatest" % "2.1.6" % "test",
    "net.sourceforge.jtds" % "jtds" % "1.3.1",
    "com.typesafe.slick" %% "slick" % "2.1.0-RC3",
    "com.typesafe.slick" %% "slick-extensions" % "2.1.0-RC3"
)

