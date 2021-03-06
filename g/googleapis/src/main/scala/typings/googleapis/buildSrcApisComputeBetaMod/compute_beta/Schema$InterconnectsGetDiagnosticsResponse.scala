package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the InterconnectsGetDiagnosticsRequest.
  */
@js.native
trait Schema$InterconnectsGetDiagnosticsResponse extends js.Object {
  var result: js.UndefOr[Schema$InterconnectDiagnostics] = js.native
}

object Schema$InterconnectsGetDiagnosticsResponse {
  @scala.inline
  def apply(result: Schema$InterconnectDiagnostics = null): Schema$InterconnectsGetDiagnosticsResponse = {
    val __obj = js.Dynamic.literal()
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InterconnectsGetDiagnosticsResponse]
  }
}

