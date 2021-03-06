package typings.apolloDashServerDashCaching

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key[V] extends js.Object {
  var maxSize: js.UndefOr[Double] = js.undefined
  var onDispose: js.UndefOr[js.Function2[/* key */ String, /* value */ V, Unit]] = js.undefined
  var sizeCalculator: js.UndefOr[js.Function2[/* value */ V, /* key */ String, Double]] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply[V](
    maxSize: Int | Double = null,
    onDispose: (/* key */ String, /* value */ V) => Unit = null,
    sizeCalculator: (/* value */ V, /* key */ String) => Double = null
  ): Anon_Key[V] = {
    val __obj = js.Dynamic.literal()
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (onDispose != null) __obj.updateDynamic("onDispose")(js.Any.fromFunction2(onDispose))
    if (sizeCalculator != null) __obj.updateDynamic("sizeCalculator")(js.Any.fromFunction2(sizeCalculator))
    __obj.asInstanceOf[Anon_Key[V]]
  }
}

