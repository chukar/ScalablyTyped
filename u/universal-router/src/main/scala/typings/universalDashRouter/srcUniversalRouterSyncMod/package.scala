package typings.universalDashRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcUniversalRouterSyncMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error
  import typings.universalDashRouter.Anon_Status

  type Context = StringDictionary[js.Any]
  type ErrorHandler[C /* <: Context */, R] = js.Function2[
    /* error */ Error with Anon_Status, 
    /* context */ C with (RouteContext[C, R]), 
    Result[R]
  ]
  type QueryParams = StringDictionary[String | js.Array[String]]
  type ResolveRoute[C /* <: Context */, R] = js.Function2[/* context */ C with (RouteContext[C, R]), /* params */ QueryParams, Result[R]]
  type Result[T] = T | Unit
  type Routes[C /* <: Context */, R] = js.Array[Route[C, R]]
}
