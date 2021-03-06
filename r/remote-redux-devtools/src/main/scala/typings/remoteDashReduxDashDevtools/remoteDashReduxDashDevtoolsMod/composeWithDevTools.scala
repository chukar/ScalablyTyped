package typings.remoteDashReduxDashDevtools.remoteDashReduxDashDevtoolsMod

import typings.redux.reduxMod.StoreEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("remote-redux-devtools", "composeWithDevTools")
@js.native
object composeWithDevTools extends js.Object {
  def apply(): js.Function1[
    /* repeated */ StoreEnhancer[js.Object, js.Object], 
    StoreEnhancer[js.Object, js.Object]
  ] = js.native
  def apply(funcs: (StoreEnhancer[js.Object, js.Object])*): StoreEnhancer[js.Object, js.Object] = js.native
  def apply(options: RemoteReduxDevToolsOptions): js.Function1[
    /* repeated */ StoreEnhancer[js.Object, js.Object], 
    StoreEnhancer[js.Object, js.Object]
  ] = js.native
}

