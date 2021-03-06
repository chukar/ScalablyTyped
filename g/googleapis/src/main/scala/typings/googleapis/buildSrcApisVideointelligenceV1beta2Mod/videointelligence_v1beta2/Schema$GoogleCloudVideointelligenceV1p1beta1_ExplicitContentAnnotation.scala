package typings.googleapis.buildSrcApisVideointelligenceV1beta2Mod.videointelligence_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Explicit content annotation (based on per-frame visual signals only). If no
  * explicit content has been detected in a frame, no annotations are present
  * for that frame.
  */
@js.native
trait Schema$GoogleCloudVideointelligenceV1p1beta1_ExplicitContentAnnotation extends js.Object {
  /**
    * All video frames where explicit content was detected.
    */
  var frames: js.UndefOr[js.Array[Schema$GoogleCloudVideointelligenceV1p1beta1_ExplicitContentFrame]] = js.native
}

object Schema$GoogleCloudVideointelligenceV1p1beta1_ExplicitContentAnnotation {
  @scala.inline
  def apply(frames: js.Array[Schema$GoogleCloudVideointelligenceV1p1beta1_ExplicitContentFrame] = null): Schema$GoogleCloudVideointelligenceV1p1beta1_ExplicitContentAnnotation = {
    val __obj = js.Dynamic.literal()
    if (frames != null) __obj.updateDynamic("frames")(frames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVideointelligenceV1p1beta1_ExplicitContentAnnotation]
  }
}

