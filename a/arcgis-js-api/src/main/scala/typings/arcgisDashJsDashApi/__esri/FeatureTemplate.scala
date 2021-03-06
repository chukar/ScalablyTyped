package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`auto-complete-polygon`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`down-arrow`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`left-arrow`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`right-arrow`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`up-arrow`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.arrow
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.circle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.ellipse
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.freehand
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.line
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.none
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.point
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.polygon
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.rectangle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.triangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureTemplate
  extends Accessor
     with JSONSupport {
  /**
    * Description of the feature template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#description)
    */
  var description: String = js.native
  /**
    * Name of the default drawing tool defined for the template to create a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#drawingTool)
    */
  var drawingTool: `auto-complete-polygon` | circle | ellipse | freehand | line | none | point | polygon | rectangle | arrow | triangle | `left-arrow` | `right-arrow` | `up-arrow` | `down-arrow` = js.native
  /**
    * Name of the feature template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#name)
    */
  var name: String = js.native
  /**
    * An object used to create a thumbnail image that represents a feature type in the feature template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#thumbnail)
    */
  var thumbnail: FeatureTemplateThumbnail = js.native
}

@JSGlobal("__esri.FeatureTemplate")
@js.native
object FeatureTemplate extends TopLevel[FeatureTemplateConstructor]

