package typings.atFeathersjsExpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Html extends js.Object {
  var html: js.UndefOr[js.Any] = js.undefined
  var json: js.UndefOr[js.Any] = js.undefined
  var logger: js.UndefOr[Anon_Error] = js.undefined
  var public: js.UndefOr[String] = js.undefined
}

object Anon_Html {
  @scala.inline
  def apply(html: js.Any = null, json: js.Any = null, logger: Anon_Error = null, public: String = null): Anon_Html = {
    val __obj = js.Dynamic.literal()
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (public != null) __obj.updateDynamic("public")(public.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Html]
  }
}

