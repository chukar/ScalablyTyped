package typings.ejDotWebDotAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RightClickEventArgs extends js.Object {
  /** Returns the right clicked group of treeMapItems as  object.
    */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object RightClickEventArgs {
  @scala.inline
  def apply(originalEvent: js.Any = null): RightClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RightClickEventArgs]
  }
}

