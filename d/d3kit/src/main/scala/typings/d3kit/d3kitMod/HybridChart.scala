package typings.d3kit.d3kitMod

import typings.d3DashSelection.d3DashSelectionMod.BaseType
import typings.d3DashSelection.d3DashSelectionMod.Selection
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3kit", "HybridChart")
@js.native
class HybridChart protected () extends CanvasChart {
  def this(selector: String) = this()
  def this(selector: Element) = this()
  def this(selector: String, options: ChartOptions) = this()
  def this(selector: Element, options: ChartOptions) = this()
  var layers: LayerOrganizer = js.native
  var plate: SvgPlate = js.native
  var rootG: Selection[BaseType, _, BaseType, _] = js.native
  var svg: Selection[BaseType, _, BaseType, _] = js.native
}

/* static members */
@JSImport("d3kit", "HybridChart")
@js.native
object HybridChart extends js.Object {
  def getDefaultOptions(): ChartOptions = js.native
}

