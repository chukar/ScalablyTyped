package typings.rxDashDom.rxDashDomMod.rxMod.DOM

import typings.rxDashLiteDashAggregates.Rx.Observable
import typings.std.Element
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.touchstart")
@js.native
object touchstart extends js.Object {
  def apply(element: Element): Observable[TouchEvent] = js.native
  def apply(element: Element, selector: js.Function): Observable[TouchEvent] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): Observable[TouchEvent] = js.native
}

