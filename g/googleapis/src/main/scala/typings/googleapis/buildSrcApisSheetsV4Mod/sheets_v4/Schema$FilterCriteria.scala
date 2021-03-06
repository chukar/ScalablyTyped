package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Criteria for showing/hiding rows in a filter or filter view.
  */
@js.native
trait Schema$FilterCriteria extends js.Object {
  /**
    * A condition that must be true for values to be shown. (This does not
    * override hiddenValues -- if a value is listed there,  it will still be
    * hidden.)
    */
  var condition: js.UndefOr[Schema$BooleanCondition] = js.native
  /**
    * Values that should be hidden.
    */
  var hiddenValues: js.UndefOr[js.Array[String]] = js.native
}

object Schema$FilterCriteria {
  @scala.inline
  def apply(condition: Schema$BooleanCondition = null, hiddenValues: js.Array[String] = null): Schema$FilterCriteria = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (hiddenValues != null) __obj.updateDynamic("hiddenValues")(hiddenValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FilterCriteria]
  }
}

