package typings.atPulumiAws.batchJobDefinitionMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.batch.JobDefinitionRetryStrategy
import typings.atPulumiAws.typesOutputMod.batch.JobDefinitionTimeout
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/batch/jobDefinition", "JobDefinition")
@js.native
class JobDefinition protected () extends CustomResource {
  /**
    * Create a JobDefinition resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: JobDefinitionArgs) = this()
  def this(name: String, args: JobDefinitionArgs, opts: CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name of the job definition.
    */
  val arn: Output[String] = js.native
  /**
    * A valid [container properties](http://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html)
    * provided as a single valid JSON document. This parameter is required if the `type` parameter is `container`.
    */
  val containerProperties: Output[js.UndefOr[String]] = js.native
  /**
    * Specifies the name of the job definition.
    */
  val name: Output[String] = js.native
  /**
    * Specifies the parameter substitution placeholders to set in the job definition.
    */
  val parameters: Output[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * Specifies the retry strategy to use for failed jobs that are submitted with this job definition.
    * Maximum number of `retryStrategy` is `1`.  Defined below.
    */
  val retryStrategy: Output[js.UndefOr[JobDefinitionRetryStrategy]] = js.native
  /**
    * The revision of the job definition.
    */
  val revision: Output[Double] = js.native
  /**
    * Specifies the timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
    */
  val timeout: Output[js.UndefOr[JobDefinitionTimeout]] = js.native
  /**
    * The type of job definition.  Must be `container`
    */
  val `type`: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/batch/jobDefinition", "JobDefinition")
@js.native
object JobDefinition extends js.Object {
  /**
    * Get an existing JobDefinition resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): JobDefinition = js.native
  def get(name: String, id: Input[ID], state: JobDefinitionState): JobDefinition = js.native
  def get(name: String, id: Input[ID], state: JobDefinitionState, opts: CustomResourceOptions): JobDefinition = js.native
  /**
    * Returns true if the given object is an instance of JobDefinition.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/batch/jobDefinition.JobDefinition */ Boolean = js.native
}

