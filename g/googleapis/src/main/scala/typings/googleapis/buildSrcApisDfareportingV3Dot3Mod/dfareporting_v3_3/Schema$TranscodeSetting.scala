package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transcode Settings
  */
@js.native
trait Schema$TranscodeSetting extends js.Object {
  /**
    * Whitelist of video formats to be served to this placement. Set this list
    * to null or empty to serve all video formats.
    */
  var enabledVideoFormats: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#transcodeSetting&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$TranscodeSetting {
  @scala.inline
  def apply(enabledVideoFormats: js.Array[Double] = null, kind: String = null): Schema$TranscodeSetting = {
    val __obj = js.Dynamic.literal()
    if (enabledVideoFormats != null) __obj.updateDynamic("enabledVideoFormats")(enabledVideoFormats.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TranscodeSetting]
  }
}

