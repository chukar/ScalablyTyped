organization := "org.scalablytyped"
name := "gulp-watch"
version := "v4.1.1-dt-20190322Z-4ed7bf"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-58ecfc",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-a7bedb",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-d2df64",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20191106Z-2f6a4a",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-ff223e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        