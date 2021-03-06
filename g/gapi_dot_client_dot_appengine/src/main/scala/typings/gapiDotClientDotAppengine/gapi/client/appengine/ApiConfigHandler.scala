package typings.gapiDotClientDotAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiConfigHandler extends js.Object {
  /** Action to take when users access resources that require authentication. Defaults to redirect. */
  var authFailAction: js.UndefOr[String] = js.undefined
  /** Level of login required to access this resource. Defaults to optional. */
  var login: js.UndefOr[String] = js.undefined
  /** Path to the script from the application root directory. */
  var script: js.UndefOr[String] = js.undefined
  /** Security (HTTPS) enforcement for this URL. */
  var securityLevel: js.UndefOr[String] = js.undefined
  /** URL to serve the endpoint at. */
  var url: js.UndefOr[String] = js.undefined
}

object ApiConfigHandler {
  @scala.inline
  def apply(
    authFailAction: String = null,
    login: String = null,
    script: String = null,
    securityLevel: String = null,
    url: String = null
  ): ApiConfigHandler = {
    val __obj = js.Dynamic.literal()
    if (authFailAction != null) __obj.updateDynamic("authFailAction")(authFailAction.asInstanceOf[js.Any])
    if (login != null) __obj.updateDynamic("login")(login.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    if (securityLevel != null) __obj.updateDynamic("securityLevel")(securityLevel.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiConfigHandler]
  }
}

