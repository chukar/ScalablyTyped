package typings.atIonicCliDashFramework.libExecutorMod

import typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.json
import typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseExecutorFormatHelpOptions extends js.Object {
  var format: js.UndefOr[terminal | json] = js.undefined
}

object BaseExecutorFormatHelpOptions {
  @scala.inline
  def apply(format: terminal | json = null): BaseExecutorFormatHelpOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseExecutorFormatHelpOptions]
  }
}

