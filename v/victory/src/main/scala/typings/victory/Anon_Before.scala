package typings.victory

import typings.victory.victoryMod.AnimationStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Before extends js.Object {
  var before: js.UndefOr[js.Function1[/* datum */ js.Any, AnimationStyle]] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
}

object Anon_Before {
  @scala.inline
  def apply(before: /* datum */ js.Any => AnimationStyle = null, duration: Int | Double = null): Anon_Before = {
    val __obj = js.Dynamic.literal()
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1(before))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Before]
  }
}

