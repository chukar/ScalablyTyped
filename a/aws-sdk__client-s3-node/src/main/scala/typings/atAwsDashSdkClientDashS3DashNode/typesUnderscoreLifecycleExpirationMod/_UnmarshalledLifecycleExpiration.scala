package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreLifecycleExpirationMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledLifecycleExpiration extends _LifecycleExpiration {
  /**
    * <p>Indicates at what date the object is to be moved or deleted. Should be in GMT ISO 8601 Format.</p>
    */
  @JSName("Date")
  var Date__UnmarshalledLifecycleExpiration: js.UndefOr[Date] = js.undefined
}

object _UnmarshalledLifecycleExpiration {
  @scala.inline
  def apply(
    Date: Date = null,
    Days: Int | Double = null,
    ExpiredObjectDeleteMarker: js.UndefOr[Boolean] = js.undefined
  ): _UnmarshalledLifecycleExpiration = {
    val __obj = js.Dynamic.literal()
    if (Date != null) __obj.updateDynamic("Date")(Date.asInstanceOf[js.Any])
    if (Days != null) __obj.updateDynamic("Days")(Days.asInstanceOf[js.Any])
    if (!js.isUndefined(ExpiredObjectDeleteMarker)) __obj.updateDynamic("ExpiredObjectDeleteMarker")(ExpiredObjectDeleteMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledLifecycleExpiration]
  }
}

