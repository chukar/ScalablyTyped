package typings.googleapis.buildSrcApisVisionV1p2beta1Mod.vision_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters for web detection request.
  */
@js.native
trait Schema$GoogleCloudVisionV1p2beta1WebDetectionParams extends js.Object {
  /**
    * Whether to include results derived from the geo information in the image.
    */
  var includeGeoResults: js.UndefOr[Boolean] = js.native
}

object Schema$GoogleCloudVisionV1p2beta1WebDetectionParams {
  @scala.inline
  def apply(includeGeoResults: js.UndefOr[Boolean] = js.undefined): Schema$GoogleCloudVisionV1p2beta1WebDetectionParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeGeoResults)) __obj.updateDynamic("includeGeoResults")(includeGeoResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p2beta1WebDetectionParams]
  }
}

