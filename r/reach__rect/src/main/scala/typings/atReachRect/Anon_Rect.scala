package typings.atReachRect

import typings.react.reactMod.Ref
import typings.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rect extends js.Object {
  var rect: DOMRect
  var ref: Ref[_]
}

object Anon_Rect {
  @scala.inline
  def apply(rect: DOMRect, ref: Ref[_] = null): Anon_Rect = {
    val __obj = js.Dynamic.literal(rect = rect.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Rect]
  }
}

