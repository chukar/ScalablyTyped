package typings.openapiDashResponseDashValidator.openapiDashResponseDashValidatorMod

import typings.openapiDashResponseDashValidator.Anon_Errors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openapi-response-validator", JSImport.Default)
@js.native
class default protected () extends OpenAPIResponseValidator {
  def this(args: OpenAPIResponseValidatorArgs) = this()
  /* CompleteClass */
  override var errorMapper: js.Any = js.native
  /* CompleteClass */
  override var validators: js.Any = js.native
  /* CompleteClass */
  override def validateResponse(statusCode: String, response: js.Any): Unit | OpenAPIResponseValidatorValidationError = js.native
  /* CompleteClass */
  override def validateResponse(statusCode: js.Any, response: js.Any): Anon_Errors = js.native
}

