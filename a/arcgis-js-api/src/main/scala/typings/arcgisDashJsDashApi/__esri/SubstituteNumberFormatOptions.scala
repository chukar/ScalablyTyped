package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.number
import typings.std.Intl.NumberFormatOptions
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubstituteNumberFormatOptions extends Object {
  /**
    * The Intl number format options for the [Intl.NumberFormat](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/NumberFormat) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#SubstituteNumberFormatOptions)
    */
  var intlOptions: NumberFormatOptions
  /**
    * The type of this format. The value is always `"number"`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#SubstituteNumberFormatOptions)
    */
  var `type`: number
}

object SubstituteNumberFormatOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    intlOptions: NumberFormatOptions,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: number
  ): SubstituteNumberFormatOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), intlOptions = intlOptions.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubstituteNumberFormatOptions]
  }
}

