package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportingMenuObject extends js.Object {
  /**
    * The click handler for the menu item.
    */
  var onclick: js.UndefOr[EventCallbackFunction[Chart]] = js.undefined
  /**
    * Indicates a separator line instead of an item.
    */
  var separator: js.UndefOr[Boolean] = js.undefined
  /**
    * The text for the menu item.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * If internationalization is required, the key to a language string.
    */
  var textKey: js.UndefOr[String] = js.undefined
}

object ExportingMenuObject {
  @scala.inline
  def apply(
    onclick: EventCallbackFunction[Chart] = null,
    separator: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    textKey: String = null
  ): ExportingMenuObject = {
    val __obj = js.Dynamic.literal()
    if (onclick != null) __obj.updateDynamic("onclick")(onclick.asInstanceOf[js.Any])
    if (!js.isUndefined(separator)) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textKey != null) __obj.updateDynamic("textKey")(textKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportingMenuObject]
  }
}

