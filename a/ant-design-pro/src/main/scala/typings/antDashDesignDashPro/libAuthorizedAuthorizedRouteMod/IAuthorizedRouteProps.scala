package typings.antDashDesignDashPro.libAuthorizedAuthorizedRouteMod

import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import typings.reactDashRouter.reactDashRouterMod.RouteChildrenProps
import typings.reactDashRouter.reactDashRouterMod.RouteComponentProps
import typings.reactDashRouter.reactDashRouterMod.RouteProps
import typings.reactDashRouter.reactDashRouterMod.StaticContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuthorizedRouteProps extends RouteProps {
  var authority: typings.antDashDesignDashPro.libAuthorizedAuthorizedRouteMod.authority
}

object IAuthorizedRouteProps {
  @scala.inline
  def apply(
    authority: authority,
    children: (js.Function1[/* props */ RouteChildrenProps[_, LocationState], ReactNode]) | ReactNode = null,
    component: ComponentType[_ | (RouteComponentProps[_, StaticContext, LocationState])] = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    location: Location[LocationState] = null,
    path: String | js.Array[String] = null,
    render: /* props */ RouteComponentProps[_, StaticContext, LocationState] => ReactNode = null,
    sensitive: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined
  ): IAuthorizedRouteProps = {
    val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthorizedRouteProps]
  }
}

