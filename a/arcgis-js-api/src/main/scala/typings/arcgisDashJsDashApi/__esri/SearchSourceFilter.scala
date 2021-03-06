package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchSourceFilter extends Object {
  /**
    * The filter geometry for suggests or search results. [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) is the only supported geometry when working with [locator](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html) sources. See [Find Address Candidates](https://developers.arcgis.com/rest/services-reference/find-address-candidates.htm) for additional information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#filter)
    */
  var geometry: js.UndefOr[Geometry] = js.undefined
  /**
    * The where clause specified for filtering suggests or search results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#filter)
    */
  var where: js.UndefOr[String] = js.undefined
}

object SearchSourceFilter {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    geometry: Geometry = null,
    where: String = null
  ): SearchSourceFilter = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSourceFilter]
  }
}

