package typings.atPulumiAws.cloudwatchLogGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.cloudwatchLogGroupMixinsMod.DecodedLogGroupEvent
import typings.atPulumiAws.cloudwatchLogGroupMixinsMod.LogGroupEventHandler
import typings.atPulumiAws.cloudwatchLogGroupMixinsMod.LogGroupEventSubscription
import typings.atPulumiAws.cloudwatchLogGroupMixinsMod.LogGroupEventSubscriptionArgs
import typings.atPulumiAws.lambdaLambdaMixinsMod.Callback
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch/logGroup", "LogGroup")
@js.native
class LogGroup protected () extends CustomResource {
  /**
    * Create a LogGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: LogGroupArgs) = this()
  def this(name: String, args: LogGroupArgs, opts: CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) specifying the log group.
    */
  val arn: Output[String] = js.native
  /**
    * The ARN of the KMS Key to use when encrypting log data. Please note, after the AWS KMS CMK is disassociated from the log group,
    * AWS CloudWatch Logs stops encrypting newly ingested data for the log group. All previously ingested data remains encrypted, and AWS CloudWatch Logs requires
    * permissions for the CMK whenever the encrypted data is requested.
    */
  val kmsKeyId: Output[js.UndefOr[String]] = js.native
  /**
    * The name of the log group. If omitted, this provider will assign a random, unique name.
    */
  val name: Output[String] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: Output[js.UndefOr[String]] = js.native
  /**
    * Specifies the number of days
    * you want to retain log events in the specified log group.
    */
  val retentionInDays: Output[js.UndefOr[Double]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Creates a new subscription to events fired from this LogGroup to the callback provided,
    * along with options to control the behavior of the subscription.
    *
    * The events will be provided in their decoded form.  Because this event hookup needs to
    * execute code to convert the raw messages, it can only be passed an [EntryPoint] callback,
    * not a [lambda.Function] instance.
    */
  def onDecodedEvent(name: String, callback: Callback[DecodedLogGroupEvent, Unit]): LogGroupEventSubscription = js.native
  def onDecodedEvent(name: String, callback: Callback[DecodedLogGroupEvent, Unit], args: LogGroupEventSubscriptionArgs): LogGroupEventSubscription = js.native
  def onDecodedEvent(
    name: String,
    callback: Callback[DecodedLogGroupEvent, Unit],
    args: LogGroupEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ): LogGroupEventSubscription = js.native
  /**
    * Creates a new subscription to events fired from this LogGroup to the handler provided,
    * along with options to control the behavior of the subscription.
    *
    * The events will be produced in raw (gzipped + base64 encoded) form.
    */
  def onEvent(name: String, handler: LogGroupEventHandler): LogGroupEventSubscription = js.native
  def onEvent(name: String, handler: LogGroupEventHandler, args: LogGroupEventSubscriptionArgs): LogGroupEventSubscription = js.native
  def onEvent(
    name: String,
    handler: LogGroupEventHandler,
    args: LogGroupEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ): LogGroupEventSubscription = js.native
}

/* static members */
@JSImport("@pulumi/aws/cloudwatch/logGroup", "LogGroup")
@js.native
object LogGroup extends js.Object {
  /**
    * Get an existing LogGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): LogGroup = js.native
  def get(name: String, id: Input[ID], state: LogGroupState): LogGroup = js.native
  def get(name: String, id: Input[ID], state: LogGroupState, opts: CustomResourceOptions): LogGroup = js.native
  /**
    * Returns true if the given object is an instance of LogGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logGroup.LogGroup */ Boolean = js.native
}

