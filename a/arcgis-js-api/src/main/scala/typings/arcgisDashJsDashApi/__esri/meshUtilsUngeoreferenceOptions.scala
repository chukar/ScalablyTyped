package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`nautical-miles`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`us-feet`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.centimeters
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.decimeters
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.feet_
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.inches
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.kilometers_
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.meters_
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.miles_
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.millimeters
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.yards
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait meshUtilsUngeoreferenceOptions extends Object {
  /**
    * Indicates whether the coordinates are georeferenced relative to the globe or the projected coordinate system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#ungeoreference)
    */
  var geographic: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates the unit of the resulting data. A linear scale will be applied to the position attributes to convert the source data to the specified unit. By default the unit of the resulting data will be the same as the source spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#ungeoreference)
    */
  var unit: js.UndefOr[
    millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
  ] = js.undefined
}

object meshUtilsUngeoreferenceOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    geographic: js.UndefOr[Boolean] = js.undefined,
    unit: millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet` = null
  ): meshUtilsUngeoreferenceOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(geographic)) __obj.updateDynamic("geographic")(geographic.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[meshUtilsUngeoreferenceOptions]
  }
}

