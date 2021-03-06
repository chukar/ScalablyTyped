organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-3bbb07"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "7.0-dt-20190909Z-df0bcb",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-1eb125",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-876138",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-261c86",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-9b016c",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "svgo" % "1.3-dt-20190927Z-11e3a6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        