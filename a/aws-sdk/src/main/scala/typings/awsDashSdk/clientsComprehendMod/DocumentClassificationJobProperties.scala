package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentClassificationJobProperties extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS identity and Access Management (IAM) role that grants Amazon Comprehend read access to your input data.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.native
  /**
    * The Amazon Resource Name (ARN) that identifies the document classifier. 
    */
  var DocumentClassifierArn: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.DocumentClassifierArn] = js.native
  /**
    * The time that the document classification job completed.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  /**
    * The input data configuration that you supplied when you created the document classification job.
    */
  var InputDataConfig: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.InputDataConfig] = js.native
  /**
    * The identifier assigned to the document classification job.
    */
  var JobId: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.JobId] = js.native
  /**
    * The name that you assigned to the document classification job.
    */
  var JobName: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.JobName] = js.native
  /**
    * The current status of the document classification job. If the status is FAILED, the Message field shows the reason for the failure.
    */
  var JobStatus: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.JobStatus] = js.native
  /**
    * A description of the status of the job.
    */
  var Message: js.UndefOr[AnyLengthString] = js.native
  /**
    * The output data configuration that you supplied when you created the document classification job.
    */
  var OutputDataConfig: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.OutputDataConfig] = js.native
  /**
    * The time that the document classification job was submitted for processing.
    */
  var SubmitTime: js.UndefOr[Timestamp] = js.native
  /**
    * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the following formats:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"    Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.native
  /**
    *  Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you are using for your document classification job. For more information, see Amazon VPC. 
    */
  var VpcConfig: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.VpcConfig] = js.native
}

object DocumentClassificationJobProperties {
  @scala.inline
  def apply(
    DataAccessRoleArn: IamRoleArn = null,
    DocumentClassifierArn: DocumentClassifierArn = null,
    EndTime: Timestamp = null,
    InputDataConfig: InputDataConfig = null,
    JobId: JobId = null,
    JobName: JobName = null,
    JobStatus: JobStatus = null,
    Message: AnyLengthString = null,
    OutputDataConfig: OutputDataConfig = null,
    SubmitTime: Timestamp = null,
    VolumeKmsKeyId: KmsKeyId = null,
    VpcConfig: VpcConfig = null
  ): DocumentClassificationJobProperties = {
    val __obj = js.Dynamic.literal()
    if (DataAccessRoleArn != null) __obj.updateDynamic("DataAccessRoleArn")(DataAccessRoleArn.asInstanceOf[js.Any])
    if (DocumentClassifierArn != null) __obj.updateDynamic("DocumentClassifierArn")(DocumentClassifierArn.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (InputDataConfig != null) __obj.updateDynamic("InputDataConfig")(InputDataConfig.asInstanceOf[js.Any])
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    if (JobName != null) __obj.updateDynamic("JobName")(JobName.asInstanceOf[js.Any])
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (OutputDataConfig != null) __obj.updateDynamic("OutputDataConfig")(OutputDataConfig.asInstanceOf[js.Any])
    if (SubmitTime != null) __obj.updateDynamic("SubmitTime")(SubmitTime.asInstanceOf[js.Any])
    if (VolumeKmsKeyId != null) __obj.updateDynamic("VolumeKmsKeyId")(VolumeKmsKeyId.asInstanceOf[js.Any])
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentClassificationJobProperties]
  }
}

