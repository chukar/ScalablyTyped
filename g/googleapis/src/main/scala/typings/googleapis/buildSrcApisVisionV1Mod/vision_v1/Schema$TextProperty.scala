package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional information detected on the structural component.
  */
@js.native
trait Schema$TextProperty extends js.Object {
  /**
    * Detected start or end of a text segment.
    */
  var detectedBreak: js.UndefOr[Schema$DetectedBreak] = js.native
  /**
    * A list of detected languages together with confidence.
    */
  var detectedLanguages: js.UndefOr[js.Array[Schema$DetectedLanguage]] = js.native
}

object Schema$TextProperty {
  @scala.inline
  def apply(
    detectedBreak: Schema$DetectedBreak = null,
    detectedLanguages: js.Array[Schema$DetectedLanguage] = null
  ): Schema$TextProperty = {
    val __obj = js.Dynamic.literal()
    if (detectedBreak != null) __obj.updateDynamic("detectedBreak")(detectedBreak.asInstanceOf[js.Any])
    if (detectedLanguages != null) __obj.updateDynamic("detectedLanguages")(detectedLanguages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TextProperty]
  }
}

