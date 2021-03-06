package typings.leafletDashPolylinedecorator.leafletMod.Symbol

import typings.leaflet.leafletMod.LatLng
import typings.leaflet.leafletMod.Map
import typings.leaflet.leafletMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Symbol.Marker")
@js.native
class Marker () extends js.Object {
  def this(options: MarkerOptions) = this()
  def buildSymbol(dirPoint: Point, latLngs: js.Array[LatLng], map: Map, index: Double, total: Double): Marker = js.native
  def initialize(): Unit = js.native
  def initialize(options: MarkerOptions): Unit = js.native
}

@JSImport("leaflet", "Symbol.marker")
@js.native
object marker extends js.Object {
  def apply(): Marker = js.native
  def apply(options: MarkerOptions): Marker = js.native
}

