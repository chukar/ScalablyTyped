package typings.xstate.libTypesMod

import typings.xstate.libTypesMod.ActionTypes.Start
import typings.xstate.libTypesMod.ActionTypes.Stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvokeActionObject[TContext, TEvent /* <: EventObject */] extends ActivityActionObject[TContext, TEvent] {
  @JSName("activity")
  var activity_InvokeActionObject: InvokeDefinition[TContext, TEvent]
}

object InvokeActionObject {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    activity: InvokeDefinition[TContext, TEvent],
    `type`: Start | Stop,
    exec: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => js.Any | Unit = null
  ): InvokeActionObject[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3(exec))
    __obj.asInstanceOf[InvokeActionObject[TContext, TEvent]]
  }
}

