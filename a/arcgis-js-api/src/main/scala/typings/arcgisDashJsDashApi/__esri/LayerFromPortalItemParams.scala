package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerFromPortalItemParams extends Object {
  /**
    * The object representing an ArcGIS Online or ArcGIS Enterprise portal item from which to load the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fromPortalItem)
    */
  var portalItem: PortalItem
}

object LayerFromPortalItemParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    portalItem: PortalItem,
    propertyIsEnumerable: PropertyKey => Boolean
  ): LayerFromPortalItemParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), portalItem = portalItem.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[LayerFromPortalItemParams]
  }
}

