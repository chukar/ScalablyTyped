package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSetDimensionMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.EXCLUSIVE
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.INCLUSIVE
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SetDimension extends js.Object {
  /**
    * The type of dimension:
    *
    * INCLUSIVE - Endpoints that match the criteria are included in the segment.
    *
    * EXCLUSIVE - Endpoints that match the criteria are excluded from the segment.
    */
  var DimensionType: js.UndefOr[INCLUSIVE | EXCLUSIVE | String] = js.undefined
  /**
    * The criteria values for the segment dimension. Endpoints with matching attribute values are included or excluded from the segment, depending on the setting for Type.
    */
  var Values: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
}

object _SetDimension {
  @scala.inline
  def apply(
    DimensionType: INCLUSIVE | EXCLUSIVE | String = null,
    Values: js.Array[String] | Iterable[String] = null
  ): _SetDimension = {
    val __obj = js.Dynamic.literal()
    if (DimensionType != null) __obj.updateDynamic("DimensionType")(DimensionType.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SetDimension]
  }
}

