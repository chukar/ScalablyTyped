package typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod

import typings.reduxDashFirstDashRouter.Anon_Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Router[TState] extends js.Object {
  def getActionForPathAndParams(path: String): Nullable[js.Object]
  def getPathAndParamsForState(state: TState): Anon_Params
  def getStateForAction(action: js.Object, state: Nullable[TState]): Nullable[TState]
  def getStateForActionOriginal(action: js.Object, state: Nullable[TState]): Nullable[TState]
}

object Router {
  @scala.inline
  def apply[TState](
    getActionForPathAndParams: String => Nullable[js.Object],
    getPathAndParamsForState: TState => Anon_Params,
    getStateForAction: (js.Object, Nullable[TState]) => Nullable[TState],
    getStateForActionOriginal: (js.Object, Nullable[TState]) => Nullable[TState]
  ): Router[TState] = {
    val __obj = js.Dynamic.literal(getActionForPathAndParams = js.Any.fromFunction1(getActionForPathAndParams), getPathAndParamsForState = js.Any.fromFunction1(getPathAndParamsForState), getStateForAction = js.Any.fromFunction2(getStateForAction), getStateForActionOriginal = js.Any.fromFunction2(getStateForActionOriginal))
  
    __obj.asInstanceOf[Router[TState]]
  }
}

