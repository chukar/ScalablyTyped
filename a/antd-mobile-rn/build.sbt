organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-872bac"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-fd5644",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-b24434",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-581498",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-22d23f",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20200106Z-21dc31",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-a4e222",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-c402fb",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-d447c4",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.10-d8b135",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-c8faca",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-6c83ec")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        