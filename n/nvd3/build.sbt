organization := "org.scalablytyped"
name := "nvd3"
version := "1.8.1-dt-20190322Z-12a6a1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-1894e4",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-181e16",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20191029Z-8c194d",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        