package typings.reactDashIntl.reactDashIntlMod

import typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod.MessageFormatElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntlConfig extends js.Object {
  var defaultFormats: CustomFormats
  var defaultLocale: String
  var formats: CustomFormats
  var locale: String
  var messages: Record[String, js.Array[MessageFormatElement] | String]
  var textComponent: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any
  ] = js.undefined
  var timeZone: js.UndefOr[String] = js.undefined
  def onError(err: String): Unit
}

object IntlConfig {
  @scala.inline
  def apply(
    defaultFormats: CustomFormats,
    defaultLocale: String,
    formats: CustomFormats,
    locale: String,
    messages: Record[String, js.Array[MessageFormatElement] | String],
    onError: String => Unit,
    textComponent: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any = null,
    timeZone: String = null
  ): IntlConfig = {
    val __obj = js.Dynamic.literal(defaultFormats = defaultFormats.asInstanceOf[js.Any], defaultLocale = defaultLocale.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError))
    if (textComponent != null) __obj.updateDynamic("textComponent")(textComponent.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntlConfig]
  }
}

