package typings.nodeDashZendesk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashZendeskMod {
  import typings.std.Error

  type ZendeskCallback[TResponse, TResult] = js.Function3[/* error */ js.UndefOr[Error], /* response */ TResponse, /* result */ TResult, Unit]
  type ZendeskID = Double
}
