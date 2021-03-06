package typings.ejDotWebDotAll.ej

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.SunburstChart")
@js.native
class SunburstChart_ protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ej.SunburstChart.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ej.SunburstChart.Model) = this()
  var defaults: typings.ejDotWebDotAll.ej.SunburstChart.Model = js.native
  @JSName("model")
  var model_SunburstChart_ : typings.ejDotWebDotAll.ej.SunburstChart.Model = js.native
  /** Redraws the entire sunburst. You can call this method whenever you update, add or remove points from the data source or whenever you want to refresh the UI.
    * @returns {void}
    */
  def redraw(): Unit = js.native
}

