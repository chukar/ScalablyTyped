package typings.antDashDesignDashPro

import typings.history.historyMod.LocationDescriptor
import typings.history.historyMod.LocationState
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Href extends js.Object {
  var href: js.UndefOr[LocationDescriptor[LocationState]] = js.undefined
  var innerRef: js.UndefOr[js.Function1[/* node */ HTMLAnchorElement | Null, Unit]] = js.undefined
  var replace: js.UndefOr[Boolean] = js.undefined
  var to: LocationDescriptor[LocationState]
}

object Anon_Href {
  @scala.inline
  def apply(
    to: LocationDescriptor[LocationState],
    href: LocationDescriptor[LocationState] = null,
    innerRef: /* node */ HTMLAnchorElement | Null => Unit = null,
    replace: js.UndefOr[Boolean] = js.undefined
  ): Anon_Href = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(js.Any.fromFunction1(innerRef))
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Href]
  }
}

