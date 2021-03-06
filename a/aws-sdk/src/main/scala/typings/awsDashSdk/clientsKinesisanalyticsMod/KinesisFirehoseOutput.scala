package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisFirehoseOutput extends js.Object {
  /**
    * ARN of the destination Amazon Kinesis Firehose delivery stream to write to.
    */
  var ResourceARN: typings.awsDashSdk.clientsKinesisanalyticsMod.ResourceARN = js.native
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination stream on your behalf. You need to grant the necessary permissions to this role.
    */
  var RoleARN: typings.awsDashSdk.clientsKinesisanalyticsMod.RoleARN = js.native
}

object KinesisFirehoseOutput {
  @scala.inline
  def apply(ResourceARN: ResourceARN, RoleARN: RoleARN): KinesisFirehoseOutput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KinesisFirehoseOutput]
  }
}

