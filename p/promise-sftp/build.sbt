organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20190819Z-93c0f7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-71aa02",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-f4dbec",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20190903Z-2524cb",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190322Z-6cfea1",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        