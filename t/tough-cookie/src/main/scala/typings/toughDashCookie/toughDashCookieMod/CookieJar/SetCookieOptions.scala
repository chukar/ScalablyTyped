package typings.toughDashCookie.toughDashCookieMod.CookieJar

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetCookieOptions extends js.Object {
  var http: js.UndefOr[Boolean] = js.undefined
  var ignoreError: js.UndefOr[Boolean] = js.undefined
  var now: js.UndefOr[Date] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
}

object SetCookieOptions {
  @scala.inline
  def apply(
    http: js.UndefOr[Boolean] = js.undefined,
    ignoreError: js.UndefOr[Boolean] = js.undefined,
    now: Date = null,
    secure: js.UndefOr[Boolean] = js.undefined
  ): SetCookieOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(http)) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreError)) __obj.updateDynamic("ignoreError")(ignoreError.asInstanceOf[js.Any])
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCookieOptions]
  }
}

