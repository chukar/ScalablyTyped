package typings.atWordpressHooks.atWordpressHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/hooks", "addAction")
@js.native
object addAction extends js.Object {
  def apply(hookName: String, namespace: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def apply(
    hookName: String,
    namespace: String,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    priority: Double
  ): Unit = js.native
}

