package typings.seneca

import typings.seneca.senecaMod.UnknownType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Actrouter extends js.Object {
  var actrouter: js.UndefOr[UnknownType] = js.undefined
  var clientrouter: js.UndefOr[UnknownType] = js.undefined
  // Close instance on these signals, if true.
  var close_signals: js.UndefOr[Anon_SIGBREAK] = js.undefined
  var subrouter: js.UndefOr[UnknownType] = js.undefined
}

object Anon_Actrouter {
  @scala.inline
  def apply(
    actrouter: UnknownType = null,
    clientrouter: UnknownType = null,
    close_signals: Anon_SIGBREAK = null,
    subrouter: UnknownType = null
  ): Anon_Actrouter = {
    val __obj = js.Dynamic.literal()
    if (actrouter != null) __obj.updateDynamic("actrouter")(actrouter.asInstanceOf[js.Any])
    if (clientrouter != null) __obj.updateDynamic("clientrouter")(clientrouter.asInstanceOf[js.Any])
    if (close_signals != null) __obj.updateDynamic("close_signals")(close_signals.asInstanceOf[js.Any])
    if (subrouter != null) __obj.updateDynamic("subrouter")(subrouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Actrouter]
  }
}

