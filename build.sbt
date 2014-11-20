name := "Maul"

version := "1.0"

scalaVersion := "2.10.3"

seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)

resolvers += Resolver.sonatypeRepo("public")

resolvers += "erichseifert.de" at "http://mvn.erichseifert.de/maven2"

unmanagedBase <<= baseDirectory { base => base / "project" }

libraryDependencies += "com.github.scopt" %% "scopt" % "3.2.0"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.2.2" % "test"

libraryDependencies += "com.rockymadden.stringmetric" %% "stringmetric-core" % "0.27.2"

libraryDependencies += "org.apache.commons" % "commons-math3" % "3.0"

libraryDependencies += "org.biojava" % "core" % "1.9.0-rc1"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.2.2"


scalacOptions += "-target:jvm-1.7"

// set the main class for packaging the main jar
// 'run' will still auto-detect and prompt
// change Compile to Test to set it for the test jar
mainClass in (Compile, packageBin) := Some("main.scala.Main")

// set the main class for the main 'run' task
// change Compile to Test to set it for 'test:run'
mainClass in (Compile, run) := Some("main.scala.Main")

//scalaHome := Some(file("/Users/aaronmck/scala-2.10.3/"))
