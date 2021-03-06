package typings.dva

import org.scalablytyped.runtime.StringDictionary
import typings.dva.dvaStrings.`@@routerSlashCALL_HISTORY_METHOD`
import typings.dva.dvaStrings.`@@routerSlashLOCATION_CHANGE`
import typings.history.historyMod.History
import typings.history.historyMod.Location
import typings.history.historyMod.LocationDescriptor
import typings.history.historyMod.LocationState
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.reactDashRouter.reactDashRouterMod.MemoryRouterProps
import typings.reactDashRouter.reactDashRouterMod.Omit
import typings.reactDashRouter.reactDashRouterMod.PromptProps
import typings.reactDashRouter.reactDashRouterMod.RedirectProps
import typings.reactDashRouter.reactDashRouterMod.RouteComponentProps
import typings.reactDashRouter.reactDashRouterMod.RouteProps
import typings.reactDashRouter.reactDashRouterMod.RouterProps
import typings.reactDashRouter.reactDashRouterMod.StaticContext
import typings.reactDashRouter.reactDashRouterMod.StaticRouterProps
import typings.reactDashRouter.reactDashRouterMod.SwitchProps
import typings.reactDashRouter.reactDashRouterMod.WithRouterProps
import typings.reactDashRouter.reactDashRouterMod.WithRouterStatics
import typings.reactDashRouter.reactDashRouterMod.`match`
import typings.reactDashRouterDashDom.reactDashRouterDashDomMod.BrowserRouterProps
import typings.reactDashRouterDashDom.reactDashRouterDashDomMod.HashRouterProps
import typings.reactDashRouterDashDom.reactDashRouterDashDomMod.LinkProps
import typings.reactDashRouterDashDom.reactDashRouterDashDomMod.NavLinkProps
import typings.reactDashRouterDashRedux.Anon_Router
import typings.reactDashRouterDashRedux.reactDashRouterDashReduxMod.ConnectedRouterProps
import typings.reactDashRouterDashRedux.reactDashRouterDashReduxMod.RouterAction
import typings.reactDashRouterDashRedux.reactDashRouterDashReduxMod.RouterState
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import typings.redux.reduxMod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dva/router", JSImport.Namespace)
@js.native
object routerMod extends js.Object {
  @js.native
  class BrowserRouter ()
    extends Component[BrowserRouterProps, js.Any, js.Any]
  
  @js.native
  class HashRouter ()
    extends Component[HashRouterProps, js.Any, js.Any]
  
  @js.native
  class Link[S] ()
    extends Component[LinkProps[S], js.Any, js.Any]
  
  @js.native
  class MemoryRouter ()
    extends Component[MemoryRouterProps, js.Any, js.Any]
  
  @js.native
  class NavLink[S] ()
    extends Component[NavLinkProps[S], js.Any, js.Any]
  
  @js.native
  class Prompt ()
    extends Component[PromptProps, js.Any, js.Any]
  
  @js.native
  class Redirect ()
    extends Component[RedirectProps, js.Any, js.Any]
  
  @js.native
  class Route[T /* <: RouteProps */] ()
    extends Component[T, js.Any, js.Any]
  
  @js.native
  class Router ()
    extends Component[RouterProps, js.Any, js.Any]
  
  @js.native
  class StaticRouter ()
    extends Component[StaticRouterProps, js.Any, js.Any]
  
  @js.native
  class Switch ()
    extends Component[SwitchProps, js.Any, js.Any]
  
  def generatePath(pattern: String): String = js.native
  def generatePath(pattern: String, params: StringDictionary[js.UndefOr[String | Double | Boolean]]): String = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.matchPath with js.Any */](pathname: String, props: String): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.matchPath with js.Any */](pathname: String, props: String, parent: `match`[Params]): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.matchPath with js.Any */](pathname: String, props: js.Array[String]): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.matchPath with js.Any */](pathname: String, props: js.Array[String], parent: `match`[Params]): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.matchPath with js.Any */](pathname: String, props: RouteProps): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.matchPath with js.Any */](pathname: String, props: RouteProps, parent: `match`[Params]): `match`[Params] | Null = js.native
  def useHistory[HistoryLocationState](): History[HistoryLocationState] = js.native
  def useLocation[S](): Location[S] = js.native
  def useParams[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.useParams with js.Any */](): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ p in keyof Params ]: string}
    */ typings.dva.dvaStrings.useParams with js.Any = js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.useRouteMatch with js.Any */](): `match`[Params] = js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.useRouteMatch with js.Any */](path: String): `match`[Params] | Null = js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.useRouteMatch with js.Any */](path: js.Array[String]): `match`[Params] | Null = js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.dva.dvaStrings.useRouteMatch with js.Any */](path: RouteProps): `match`[Params] | Null = js.native
  def withRouter[P /* <: RouteComponentProps[_, StaticContext, LocationState] */, C /* <: ComponentType[P] */](component: C with ComponentType[P]): (ComponentClass[(Omit[P, String]) with WithRouterProps[C], ComponentState]) with WithRouterStatics[C] = js.native
  @js.native
  object routerRedux extends js.Object {
    @js.native
    class ConnectedRouter[State] ()
      extends Component[ConnectedRouterProps[State], js.Object, js.Any]
    
    val CALL_HISTORY_METHOD: `@@routerSlashCALL_HISTORY_METHOD` = js.native
    val LOCATION_CHANGE: `@@routerSlashLOCATION_CHANGE` = js.native
    val routerReducer: Reducer[RouterState, AnyAction] = js.native
    def createMatchSelector(path: String): js.Function1[/* state */ Anon_Router, `match`[js.Object] | Null] = js.native
    def go(n: Double): RouterAction = js.native
    def goBack(): RouterAction = js.native
    def goForward(): RouterAction = js.native
    def push(location: LocationDescriptor[LocationState]): RouterAction = js.native
    def push(location: LocationDescriptor[LocationState], state: LocationState): RouterAction = js.native
    def replace(location: LocationDescriptor[LocationState]): RouterAction = js.native
    def replace(location: LocationDescriptor[LocationState], state: LocationState): RouterAction = js.native
    def routerMiddleware(history: History[LocationState]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
    @js.native
    object routerActions extends js.Object {
      var go: js.Function1[/* n */ Double, RouterAction] = js.native
      var goBack: js.Function0[RouterAction] = js.native
      var goForward: js.Function0[RouterAction] = js.native
      var push: js.Function2[
            /* location */ LocationDescriptor[LocationState], 
            /* state */ js.UndefOr[LocationState], 
            RouterAction
          ] = js.native
      var replace: js.Function2[
            /* location */ LocationDescriptor[LocationState], 
            /* state */ js.UndefOr[LocationState], 
            RouterAction
          ] = js.native
    }
    
  }
  
}

