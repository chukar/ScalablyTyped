package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response when updating a range of values in a spreadsheet.
  */
@js.native
trait Schema$AppendValuesResponse extends js.Object {
  /**
    * The spreadsheet the updates were applied to.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
  /**
    * The range (in A1 notation) of the table that values are being appended to
    * (before the values were appended). Empty if no table was found.
    */
  var tableRange: js.UndefOr[String] = js.native
  /**
    * Information about the updates that were applied.
    */
  var updates: js.UndefOr[Schema$UpdateValuesResponse] = js.native
}

object Schema$AppendValuesResponse {
  @scala.inline
  def apply(
    spreadsheetId: String = null,
    tableRange: String = null,
    updates: Schema$UpdateValuesResponse = null
  ): Schema$AppendValuesResponse = {
    val __obj = js.Dynamic.literal()
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    if (tableRange != null) __obj.updateDynamic("tableRange")(tableRange.asInstanceOf[js.Any])
    if (updates != null) __obj.updateDynamic("updates")(updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AppendValuesResponse]
  }
}

