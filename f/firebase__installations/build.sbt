organization := "org.scalablytyped"
name := "firebase__installations"
version := "0.3.8-c67a17"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.5.0-a2ef83",
  "org.scalablytyped" %%% "firebase__component" % "0.1.1-d097a0",
  "org.scalablytyped" %%% "firebase__installations-types" % "0.2.4-726b9f",
  "org.scalablytyped" %%% "firebase__util" % "0.2.36-0149a2",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        