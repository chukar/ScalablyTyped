package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.capabilities_negotiation_error
import typings.chromeDashApps.chromeDashAppsStrings.connection_error
import typings.chromeDashApps.chromeDashAppsStrings.media_pipeline_error
import typings.chromeDashApps.chromeDashAppsStrings.timeout_error
import typings.chromeDashApps.chromeDashAppsStrings.unknown_error_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CAPABILITIESNEGOTIATIONERROR extends js.Object {
  var CAPABILITIES_NEGOTIATION_ERROR: capabilities_negotiation_error
  var CONNECTION_ERROR: connection_error
  var MEDIA_PIPELINE_ERROR: media_pipeline_error
  var TIMEOUT_ERROR: timeout_error
  var UNKNOWN_ERROR: unknown_error_
}

object Anon_CAPABILITIESNEGOTIATIONERROR {
  @scala.inline
  def apply(
    CAPABILITIES_NEGOTIATION_ERROR: capabilities_negotiation_error,
    CONNECTION_ERROR: connection_error,
    MEDIA_PIPELINE_ERROR: media_pipeline_error,
    TIMEOUT_ERROR: timeout_error,
    UNKNOWN_ERROR: unknown_error_
  ): Anon_CAPABILITIESNEGOTIATIONERROR = {
    val __obj = js.Dynamic.literal(CAPABILITIES_NEGOTIATION_ERROR = CAPABILITIES_NEGOTIATION_ERROR.asInstanceOf[js.Any], CONNECTION_ERROR = CONNECTION_ERROR.asInstanceOf[js.Any], MEDIA_PIPELINE_ERROR = MEDIA_PIPELINE_ERROR.asInstanceOf[js.Any], TIMEOUT_ERROR = TIMEOUT_ERROR.asInstanceOf[js.Any], UNKNOWN_ERROR = UNKNOWN_ERROR.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CAPABILITIESNEGOTIATIONERROR]
  }
}

