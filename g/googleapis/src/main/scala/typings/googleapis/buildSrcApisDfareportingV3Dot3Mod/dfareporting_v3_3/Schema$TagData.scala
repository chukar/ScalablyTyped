package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Placement Tag Data
  */
@js.native
trait Schema$TagData extends js.Object {
  /**
    * Ad associated with this placement tag. Applicable only when format is
    * PLACEMENT_TAG_TRACKING.
    */
  var adId: js.UndefOr[String] = js.native
  /**
    * Tag string to record a click.
    */
  var clickTag: js.UndefOr[String] = js.native
  /**
    * Creative associated with this placement tag. Applicable only when format
    * is PLACEMENT_TAG_TRACKING.
    */
  var creativeId: js.UndefOr[String] = js.native
  /**
    * TagData tag format of this tag.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * Tag string for serving an ad.
    */
  var impressionTag: js.UndefOr[String] = js.native
}

object Schema$TagData {
  @scala.inline
  def apply(
    adId: String = null,
    clickTag: String = null,
    creativeId: String = null,
    format: String = null,
    impressionTag: String = null
  ): Schema$TagData = {
    val __obj = js.Dynamic.literal()
    if (adId != null) __obj.updateDynamic("adId")(adId.asInstanceOf[js.Any])
    if (clickTag != null) __obj.updateDynamic("clickTag")(clickTag.asInstanceOf[js.Any])
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (impressionTag != null) __obj.updateDynamic("impressionTag")(impressionTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TagData]
  }
}

