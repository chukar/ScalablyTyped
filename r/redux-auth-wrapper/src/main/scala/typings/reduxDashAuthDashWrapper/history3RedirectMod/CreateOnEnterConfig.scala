package typings.reduxDashAuthDashWrapper.history3RedirectMod

import typings.react.reactMod.ReactType
import typings.reduxDashAuthDashWrapper.reduxDashAuthDashWrapperMod.AuthConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOnEnterConfig[State] extends AuthConfig {
  var allowRedirectBack: js.UndefOr[Boolean | (StateMutateSelector[State, Boolean])] = js.undefined
  var authenticatedSelector: StateMutateSelector[State, Boolean]
  var authenticatingSelector: js.UndefOr[StateMutateSelector[State, Boolean]] = js.undefined
  var redirectPath: String | (StateMutateSelector[State, String])
  var redirectQueryParamName: js.UndefOr[String] = js.undefined
}

object CreateOnEnterConfig {
  @scala.inline
  def apply[State](
    authenticatedSelector: (State, State) => Boolean,
    redirectPath: String | (StateMutateSelector[State, String]),
    AuthenticatingComponent: ReactType[_] = null,
    allowRedirectBack: Boolean | (StateMutateSelector[State, Boolean]) = null,
    authenticatingSelector: (State, State) => Boolean = null,
    redirectQueryParamName: String = null,
    wrapperDisplayName: String = null
  ): CreateOnEnterConfig[State] = {
    val __obj = js.Dynamic.literal(authenticatedSelector = js.Any.fromFunction2(authenticatedSelector), redirectPath = redirectPath.asInstanceOf[js.Any])
    if (AuthenticatingComponent != null) __obj.updateDynamic("AuthenticatingComponent")(AuthenticatingComponent.asInstanceOf[js.Any])
    if (allowRedirectBack != null) __obj.updateDynamic("allowRedirectBack")(allowRedirectBack.asInstanceOf[js.Any])
    if (authenticatingSelector != null) __obj.updateDynamic("authenticatingSelector")(js.Any.fromFunction2(authenticatingSelector))
    if (redirectQueryParamName != null) __obj.updateDynamic("redirectQueryParamName")(redirectQueryParamName.asInstanceOf[js.Any])
    if (wrapperDisplayName != null) __obj.updateDynamic("wrapperDisplayName")(wrapperDisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOnEnterConfig[State]]
  }
}

