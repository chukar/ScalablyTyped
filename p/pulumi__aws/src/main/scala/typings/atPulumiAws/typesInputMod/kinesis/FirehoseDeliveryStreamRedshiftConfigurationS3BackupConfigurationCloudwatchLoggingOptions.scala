package typings.atPulumiAws.typesInputMod.kinesis

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptions extends js.Object {
  /**
    * Defaults to `true`. Set it to `false` if you want to disable format conversion while preserving the configuration details.
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The CloudWatch group name for logging. This value is required if `enabled` is true.
    */
  var logGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * The CloudWatch log stream name for logging. This value is required if `enabled` is true.
    */
  var logStreamName: js.UndefOr[Input[String]] = js.native
}

object FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptions {
  @scala.inline
  def apply(
    enabled: Input[Boolean] = null,
    logGroupName: Input[String] = null,
    logStreamName: Input[String] = null
  ): FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptions = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName.asInstanceOf[js.Any])
    if (logStreamName != null) __obj.updateDynamic("logStreamName")(logStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptions]
  }
}

