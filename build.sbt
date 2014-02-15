// Turn this project into a Scala.js project by importing these settings
scalaJSSettings

name := "SideScroller"

version := "0.1-SNAPSHOT"

libraryDependencies ++= Seq(
    "org.scala-lang.modules.scalajs" %% "scalajs-dom" % "0.2"
)

// Specify additional .js file to be passed to package-js and optimize-js
unmanagedSources in (Compile, ScalaJSKeys.packageJS) +=
    baseDirectory.value / "js" / "startup.js"
