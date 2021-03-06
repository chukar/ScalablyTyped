package typings.mobx

import typings.mobx.libCoreActionMod.IAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConfigurableEnumerable extends js.Object {
  var configurable: Boolean
  var enumerable: Boolean
  var value: js.UndefOr[scala.Nothing] = js.undefined
  var writable: Boolean
  def initializer(): js.Function with IAction
}

object Anon_ConfigurableEnumerable {
  @scala.inline
  def apply(
    configurable: Boolean,
    enumerable: Boolean,
    initializer: () => js.Function with IAction,
    writable: Boolean,
    value: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_ConfigurableEnumerable = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], enumerable = enumerable.asInstanceOf[js.Any], initializer = js.Any.fromFunction0(initializer), writable = writable.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ConfigurableEnumerable]
  }
}

