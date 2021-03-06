package typings.vuex

import typings.vuex.vuexMod.ActionTree
import typings.vuex.vuexMod.GetterTree
import typings.vuex.vuexMod.ModuleTree
import typings.vuex.vuexMod.MutationTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Actions[S] extends js.Object {
  var actions: js.UndefOr[ActionTree[S, S]] = js.undefined
  var getters: js.UndefOr[GetterTree[S, S]] = js.undefined
  var modules: js.UndefOr[ModuleTree[S]] = js.undefined
  var mutations: js.UndefOr[MutationTree[S]] = js.undefined
}

object Anon_Actions {
  @scala.inline
  def apply[S](
    actions: ActionTree[S, S] = null,
    getters: GetterTree[S, S] = null,
    modules: ModuleTree[S] = null,
    mutations: MutationTree[S] = null
  ): Anon_Actions[S] = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (getters != null) __obj.updateDynamic("getters")(getters.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (mutations != null) __obj.updateDynamic("mutations")(mutations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Actions[S]]
  }
}

