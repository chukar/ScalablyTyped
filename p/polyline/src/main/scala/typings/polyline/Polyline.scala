package typings.polyline

import org.scalablytyped.runtime.TopLevel
import typings.geojson.geojsonMod.Feature
import typings.geojson.geojsonMod.GeoJsonProperties
import typings.geojson.geojsonMod.LineString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Polyline extends js.Object {
  def decode(string: String): js.Array[js.Array[Double]] = js.native
  def decode(string: String, precision: Double): js.Array[js.Array[Double]] = js.native
  def encode(coordinate: js.Array[js.Array[Double]]): String = js.native
  def encode(coordinate: js.Array[js.Array[Double]], precision: Double): String = js.native
  def fromGeoJSON(geojson: Feature[LineString, GeoJsonProperties]): String = js.native
  def fromGeoJSON(geojson: Feature[LineString, GeoJsonProperties], precision: Double): String = js.native
  def fromGeoJSON(geojson: LineString): String = js.native
  def fromGeoJSON(geojson: LineString, precision: Double): String = js.native
}

@JSGlobal("polyline")
@js.native
object polyline extends TopLevel[Polyline]

