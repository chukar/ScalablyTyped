package typings.telebot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorMessageString extends js.Object {
  var errorMessage: js.UndefOr[String] = js.undefined
}

object Anon_ErrorMessageString {
  @scala.inline
  def apply(errorMessage: String = null): Anon_ErrorMessageString = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorMessageString]
  }
}

