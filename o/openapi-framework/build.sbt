organization := "org.scalablytyped"
name := "openapi-framework"
version := "0.25.0-67e263"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.10.2-c01041",
  "org.scalablytyped" %%% "openapi-default-setter" % "2.1.0-44215a",
  "org.scalablytyped" %%% "openapi-request-coercer" % "2.3.0-ce5948",
  "org.scalablytyped" %%% "openapi-request-validator" % "4.1.0-e1b2cf",
  "org.scalablytyped" %%% "openapi-response-validator" % "4.0.0-734fc5",
  "org.scalablytyped" %%% "openapi-security-handler" % "2.0.4-f4b887",
  "org.scalablytyped" %%% "openapi-types" % "1.3.5-50e363",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "ts-log" % "2.1.4-44bdb4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        