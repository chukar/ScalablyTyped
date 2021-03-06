organization := "org.scalablytyped"
name := "p-any"
version := "2.1.0-86c66b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aggregate-error" % "3.0.1-c0b27d",
  "org.scalablytyped" %%% "p-cancelable" % "2.0.0-db39ba",
  "org.scalablytyped" %%% "p-some" % "4.1.0-256b8a",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "type-fest" % "0.3.1-67675f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        