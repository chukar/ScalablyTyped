package typings.rxDashDom.rxDashDomMod.rxMod.DOM

import typings.rxDashLiteDashAggregates.Rx.Observable
import typings.std.Element
import typings.std.FocusEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.blur")
@js.native
object blur extends js.Object {
  // Event Shortcuts
  def apply(element: Element): Observable[FocusEvent] = js.native
  def apply(element: Element, selector: js.Function): Observable[FocusEvent] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): Observable[FocusEvent] = js.native
}

