package typings.kendoDashUi.kendo.dataviz.diagram

import typings.kendoDashUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.diagram.Connector")
@js.native
class Connector () extends Observable {
  def this(options: ConnectorOptions) = this()
  var connections: js.Any = js.native
  var options: ConnectorOptions = js.native
  var shape: Shape = js.native
  def position(): Point = js.native
}

