organization := "org.scalablytyped"
name := "pouch-redux-middleware"
version := "1.2-dt-20190924Z-f550f0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-e686b4",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20191111Z-0774fb",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-fb7a44",
  "org.scalablytyped" %%% "redux" % "4.0.5-eabae9",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        