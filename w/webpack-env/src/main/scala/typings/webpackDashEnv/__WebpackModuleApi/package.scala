package typings.webpackDashEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object __WebpackModuleApi {
  type ModuleId = String | Double
  type RequireLambda = __Require1 with __Require2
  type RequireResolve = js.Function1[/* id */ String, String | Double]
  type __Require1 = js.Function1[/* id */ String, js.Any]
  type __Require2 = js.Function1[/* id */ String, js.Any]
}
