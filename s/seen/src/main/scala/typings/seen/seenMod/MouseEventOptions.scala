package typings.seen.seenMod

import typings.std.Event
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseEventOptions extends js.Object {
  var drag: js.UndefOr[EventListener] = js.undefined
  var dragEnd: js.UndefOr[EventListener] = js.undefined
  var dragStart: js.UndefOr[EventListener] = js.undefined
  var mouseDown: js.UndefOr[EventListener] = js.undefined
  var mouseMove: js.UndefOr[EventListener] = js.undefined
  var mouseUp: js.UndefOr[EventListener] = js.undefined
  var mouseWheel: js.UndefOr[EventListener] = js.undefined
}

object MouseEventOptions {
  @scala.inline
  def apply(
    drag: /* evt */ Event => Unit = null,
    dragEnd: /* evt */ Event => Unit = null,
    dragStart: /* evt */ Event => Unit = null,
    mouseDown: /* evt */ Event => Unit = null,
    mouseMove: /* evt */ Event => Unit = null,
    mouseUp: /* evt */ Event => Unit = null,
    mouseWheel: /* evt */ Event => Unit = null
  ): MouseEventOptions = {
    val __obj = js.Dynamic.literal()
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1(drag))
    if (dragEnd != null) __obj.updateDynamic("dragEnd")(js.Any.fromFunction1(dragEnd))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction1(dragStart))
    if (mouseDown != null) __obj.updateDynamic("mouseDown")(js.Any.fromFunction1(mouseDown))
    if (mouseMove != null) __obj.updateDynamic("mouseMove")(js.Any.fromFunction1(mouseMove))
    if (mouseUp != null) __obj.updateDynamic("mouseUp")(js.Any.fromFunction1(mouseUp))
    if (mouseWheel != null) __obj.updateDynamic("mouseWheel")(js.Any.fromFunction1(mouseWheel))
    __obj.asInstanceOf[MouseEventOptions]
  }
}

