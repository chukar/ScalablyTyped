package typings.googleapis.buildSrcApisVideointelligenceV1beta2Mod.videointelligence_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video frame level annotations for object detection and tracking. This field
  * stores per frame location, time offset, and confidence.
  */
@js.native
trait Schema$GoogleCloudVideointelligenceV1_ObjectTrackingFrame extends js.Object {
  /**
    * The normalized bounding box location of this object track for the frame.
    */
  var normalizedBoundingBox: js.UndefOr[Schema$GoogleCloudVideointelligenceV1_NormalizedBoundingBox] = js.native
  /**
    * The timestamp of the frame in microseconds.
    */
  var timeOffset: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudVideointelligenceV1_ObjectTrackingFrame {
  @scala.inline
  def apply(
    normalizedBoundingBox: Schema$GoogleCloudVideointelligenceV1_NormalizedBoundingBox = null,
    timeOffset: String = null
  ): Schema$GoogleCloudVideointelligenceV1_ObjectTrackingFrame = {
    val __obj = js.Dynamic.literal()
    if (normalizedBoundingBox != null) __obj.updateDynamic("normalizedBoundingBox")(normalizedBoundingBox.asInstanceOf[js.Any])
    if (timeOffset != null) __obj.updateDynamic("timeOffset")(timeOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVideointelligenceV1_ObjectTrackingFrame]
  }
}

