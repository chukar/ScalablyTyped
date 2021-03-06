package typings.mapboxDashGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mapboxDashGlMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.geojson.geojsonMod.Feature
  import typings.geojson.geojsonMod.GeoJsonProperties
  import typings.geojson.geojsonMod.Geometry
  import typings.mapboxDashGl.Anon_Center
  import typings.mapboxDashGl.Anon_Features
  import typings.mapboxDashGl.Anon_Key
  import typings.mapboxDashGl.mapboxDashGlStrings.bearing
  import typings.mapboxDashGl.mapboxDashGlStrings.zoom
  import typings.std.Pick
  import typings.std.Required

  /* Rewritten from type alias, can be one of: 
    - typings.mapboxDashGl.mapboxDashGlMod.BackgroundLayout
    - typings.mapboxDashGl.mapboxDashGlMod.FillLayout
    - typings.mapboxDashGl.mapboxDashGlMod.FillExtrusionLayout
    - typings.mapboxDashGl.mapboxDashGlMod.LineLayout
    - typings.mapboxDashGl.mapboxDashGlMod.SymbolLayout
    - typings.mapboxDashGl.mapboxDashGlMod.RasterLayout
    - typings.mapboxDashGl.mapboxDashGlMod.CircleLayout
    - typings.mapboxDashGl.mapboxDashGlMod.HeatmapLayout
    - typings.mapboxDashGl.mapboxDashGlMod.HillshadeLayout
  */
  type AnyLayout = _AnyLayout | BackgroundLayout | FillLayout | FillExtrusionLayout | RasterLayout | CircleLayout | HeatmapLayout | HillshadeLayout
  type BackgroundLayout = Layout
  type CameraForBoundsResult = (Required[Pick[CameraOptions, zoom | bearing]]) with Anon_Center
  type CircleLayout = Layout
  type EventData = StringDictionary[js.Any]
  type Expression = js.Array[ExpressionName | js.Any]
  type FillExtrusionLayout = Layout
  type FillLayout = Layout
  type HeatmapLayout = Layout
  type HillshadeLayout = Layout
  type LngLatBoundsLike = LngLatBounds | (js.Tuple2[LngLatLike, LngLatLike]) | (js.Tuple4[Double, Double, Double, Double])
  /* Rewritten from type alias, can be one of: 
    - typings.mapboxDashGl.mapboxDashGlMod.LngLat
    - typings.mapboxDashGl.Anon_Lat
    - typings.mapboxDashGl.Anon_LatLon
    - js.Tuple2[scala.Double, scala.Double]
  */
  type LngLatLike = _LngLatLike | (js.Tuple2[Double, Double])
  type MapLayerMouseEvent = MapMouseEvent with Anon_Features
  type MapLayerTouchEvent = MapTouchEvent with Anon_Features
  type MapboxGeoJSONFeature = (Feature[Geometry, GeoJsonProperties]) with Anon_Key
  type PointLike = Point | (js.Tuple2[Double, Double])
  type RasterLayout = Layout
  type Sources = StringDictionary[AnySourceData]
  type TransformRequestFunction = js.Function2[/* url */ String, /* resourceType */ ResourceType, RequestParameters]
}
