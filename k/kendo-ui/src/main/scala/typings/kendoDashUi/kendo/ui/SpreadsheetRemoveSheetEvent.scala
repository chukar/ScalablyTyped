package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.kendo.spreadsheet.Sheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetRemoveSheetEvent extends SpreadsheetEvent {
  var sheet: js.UndefOr[Sheet] = js.undefined
}

object SpreadsheetRemoveSheetEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Spreadsheet,
    sheet: Sheet = null
  ): SpreadsheetRemoveSheetEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (sheet != null) __obj.updateDynamic("sheet")(sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetRemoveSheetEvent]
  }
}

