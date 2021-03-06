package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A custom error rule.
  */
@js.native
trait Schema$CustomErrorRule extends js.Object {
  /**
    * Mark this message as possible payload in error response.  Otherwise,
    * objects of this type will be filtered when they appear in error payload.
    */
  var isErrorType: js.UndefOr[Boolean] = js.native
  /**
    * Selects messages to which this rule applies.  Refer to selector for
    * syntax details.
    */
  var selector: js.UndefOr[String] = js.native
}

object Schema$CustomErrorRule {
  @scala.inline
  def apply(isErrorType: js.UndefOr[Boolean] = js.undefined, selector: String = null): Schema$CustomErrorRule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isErrorType)) __obj.updateDynamic("isErrorType")(isErrorType.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomErrorRule]
  }
}

