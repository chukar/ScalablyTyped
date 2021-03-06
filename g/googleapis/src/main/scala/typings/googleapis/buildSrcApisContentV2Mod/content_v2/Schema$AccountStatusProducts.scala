package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AccountStatusProducts extends js.Object {
  /**
    * The channel the data applies to.
    */
  var channel: js.UndefOr[String] = js.native
  /**
    * The country the data applies to.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The destination the data applies to.
    */
  var destination: js.UndefOr[String] = js.native
  /**
    * List of item-level issues.
    */
  var itemLevelIssues: js.UndefOr[js.Array[Schema$AccountStatusItemLevelIssue]] = js.native
  /**
    * Aggregated product statistics.
    */
  var statistics: js.UndefOr[Schema$AccountStatusStatistics] = js.native
}

object Schema$AccountStatusProducts {
  @scala.inline
  def apply(
    channel: String = null,
    country: String = null,
    destination: String = null,
    itemLevelIssues: js.Array[Schema$AccountStatusItemLevelIssue] = null,
    statistics: Schema$AccountStatusStatistics = null
  ): Schema$AccountStatusProducts = {
    val __obj = js.Dynamic.literal()
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (itemLevelIssues != null) __obj.updateDynamic("itemLevelIssues")(itemLevelIssues.asInstanceOf[js.Any])
    if (statistics != null) __obj.updateDynamic("statistics")(statistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountStatusProducts]
  }
}

