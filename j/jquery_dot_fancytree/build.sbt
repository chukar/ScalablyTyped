organization := "org.scalablytyped"
name := "jquery_dot_fancytree"
version := "2.28.2-0-dt-20191213Z-ffc49b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20191126Z-d6bfbf",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20191218Z-f43526",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-a9f7cc",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        