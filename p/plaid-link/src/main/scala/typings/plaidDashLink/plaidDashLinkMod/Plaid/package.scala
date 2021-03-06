package typings.plaidDashLink.plaidDashLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Plaid {
  type OnEvent = js.Function2[/* eventName */ EventName, /* metadata */ OnEventMetaData, Unit]
  type OnExit = js.Function2[/* error */ Error | Null, /* metadata */ OnExitMetaData, Unit]
  type OnLoad = js.Function0[Unit]
  type OnSuccess = js.Function2[/* public_token */ String, /* metadata */ OnSuccessMetaData, Unit]
}
