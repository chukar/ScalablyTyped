package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreUpdateAttributesRequestMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UpdateAttributesRequest extends js.Object {
  /**
    * The GLOB wildcard for removing the attributes in the application
    */
  var Blacklist: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
}

object _UpdateAttributesRequest {
  @scala.inline
  def apply(Blacklist: js.Array[String] | Iterable[String] = null): _UpdateAttributesRequest = {
    val __obj = js.Dynamic.literal()
    if (Blacklist != null) __obj.updateDynamic("Blacklist")(Blacklist.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UpdateAttributesRequest]
  }
}

