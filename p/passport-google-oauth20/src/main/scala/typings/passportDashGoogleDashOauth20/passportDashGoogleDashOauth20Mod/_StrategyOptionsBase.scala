package typings.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<'authorizationURL' | 'tokenURL' | 'clientID' | 'clientSecret' | 'callbackURL' | 'customHeaders' | 'scope' | 'scopeSeparator' | 'sessionKey' | 'store' | 'state', 'authorizationURL' | 'tokenURL'> ]: passport-oauth2.passport-oauth2._StrategyOptionsBase[P]} */ trait _StrategyOptionsBase extends js.Object {
  var authorizationURL: js.UndefOr[String] = js.undefined
  var callbackURL: js.UndefOr[String] = js.undefined
  var clientID: String
  var clientSecret: String
  var scope: js.UndefOr[String | js.Array[String]] = js.undefined
  var tokenURL: js.UndefOr[String] = js.undefined
  var userProfileURL: js.UndefOr[String] = js.undefined
}

object _StrategyOptionsBase {
  @scala.inline
  def apply(
    clientID: String,
    clientSecret: String,
    authorizationURL: String = null,
    callbackURL: String = null,
    scope: String | js.Array[String] = null,
    tokenURL: String = null,
    userProfileURL: String = null
  ): _StrategyOptionsBase = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL.asInstanceOf[js.Any])
    if (callbackURL != null) __obj.updateDynamic("callbackURL")(callbackURL.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL.asInstanceOf[js.Any])
    if (userProfileURL != null) __obj.updateDynamic("userProfileURL")(userProfileURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[_StrategyOptionsBase]
  }
}

