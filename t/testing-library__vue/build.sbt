organization := "org.scalablytyped"
name := "testing-library__vue"
version := "2.0-dt-20190816Z-08ee32"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pretty-format" % "24.9.0-dcd405",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "testing-library__dom" % "6.11-dt-20200102Z-6f63e6",
  "org.scalablytyped" %%% "vue" % "2.6.11-5182f8",
  "org.scalablytyped" %%% "vue-router" % "3.1.3-fdc49a",
  "org.scalablytyped" %%% "vuex" % "3.1.2-1df0b1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        