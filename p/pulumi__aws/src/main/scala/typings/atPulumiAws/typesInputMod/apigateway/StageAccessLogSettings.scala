package typings.atPulumiAws.typesInputMod.apigateway

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StageAccessLogSettings extends js.Object {
  /**
    * ARN of the log group to send the logs to. Automatically removes trailing `:*` if present.
    */
  var destinationArn: Input[String] = js.native
  /**
    * The formatting and values recorded in the logs.
    * For more information on configuring the log format rules visit the AWS [documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html)
    */
  var format: Input[String] = js.native
}

object StageAccessLogSettings {
  @scala.inline
  def apply(destinationArn: Input[String], format: Input[String]): StageAccessLogSettings = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StageAccessLogSettings]
  }
}

