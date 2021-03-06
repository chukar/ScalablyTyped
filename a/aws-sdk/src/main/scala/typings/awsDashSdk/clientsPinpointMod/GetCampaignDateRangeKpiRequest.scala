package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCampaignDateRangeKpiRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string = js.native
  /**
    * The unique identifier for the campaign.
    */
  var CampaignId: __string = js.native
  /**
    * The last date and time to retrieve data for, as part of an inclusive date range that filters the query results. This value should be in extended ISO 8601 format and use Coordinated Universal Time (UTC), for example: 2019-07-26T20:00:00Z for 8:00 PM UTC July 26, 2019.
    */
  var EndTime: js.UndefOr[__timestampIso8601] = js.native
  /**
    * The name of the metric, also referred to as a key performance indicator (KPI), to retrieve data for. This value describes the associated metric and consists of two or more terms, which are comprised of lowercase alphanumeric characters, separated by a hyphen. Examples are email-open-rate and successful-delivery-rate. For a list of valid values, see the Amazon Pinpoint Developer Guide.
    */
  var KpiName: __string = js.native
  /**
    * The  string that specifies which page of results to return in a paginated response. This parameter is currently not supported for application, campaign, and journey metrics.
    */
  var NextToken: js.UndefOr[__string] = js.native
  /**
    * The maximum number of items to include in each page of a paginated response. This parameter is currently not supported for application, campaign, and journey metrics.
    */
  var PageSize: js.UndefOr[__string] = js.native
  /**
    * The first date and time to retrieve data for, as part of an inclusive date range that filters the query results. This value should be in extended ISO 8601 format and use Coordinated Universal Time (UTC), for example: 2019-07-19T20:00:00Z for 8:00 PM UTC July 19, 2019. This value should also be fewer than 90 days from the current day.
    */
  var StartTime: js.UndefOr[__timestampIso8601] = js.native
}

object GetCampaignDateRangeKpiRequest {
  @scala.inline
  def apply(
    ApplicationId: __string,
    CampaignId: __string,
    KpiName: __string,
    EndTime: __timestampIso8601 = null,
    NextToken: __string = null,
    PageSize: __string = null,
    StartTime: __timestampIso8601 = null
  ): GetCampaignDateRangeKpiRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any], KpiName = KpiName.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignDateRangeKpiRequest]
  }
}

