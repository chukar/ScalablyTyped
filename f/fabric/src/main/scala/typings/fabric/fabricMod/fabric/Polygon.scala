package typings.fabric.fabricMod.fabric

import typings.fabric.Anon_X
import typings.fabric.fabricDashImplMod.IPolylineOptions
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric", "fabric.Polygon")
@js.native
class Polygon protected ()
  extends typings.fabric.fabricDashImplMod.Polygon {
  /**
  	 * Constructor
  	 * @param points Array of points
  	 * @param [options] Options object
  	 */
  def this(points: js.Array[Anon_X]) = this()
  def this(points: js.Array[Anon_X], options: IPolylineOptions) = this()
}

/* static members */
@JSImport("fabric", "fabric.Polygon")
@js.native
object Polygon extends js.Object {
  /**
  	 * Returns Polygon instance from an SVG element
  	 * @param element Element to parse
  	 * @param [options] Options object
  	 */
  def fromElement(element: SVGElement): typings.fabric.fabricDashImplMod.Polygon = js.native
  def fromElement(element: SVGElement, options: IPolylineOptions): typings.fabric.fabricDashImplMod.Polygon = js.native
  /**
  	 * Returns fabric.Polygon instance from an object representation
  	 * @param object Object to create an instance from
  	 */
  def fromObject(`object`: js.Any): typings.fabric.fabricDashImplMod.Polygon = js.native
}

