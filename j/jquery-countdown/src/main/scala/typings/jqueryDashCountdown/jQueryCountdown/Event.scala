package typings.jqueryDashCountdown.jQueryCountdown

import typings.std.Date
import typings.std.Element
import typings.std.TouchList
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event
  extends typings.jquery.JQuery.Event {
  /**
    * Passed away the final date?
    */
  var elapsed: Boolean
  /**
    * The parsed final date native object
    */
  var finalDate: Date
  var offset: OffsetEvent
  /**
    * The formatter function
    */
  def strftime(format: String): String
}

object Event {
  @scala.inline
  def apply(
    elapsed: Boolean,
    finalDate: Date,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    offset: OffsetEvent,
    preventDefault: () => Unit,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    strftime: String => String,
    timeStamp: Double,
    `type`: String,
    altKey: js.UndefOr[Boolean] = js.undefined,
    bubbles: js.UndefOr[Boolean] = js.undefined,
    button: Int | Double = null,
    buttons: Int | Double = null,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    changedTouches: TouchList = null,
    char: String = null,
    charCode: Int | Double = null,
    clientX: Int | Double = null,
    clientY: Int | Double = null,
    ctrlKey: js.UndefOr[Boolean] = js.undefined,
    detail: Int | Double = null,
    eventPhase: Int | Double = null,
    key: String = null,
    keyCode: Int | Double = null,
    metaKey: js.UndefOr[Boolean] = js.undefined,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null,
    pageX: Int | Double = null,
    pageY: Int | Double = null,
    pointerId: Int | Double = null,
    pointerType: String = null,
    screenX: Int | Double = null,
    screenY: Int | Double = null,
    shiftKey: js.UndefOr[Boolean] = js.undefined,
    targetTouches: TouchList = null,
    toElement: Element = null,
    touches: TouchList = null,
    view: Window = null,
    which: Int | Double = null
  ): Event = {
    val __obj = js.Dynamic.literal(elapsed = elapsed.asInstanceOf[js.Any], finalDate = finalDate.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), offset = offset.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), strftime = js.Any.fromFunction1(strftime), timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(altKey)) __obj.updateDynamic("altKey")(altKey.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (changedTouches != null) __obj.updateDynamic("changedTouches")(changedTouches.asInstanceOf[js.Any])
    if (char != null) __obj.updateDynamic("char")(char.asInstanceOf[js.Any])
    if (charCode != null) __obj.updateDynamic("charCode")(charCode.asInstanceOf[js.Any])
    if (clientX != null) __obj.updateDynamic("clientX")(clientX.asInstanceOf[js.Any])
    if (clientY != null) __obj.updateDynamic("clientY")(clientY.asInstanceOf[js.Any])
    if (!js.isUndefined(ctrlKey)) __obj.updateDynamic("ctrlKey")(ctrlKey.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (eventPhase != null) __obj.updateDynamic("eventPhase")(eventPhase.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keyCode != null) __obj.updateDynamic("keyCode")(keyCode.asInstanceOf[js.Any])
    if (!js.isUndefined(metaKey)) __obj.updateDynamic("metaKey")(metaKey.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (pageX != null) __obj.updateDynamic("pageX")(pageX.asInstanceOf[js.Any])
    if (pageY != null) __obj.updateDynamic("pageY")(pageY.asInstanceOf[js.Any])
    if (pointerId != null) __obj.updateDynamic("pointerId")(pointerId.asInstanceOf[js.Any])
    if (pointerType != null) __obj.updateDynamic("pointerType")(pointerType.asInstanceOf[js.Any])
    if (screenX != null) __obj.updateDynamic("screenX")(screenX.asInstanceOf[js.Any])
    if (screenY != null) __obj.updateDynamic("screenY")(screenY.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftKey)) __obj.updateDynamic("shiftKey")(shiftKey.asInstanceOf[js.Any])
    if (targetTouches != null) __obj.updateDynamic("targetTouches")(targetTouches.asInstanceOf[js.Any])
    if (toElement != null) __obj.updateDynamic("toElement")(toElement.asInstanceOf[js.Any])
    if (touches != null) __obj.updateDynamic("touches")(touches.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (which != null) __obj.updateDynamic("which")(which.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

