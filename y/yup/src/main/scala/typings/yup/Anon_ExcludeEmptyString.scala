package typings.yup

import typings.yup.yupMod.TestOptionsMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExcludeEmptyString extends js.Object {
  var excludeEmptyString: js.UndefOr[Boolean] = js.undefined
  var message: js.UndefOr[TestOptionsMessage[Anon_Regex, _]] = js.undefined
}

object Anon_ExcludeEmptyString {
  @scala.inline
  def apply(
    excludeEmptyString: js.UndefOr[Boolean] = js.undefined,
    message: TestOptionsMessage[Anon_Regex, _] = null
  ): Anon_ExcludeEmptyString = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeEmptyString)) __obj.updateDynamic("excludeEmptyString")(excludeEmptyString.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExcludeEmptyString]
  }
}

