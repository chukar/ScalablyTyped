package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTapesOutput extends js.Object {
  /**
    * A string that indicates the position at which to begin returning the next list of tapes. Use the marker in your next request to continue pagination of tapes. If there are no more tapes to list, this element does not appear in the response body.
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.Marker] = js.native
  var TapeInfos: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.TapeInfos] = js.native
}

object ListTapesOutput {
  @scala.inline
  def apply(Marker: Marker = null, TapeInfos: TapeInfos = null): ListTapesOutput = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (TapeInfos != null) __obj.updateDynamic("TapeInfos")(TapeInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTapesOutput]
  }
}

