package typings.reactDashOverlays.reactDashOverlaysMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionCallbacks extends js.Object {
  /**
    * Callback fired before the Overlay transitions in
    */
  var onEnter: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.undefined
  /**
    * Callback fired after the Overlay finishes transitioning in
    */
  var onEntered: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.undefined
  /**
    * Callback fired as the Overlay begins to transition in
    */
  var onEntering: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.undefined
  /**
    * Callback fired right before the Overlay transitions out
    */
  var onExit: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.undefined
  /**
    * Callback fired after the Overlay finishes transitioning out
    */
  var onExited: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.undefined
  /**
    * Callback fired as the Overlay begins to transition out
    */
  var onExiting: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.undefined
}

object TransitionCallbacks {
  @scala.inline
  def apply(
    onEnter: /* node */ HTMLElement => _ = null,
    onEntered: /* node */ HTMLElement => _ = null,
    onEntering: /* node */ HTMLElement => _ = null,
    onExit: /* node */ HTMLElement => _ = null,
    onExited: /* node */ HTMLElement => _ = null,
    onExiting: /* node */ HTMLElement => _ = null
  ): TransitionCallbacks = {
    val __obj = js.Dynamic.literal()
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1(onEnter))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction1(onEntered))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction1(onEntering))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1(onExit))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1(onExited))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction1(onExiting))
    __obj.asInstanceOf[TransitionCallbacks]
  }
}

