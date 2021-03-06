package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A data validation rule.
  */
@js.native
trait Schema$DataValidationRule extends js.Object {
  /**
    * The condition that data in the cell must match.
    */
  var condition: js.UndefOr[Schema$BooleanCondition] = js.native
  /**
    * A message to show the user when adding data to the cell.
    */
  var inputMessage: js.UndefOr[String] = js.native
  /**
    * True if the UI should be customized based on the kind of condition. If
    * true, &quot;List&quot; conditions will show a dropdown.
    */
  var showCustomUi: js.UndefOr[Boolean] = js.native
  /**
    * True if invalid data should be rejected.
    */
  var strict: js.UndefOr[Boolean] = js.native
}

object Schema$DataValidationRule {
  @scala.inline
  def apply(
    condition: Schema$BooleanCondition = null,
    inputMessage: String = null,
    showCustomUi: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined
  ): Schema$DataValidationRule = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (inputMessage != null) __obj.updateDynamic("inputMessage")(inputMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(showCustomUi)) __obj.updateDynamic("showCustomUi")(showCustomUi.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DataValidationRule]
  }
}

