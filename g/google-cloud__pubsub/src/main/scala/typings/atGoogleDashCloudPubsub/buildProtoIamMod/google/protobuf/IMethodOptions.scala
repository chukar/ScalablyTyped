package typings.atGoogleDashCloudPubsub.buildProtoIamMod.google.protobuf

import typings.atGoogleDashCloudPubsub.buildProtoIamMod.google.api.IHttpRule
import typings.atGoogleDashCloudPubsub.buildProtoIamMod.google.protobuf.MethodOptions.IdempotencyLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a MethodOptions. */
trait IMethodOptions extends js.Object {
  /** MethodOptions .google.api.http */
  @JSName(".google.api.http")
  var DotgoogleDotapiDothttp: js.UndefOr[IHttpRule | Null] = js.undefined
  /** MethodOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.undefined
  /** MethodOptions idempotencyLevel */
  var idempotencyLevel: js.UndefOr[IdempotencyLevel | Null] = js.undefined
  /** MethodOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.undefined
}

object IMethodOptions {
  @scala.inline
  def apply(
    DotgoogleDotapiDothttp: IHttpRule = null,
    deprecated: js.UndefOr[Boolean] = js.undefined,
    idempotencyLevel: IdempotencyLevel = null,
    uninterpretedOption: js.Array[IUninterpretedOption] = null
  ): IMethodOptions = {
    val __obj = js.Dynamic.literal()
    if (DotgoogleDotapiDothttp != null) __obj.updateDynamic(".google.api.http")(DotgoogleDotapiDothttp.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (idempotencyLevel != null) __obj.updateDynamic("idempotencyLevel")(idempotencyLevel.asInstanceOf[js.Any])
    if (uninterpretedOption != null) __obj.updateDynamic("uninterpretedOption")(uninterpretedOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMethodOptions]
  }
}

