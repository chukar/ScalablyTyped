package typings.atMysticateaSpy.distMod.Spy

import typings.atMysticateaSpy.atMysticateaSpyStrings.`return`
import typings.atMysticateaSpy.atMysticateaSpyStrings.`throw`
import typings.std.Parameters
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information for each call. */
/* Rewritten from type alias, can be one of: 
  - typings.atMysticateaSpy.distMod.Spy.ReturnedCall[T]
  - typings.atMysticateaSpy.distMod.Spy.ThrownCall[T]
*/
trait Call[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends js.Object

object Call {
  @scala.inline
  def ReturnedCall[T /* <: js.Function1[/* repeated */ js.Any, _] */](
    arguments: Parameters[T],
    `return`: ReturnType[T],
    `type`: `return`,
    `this`: js.UndefOr[scala.Nothing] = js.undefined
  ): Call[T] = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(`this`)) __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Call[T]]
  }
  @scala.inline
  def ThrownCall[T /* <: js.Function1[/* repeated */ js.Any, _] */](
    arguments: Parameters[T],
    `throw`: js.Any,
    `type`: `throw`,
    `this`: js.UndefOr[scala.Nothing] = js.undefined
  ): Call[T] = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("throw")(`throw`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(`this`)) __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Call[T]]
  }
}

