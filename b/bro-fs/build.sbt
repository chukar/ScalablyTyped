organization := "org.scalablytyped"
name := "bro-fs"
version := "0.4-dt-20190326Z-1ccee6"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20190322Z-ddc8db",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20190322Z-fe6ad2",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        