package typings.fhirDashKitDashClient

import typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.DeviceComponent
import typings.jsonDashPatch.jsonDashPatchMod.OpPatch
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceComponentHeaders extends js.Object {
  var JSONPatch: js.Array[OpPatch]
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: DeviceComponent
}

object Anon_DeviceComponentHeaders {
  @scala.inline
  def apply(
    JSONPatch: js.Array[OpPatch],
    id: String,
    resourceType: DeviceComponent,
    headers: Headers = null,
    options: Options = null
  ): Anon_DeviceComponentHeaders = {
    val __obj = js.Dynamic.literal(JSONPatch = JSONPatch.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeviceComponentHeaders]
  }
}

