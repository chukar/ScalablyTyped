package typings.googleapis.buildSrcApisDoubleclickbidmanagerV1Mod.doubleclickbidmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters of a query or report.
  */
@js.native
trait Schema$Parameters extends js.Object {
  /**
    * Filters used to match traffic data in your report.
    */
  var filters: js.UndefOr[js.Array[Schema$FilterPair]] = js.native
  /**
    * Data is grouped by the filters listed in this field.
    */
  var groupBys: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether to include data from Invite Media.
    */
  var includeInviteData: js.UndefOr[Boolean] = js.native
  /**
    * Metrics to include as columns in your report.
    */
  var metrics: js.UndefOr[js.Array[String]] = js.native
  /**
    * Report type.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$Parameters {
  @scala.inline
  def apply(
    filters: js.Array[Schema$FilterPair] = null,
    groupBys: js.Array[String] = null,
    includeInviteData: js.UndefOr[Boolean] = js.undefined,
    metrics: js.Array[String] = null,
    `type`: String = null
  ): Schema$Parameters = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (groupBys != null) __obj.updateDynamic("groupBys")(groupBys.asInstanceOf[js.Any])
    if (!js.isUndefined(includeInviteData)) __obj.updateDynamic("includeInviteData")(includeInviteData.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Parameters]
  }
}

