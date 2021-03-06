package typings.googleapis.buildSrcApisProximitybeaconV1beta1Mod.proximitybeacon_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Diagnostics for a single beacon.
  */
@js.native
trait Schema$Diagnostics extends js.Object {
  /**
    * An unordered list of Alerts that the beacon has.
    */
  var alerts: js.UndefOr[js.Array[String]] = js.native
  /**
    * Resource name of the beacon. For Eddystone-EID beacons, this may be the
    * beacon&#39;s current EID, or the beacon&#39;s &quot;stable&quot;
    * Eddystone-UID.
    */
  var beaconName: js.UndefOr[String] = js.native
  /**
    * The date when the battery is expected to be low. If the value is missing
    * then there is no estimate for when the battery will be low. This value is
    * only an estimate, not an exact date.
    */
  var estimatedLowBatteryDate: js.UndefOr[Schema$Date] = js.native
}

object Schema$Diagnostics {
  @scala.inline
  def apply(
    alerts: js.Array[String] = null,
    beaconName: String = null,
    estimatedLowBatteryDate: Schema$Date = null
  ): Schema$Diagnostics = {
    val __obj = js.Dynamic.literal()
    if (alerts != null) __obj.updateDynamic("alerts")(alerts.asInstanceOf[js.Any])
    if (beaconName != null) __obj.updateDynamic("beaconName")(beaconName.asInstanceOf[js.Any])
    if (estimatedLowBatteryDate != null) __obj.updateDynamic("estimatedLowBatteryDate")(estimatedLowBatteryDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Diagnostics]
  }
}

