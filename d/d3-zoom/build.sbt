organization := "org.scalablytyped"
name := "d3-zoom"
version := "1.7-dt-20190212Z-4a0b1b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-2e36d3",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-565c06",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-181e16",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        