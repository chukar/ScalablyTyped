organization := "org.scalablytyped"
name := "expo"
version := "35.0.1-a5bcfc"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-fd5644",
  "org.scalablytyped" %%% "expo-asset" % "7.0.0-aaad75",
  "org.scalablytyped" %%% "expo-constants" % "7.0.1-8f5d93",
  "org.scalablytyped" %%% "expo-font" % "7.0.0-736bc3",
  "org.scalablytyped" %%% "expo-linear-gradient" % "7.0.1-68c520",
  "org.scalablytyped" %%% "expo-sqlite" % "7.0.0-82c1e8",
  "org.scalablytyped" %%% "expo__vector-icons" % "9.0-dt-20190213Z-4e1e54",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20190503Z-1bb9d3",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-b24434",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-22d23f",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20200106Z-21dc31",
  "org.scalablytyped" %%% "react-native-vector-icons" % "6.4-dt-20191220Z-45ea87",
  "org.scalablytyped" %%% "react-native-view-shot" % "2.6.0-a89487",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "unimodules__react-native-adapter" % "4.0.0-58d0a2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        