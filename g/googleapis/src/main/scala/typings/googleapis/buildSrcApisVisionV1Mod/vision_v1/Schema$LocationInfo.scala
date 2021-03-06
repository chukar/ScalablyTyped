package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detected entity location information.
  */
@js.native
trait Schema$LocationInfo extends js.Object {
  /**
    * lat/long location coordinates.
    */
  var latLng: js.UndefOr[Schema$LatLng] = js.native
}

object Schema$LocationInfo {
  @scala.inline
  def apply(latLng: Schema$LatLng = null): Schema$LocationInfo = {
    val __obj = js.Dynamic.literal()
    if (latLng != null) __obj.updateDynamic("latLng")(latLng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LocationInfo]
  }
}

