package typings.parse.parseMod._Global_.Parse.Push

import typings.parse.parseMod._Global_.Parse.Error
import typings.parse.parseMod._Global_.Parse.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendOptions extends UseMasterKeyOption {
  var error: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object SendOptions {
  @scala.inline
  def apply(
    error: /* error */ Error => Unit = null,
    success: () => Unit = null,
    useMasterKey: js.UndefOr[Boolean] = js.undefined
  ): SendOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendOptions]
  }
}

