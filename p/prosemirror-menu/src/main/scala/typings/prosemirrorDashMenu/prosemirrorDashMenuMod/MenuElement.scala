package typings.prosemirrorDashMenu.prosemirrorDashMenuMod

import typings.prosemirrorDashMenu.Anon_Dom
import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typings.prosemirrorDashView.prosemirrorDashViewMod.EditorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuElement[S /* <: Schema[_, _] */] extends js.Object {
  /**
    * Render the element for display in the menu. Must return a DOM
    * element and a function that can be used to update the element to
    * a new state. The `update` function will return false if the
    * update hid the entire element.
    */
  def render(pm: EditorView[S]): Anon_Dom[S]
}

object MenuElement {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](render: EditorView[S] => Anon_Dom[S]): MenuElement[S] = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
  
    __obj.asInstanceOf[MenuElement[S]]
  }
}

