package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative Asset ID.
  */
@js.native
trait Schema$CreativeAssetId extends js.Object {
  /**
    * Name of the creative asset. This is a required field while inserting an
    * asset. After insertion, this assetIdentifier is used to identify the
    * uploaded asset. Characters in the name must be alphanumeric or one of the
    * following: &quot;.-_ &quot;. Spaces are allowed.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Type of asset to upload. This is a required field. FLASH and IMAGE are no
    * longer supported for new uploads. All image assets should use HTML_IMAGE.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$CreativeAssetId {
  @scala.inline
  def apply(name: String = null, `type`: String = null): Schema$CreativeAssetId = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreativeAssetId]
  }
}

