package typings.twit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object twitMod {
  import typings.node.httpMod.IncomingMessage
  import typings.std.Error

  type Callback = js.Function3[/* err */ Error, /* result */ Response, /* response */ IncomingMessage, Unit]
  type Response = js.Object
}
