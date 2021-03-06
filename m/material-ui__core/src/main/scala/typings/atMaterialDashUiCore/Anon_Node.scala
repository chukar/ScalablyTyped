package typings.atMaterialDashUiCore

import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Node extends js.Object {
  var node: HTMLInputElement = js.native
  var value: js.UndefOr[(js.Array[String | Double | Boolean]) | String | Double | Boolean] = js.native
}

object Anon_Node {
  @scala.inline
  def apply(
    node: HTMLInputElement,
    value: (js.Array[String | Double | Boolean]) | String | Double | Boolean = null
  ): Anon_Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Node]
  }
}

