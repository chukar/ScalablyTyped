package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBrokerInstanceOptionsRequest extends js.Object {
  /**
    * Filter response by engine type.
    */
  var EngineType: js.UndefOr[__string] = js.native
  /**
    * Filter response by host instance type.
    */
  var HostInstanceType: js.UndefOr[__string] = js.native
  /**
    * The maximum number of instance options that Amazon MQ can return per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsMqMod.MaxResults] = js.native
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[__string] = js.native
  /**
    * Filter response by storage type.
    */
  var StorageType: js.UndefOr[__string] = js.native
}

object DescribeBrokerInstanceOptionsRequest {
  @scala.inline
  def apply(
    EngineType: __string = null,
    HostInstanceType: __string = null,
    MaxResults: Int | Double = null,
    NextToken: __string = null,
    StorageType: __string = null
  ): DescribeBrokerInstanceOptionsRequest = {
    val __obj = js.Dynamic.literal()
    if (EngineType != null) __obj.updateDynamic("EngineType")(EngineType.asInstanceOf[js.Any])
    if (HostInstanceType != null) __obj.updateDynamic("HostInstanceType")(HostInstanceType.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StorageType != null) __obj.updateDynamic("StorageType")(StorageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBrokerInstanceOptionsRequest]
  }
}

