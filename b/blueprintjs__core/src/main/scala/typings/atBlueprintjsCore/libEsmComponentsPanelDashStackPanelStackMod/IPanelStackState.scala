package typings.atBlueprintjsCore.libEsmComponentsPanelDashStackPanelStackMod

import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.pop
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.push
import typings.atBlueprintjsCore.libEsmComponentsPanelDashStackPanelPropsMod.IPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelStackState extends js.Object {
  /** Whether the stack is currently animating the push or pop of a panel. */
  var direction: push | pop
  /** The current stack of panels. The first panel in the stack will be displayed. */
  var stack: js.Array[IPanel[js.Object]]
}

object IPanelStackState {
  @scala.inline
  def apply(direction: push | pop, stack: js.Array[IPanel[js.Object]]): IPanelStackState = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPanelStackState]
  }
}

