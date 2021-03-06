package typings.amqpDashConnectionDashManager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object amqpDashConnectionDashManagerMod {
  import typings.amqplib.amqplibMod.ConfirmChannel
  import typings.std.Error

  type SetupFunc = (js.Function2[
    /* channel */ ConfirmChannel, 
    /* callback */ js.Function1[/* error */ js.UndefOr[Error], Unit], 
    Unit
  ]) | (js.Function1[/* channel */ ConfirmChannel, js.Promise[Unit]])
}
