package typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `getVoiceModel` operation. */
trait GetVoiceModelParams extends js.Object {
  /** The customization ID (GUID) of the custom voice model. You must make the request with service credentials created for the instance of the service that owns the custom model. */
  var customization_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object GetVoiceModelParams {
  @scala.inline
  def apply(
    customization_id: String,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): GetVoiceModelParams = {
    val __obj = js.Dynamic.literal(customization_id = customization_id.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceModelParams]
  }
}

