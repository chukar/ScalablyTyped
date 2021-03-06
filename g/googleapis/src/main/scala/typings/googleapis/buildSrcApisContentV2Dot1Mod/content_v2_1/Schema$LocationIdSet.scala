package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LocationIdSet extends js.Object {
  /**
    * A non-empty list of location IDs. They must all be of the same location
    * type (e.g., state).
    */
  var locationIds: js.UndefOr[js.Array[String]] = js.native
}

object Schema$LocationIdSet {
  @scala.inline
  def apply(locationIds: js.Array[String] = null): Schema$LocationIdSet = {
    val __obj = js.Dynamic.literal()
    if (locationIds != null) __obj.updateDynamic("locationIds")(locationIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LocationIdSet]
  }
}

