package typings.rxDashDom.rxDashDomMod.rxMod.DOM

import typings.rxDashLiteDashAggregates.Rx.Observable
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.change")
@js.native
object change extends js.Object {
  def apply(element: Element): Observable[Event] = js.native
  def apply(element: Element, selector: js.Function): Observable[Event] = js.native
}

