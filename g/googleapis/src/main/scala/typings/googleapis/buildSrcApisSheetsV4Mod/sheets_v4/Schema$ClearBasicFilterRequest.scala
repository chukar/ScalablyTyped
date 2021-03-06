package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Clears the basic filter, if any exists on the sheet.
  */
@js.native
trait Schema$ClearBasicFilterRequest extends js.Object {
  /**
    * The sheet ID on which the basic filter should be cleared.
    */
  var sheetId: js.UndefOr[Double] = js.native
}

object Schema$ClearBasicFilterRequest {
  @scala.inline
  def apply(sheetId: Int | Double = null): Schema$ClearBasicFilterRequest = {
    val __obj = js.Dynamic.literal()
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ClearBasicFilterRequest]
  }
}

