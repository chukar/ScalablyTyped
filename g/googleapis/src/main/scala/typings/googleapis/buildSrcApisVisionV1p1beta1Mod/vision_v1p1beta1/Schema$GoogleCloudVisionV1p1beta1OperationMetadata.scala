package typings.googleapis.buildSrcApisVisionV1p1beta1Mod.vision_v1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains metadata for the BatchAnnotateImages operation.
  */
@js.native
trait Schema$GoogleCloudVisionV1p1beta1OperationMetadata extends js.Object {
  /**
    * The time when the batch request was received.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Current state of the batch operation.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The time when the operation result was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudVisionV1p1beta1OperationMetadata {
  @scala.inline
  def apply(createTime: String = null, state: String = null, updateTime: String = null): Schema$GoogleCloudVisionV1p1beta1OperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p1beta1OperationMetadata]
  }
}

