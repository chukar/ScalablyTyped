package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TestOrderCustomerMarketingRightsInfo extends js.Object {
  /**
    * Last know user use selection regards marketing preferences. In certain
    * cases selection might not be known, so this field would be empty.
    */
  var explicitMarketingPreference: js.UndefOr[String] = js.native
  /**
    * Timestamp when last time marketing preference was updated. Could be
    * empty, if user wasn&#39;t offered a selection yet.
    */
  var lastUpdatedTimestamp: js.UndefOr[String] = js.native
}

object Schema$TestOrderCustomerMarketingRightsInfo {
  @scala.inline
  def apply(explicitMarketingPreference: String = null, lastUpdatedTimestamp: String = null): Schema$TestOrderCustomerMarketingRightsInfo = {
    val __obj = js.Dynamic.literal()
    if (explicitMarketingPreference != null) __obj.updateDynamic("explicitMarketingPreference")(explicitMarketingPreference.asInstanceOf[js.Any])
    if (lastUpdatedTimestamp != null) __obj.updateDynamic("lastUpdatedTimestamp")(lastUpdatedTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TestOrderCustomerMarketingRightsInfo]
  }
}

