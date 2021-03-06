package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollEndEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** parameters from RangeNavigator
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** returns the scrollbar position new start and end range value on change end of scrollbar
    */
  var dataNewRange: js.UndefOr[js.Any] = js.undefined
  /** returns the scrollbar position old start and end range value on change end of scrollbar
    */
  var dataOldRange: js.UndefOr[js.Any] = js.undefined
  /** returns the RangeNavigator model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ScrollEndEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    dataNewRange: js.Any = null,
    dataOldRange: js.Any = null,
    model: js.Any = null,
    `type`: String = null
  ): ScrollEndEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataNewRange != null) __obj.updateDynamic("dataNewRange")(dataNewRange.asInstanceOf[js.Any])
    if (dataOldRange != null) __obj.updateDynamic("dataOldRange")(dataOldRange.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollEndEventArgs]
  }
}

