package typings.avoscloudDashSdk.avoscloudDashSdkMod.Object

import typings.avoscloudDashSdk.avoscloudDashSdkMod.ErrorOption
import typings.avoscloudDashSdk.avoscloudDashSdkMod.SilentOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOptions
  extends ErrorOption
     with SilentOption {
  var promise: js.UndefOr[js.Any] = js.undefined
}

object SetOptions {
  @scala.inline
  def apply(error: js.Function = null, promise: js.Any = null, silent: js.UndefOr[Boolean] = js.undefined): SetOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOptions]
  }
}

