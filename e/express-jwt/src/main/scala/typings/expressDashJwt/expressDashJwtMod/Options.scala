package typings.expressDashJwt.expressDashJwtMod

import org.scalablytyped.runtime.StringDictionary
import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends /* property */ StringDictionary[js.Any] {
  var credentialsRequired: js.UndefOr[Boolean] = js.undefined
  var getToken: js.UndefOr[GetTokenCallback] = js.undefined
  var isRevoked: js.UndefOr[IsRevokedCallback] = js.undefined
  var requestProperty: js.UndefOr[String] = js.undefined
  var secret: secretType | SecretCallback | SecretCallbackLong
  var userProperty: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    secret: secretType | SecretCallback | SecretCallbackLong,
    StringDictionary: /* property */ StringDictionary[js.Any] = null,
    credentialsRequired: js.UndefOr[Boolean] = js.undefined,
    getToken: /* req */ Request[ParamsDictionary] => js.Any = null,
    isRevoked: (/* req */ Request[ParamsDictionary], /* payload */ js.Any, /* done */ js.Function2[/* err */ js.Any, /* revoked */ js.UndefOr[Boolean], Unit]) => Unit = null,
    requestProperty: String = null,
    userProperty: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(credentialsRequired)) __obj.updateDynamic("credentialsRequired")(credentialsRequired.asInstanceOf[js.Any])
    if (getToken != null) __obj.updateDynamic("getToken")(js.Any.fromFunction1(getToken))
    if (isRevoked != null) __obj.updateDynamic("isRevoked")(js.Any.fromFunction3(isRevoked))
    if (requestProperty != null) __obj.updateDynamic("requestProperty")(requestProperty.asInstanceOf[js.Any])
    if (userProperty != null) __obj.updateDynamic("userProperty")(userProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

