package typings.antdDashMobile.libSegmentedDashControlMod

import typings.react.reactMod.Component
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentedControl
  extends Component[SegmentedControlProps, js.Any, js.Any] {
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSegmentedControl(nextProps: SegmentedControlProps): Unit = js.native
  def onClick(e: MouseEvent[HTMLDivElement, NativeMouseEvent], index: js.Any, value: js.Any): Unit = js.native
  def renderSegmentItem(idx: Double, value: String, selected: Boolean): Element = js.native
}

