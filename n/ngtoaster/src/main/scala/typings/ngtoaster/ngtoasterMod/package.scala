package typings.ngtoaster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ngtoasterMod {
  import typings.std.Event

  type IToastCallback = js.Function1[/* toast */ IToast, Unit]
  type IToastEventListener = js.Function3[/* event */ Event, /* toasterId */ Double, /* toastId */ String | Double, Unit]
}
