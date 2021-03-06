package typings.gestalt.gestaltMod

import typings.gestalt.Anon_ActiveTabIndex
import typings.gestalt.Anon_Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends js.Object {
  var activeTabIndex: Double
  var tabs: js.Array[Anon_Href]
  var wrap: js.UndefOr[Boolean] = js.undefined
  def onChange(args: Anon_ActiveTabIndex): Unit
}

object TabsProps {
  @scala.inline
  def apply(
    activeTabIndex: Double,
    onChange: Anon_ActiveTabIndex => Unit,
    tabs: js.Array[Anon_Href],
    wrap: js.UndefOr[Boolean] = js.undefined
  ): TabsProps = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), tabs = tabs.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
}

