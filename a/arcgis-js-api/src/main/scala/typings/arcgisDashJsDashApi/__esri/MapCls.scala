package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.Map")
@js.native
/**
  * The Map class contains properties and methods for storing, managing, and overlaying [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers) common to both 2D and 3D viewing. Layers can be added and removed from the map, but are rendered via a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) (for viewing data in 2D) or a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) (for viewing data in 3D). Thus a map instance is a simple container that holds the layers, while the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) is the means of displaying and interacting with a map's layers and basemap.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html)
  */
class MapCls () extends Map {
  def this(properties: MapProperties) = this()
}

