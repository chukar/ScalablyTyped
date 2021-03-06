package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersSetLineItemMetadataRequest extends js.Object {
  var annotations: js.UndefOr[js.Array[OrderMerchantProvidedAnnotation]] = js.undefined
  var lineItemId: js.UndefOr[String] = js.undefined
  var operationId: js.UndefOr[String] = js.undefined
  var productId: js.UndefOr[String] = js.undefined
}

object OrdersSetLineItemMetadataRequest {
  @scala.inline
  def apply(
    annotations: js.Array[OrderMerchantProvidedAnnotation] = null,
    lineItemId: String = null,
    operationId: String = null,
    productId: String = null
  ): OrdersSetLineItemMetadataRequest = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrdersSetLineItemMetadataRequest]
  }
}

