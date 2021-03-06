organization := "org.scalablytyped"
name := "babel-core"
version := "6.25-dt-20190212Z-f340a7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-0d163d",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-7cacd7",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-b9f457",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-abb515",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-606154",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        