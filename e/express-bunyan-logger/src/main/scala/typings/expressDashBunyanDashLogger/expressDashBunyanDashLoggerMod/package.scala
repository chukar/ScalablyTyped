package typings.expressDashBunyanDashLogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashBunyanDashLoggerMod {
  import typings.express.expressMod.Request
  import typings.express.expressMod.Response
  import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
  import typings.std.Error

  type FormatFunction = js.Function1[/* meta */ js.Any, String]
  type IncludesFunction = js.Function2[/* req */ Request[ParamsDictionary], /* res */ Response, js.Any]
  type LevelFunction = js.Function3[/* status */ Double, /* err */ Error | Null, /* meta */ js.Any, String]
  type RequestIdGenFunction = js.Function1[/* req */ Request[ParamsDictionary], String]
}
