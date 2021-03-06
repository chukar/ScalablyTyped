package typings.leafletDashPolylinedecorator.leafletMod.Symbol

import typings.geojson.geojsonMod.LineString
import typings.geojson.geojsonMod.MultiLineString
import typings.leaflet.leafletMod.LatLng
import typings.leaflet.leafletMod.Map
import typings.leaflet.leafletMod.Point
import typings.leaflet.leafletMod.Polygon
import typings.leaflet.leafletMod.Polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Symbol.ArrowHead")
@js.native
class ArrowHead () extends js.Object {
  def this(options: ArrowHeadOptions) = this()
  def buildSymbol(dirPoint: Point, latLngs: js.Array[LatLng], map: Map, index: Double, total: Double): Polygon[_] | (Polyline[LineString | MultiLineString, _]) = js.native
  def initialize(): Unit = js.native
  def initialize(options: ArrowHeadOptions): Unit = js.native
}

@JSImport("leaflet", "Symbol.arrowHead")
@js.native
object arrowHead extends js.Object {
  def apply(): ArrowHead = js.native
  def apply(options: ArrowHeadOptions): ArrowHead = js.native
}

