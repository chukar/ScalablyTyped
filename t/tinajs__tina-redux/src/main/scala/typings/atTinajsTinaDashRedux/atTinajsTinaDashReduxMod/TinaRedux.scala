package typings.atTinajsTinaDashRedux.atTinajsTinaDashReduxMod

import typings.redux.reduxMod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TinaRedux[S, A /* <: Action[_] */] extends js.Object {
  def connect(): HOC = js.native
  def connect(mapState: MapStateToProps): HOC = js.native
  def connect(mapState: MapStateToProps, mapDispatch: mapDispatchToProps): HOC = js.native
}

