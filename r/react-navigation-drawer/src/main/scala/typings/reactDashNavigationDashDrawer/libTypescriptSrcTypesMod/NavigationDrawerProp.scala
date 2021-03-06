package typings.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod

import typings.reactDashNavigation.Anon_ActionKey
import typings.reactDashNavigation.Anon_ParamsP
import typings.reactDashNavigation.reactDashNavigationMod.NavigationAction
import typings.reactDashNavigation.reactDashNavigationMod.NavigationDispatch
import typings.reactDashNavigation.reactDashNavigationMod.NavigationEventCallback
import typings.reactDashNavigation.reactDashNavigationMod.NavigationEventSubscription
import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typings.reactDashNavigation.reactDashNavigationMod.NavigationRouter
import typings.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import typings.reactDashNavigation.reactDashNavigationMod.NavigationState
import typings.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.refocus
import typings.std.NonNullable
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation.react-navigation.NavigationScreenProp<State, Params> & {openDrawer (): void, closeDrawer (): void, toggleDrawer (): void, jumpTo (routeName : string, key ? : string): void} */
@js.native
trait NavigationDrawerProp[State, Params] extends js.Object {
  var dispatch: NavigationDispatch = js.native
  var router: js.UndefOr[NavigationRouter[NavigationState, js.Object]] = js.native
  var state: State with Anon_ParamsP[Params] = js.native
  def addListener(eventName: String, callback: NavigationEventCallback): NavigationEventSubscription = js.native
  def closeDrawer(): js.Any = js.native
  @JSName("closeDrawer")
  def closeDrawer_Unit(): Unit = js.native
  def dangerouslyGetParent(): js.UndefOr[NavigationScreenProp[State, NavigationParams]] = js.native
  def dismiss(): Boolean = js.native
  @JSName("emit")
  def emit_refocus(eventName: refocus): Unit = js.native
  def getParam[T /* <: String */](param: T): /* import warning: importer.ImportType#apply Failed type conversion: Params[T] */ js.Any = js.native
  def getParam[T /* <: String */](
    param: T,
    fallback: NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Params[T] */ js.Any
    ]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Params[T] */ js.Any
  ] = js.native
  def goBack(): Boolean = js.native
  def goBack(routeKey: String): Boolean = js.native
  def isFirstRouteInParent(): Boolean = js.native
  def isFocused(): Boolean = js.native
  def jumpTo(routeName: String): Unit = js.native
  def jumpTo(routeName: String, key: String): Unit = js.native
  def navigate(options: Anon_ActionKey): Boolean = js.native
  def navigate(routeNameOrOptions: String): Boolean = js.native
  def navigate(routeNameOrOptions: String, params: NavigationParams): Boolean = js.native
  def navigate(routeNameOrOptions: String, params: NavigationParams, action: NavigationAction): Boolean = js.native
  def openDrawer(): js.Any = js.native
  @JSName("openDrawer")
  def openDrawer_Unit(): Unit = js.native
  def setParams(newParams: Partial[Params]): Boolean = js.native
  def toggleDrawer(): js.Any = js.native
  @JSName("toggleDrawer")
  def toggleDrawer_Unit(): Unit = js.native
}

