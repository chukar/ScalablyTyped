package typings.sipDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libApiSessionDashDescriptionDashHandlerMod {
  import typings.std.RTCSessionDescriptionInit

  type SessionDescriptionHandlerModifier = js.Function1[
    /* sessionDescription */ RTCSessionDescriptionInit, 
    js.Promise[RTCSessionDescriptionInit]
  ]
}
