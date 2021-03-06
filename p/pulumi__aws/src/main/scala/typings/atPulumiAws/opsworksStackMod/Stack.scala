package typings.atPulumiAws.opsworksStackMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.opsworks.StackCustomCookbooksSource
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/opsworks/stack", "Stack")
@js.native
class Stack protected () extends CustomResource {
  /**
    * Create a Stack resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: StackArgs) = this()
  def this(name: String, args: StackArgs, opts: CustomResourceOptions) = this()
  /**
    * If set to `"LATEST"`, OpsWorks will automatically install the latest version.
    */
  val agentVersion: Output[String] = js.native
  val arn: Output[String] = js.native
  /**
    * If `manageBerkshelf` is enabled, the version of Berkshelf to use.
    */
  val berkshelfVersion: Output[js.UndefOr[String]] = js.native
  /**
    * Color to paint next to the stack's resources in the OpsWorks console.
    */
  val color: Output[js.UndefOr[String]] = js.native
  /**
    * Name of the configuration manager to use. Defaults to "Chef".
    */
  val configurationManagerName: Output[js.UndefOr[String]] = js.native
  /**
    * Version of the configuration manager to use. Defaults to "11.4".
    */
  val configurationManagerVersion: Output[js.UndefOr[String]] = js.native
  /**
    * When `useCustomCookbooks` is set, provide this sub-object as
    * described below.
    */
  val customCookbooksSources: Output[js.Array[StackCustomCookbooksSource]] = js.native
  /**
    * Custom JSON attributes to apply to the entire stack.
    */
  val customJson: Output[js.UndefOr[String]] = js.native
  /**
    * Name of the availability zone where instances will be created
    * by default. This is required unless you set `vpcId`.
    */
  val defaultAvailabilityZone: Output[String] = js.native
  /**
    * The ARN of an IAM Instance Profile that created instances
    * will have by default.
    */
  val defaultInstanceProfileArn: Output[String] = js.native
  /**
    * Name of OS that will be installed on instances by default.
    */
  val defaultOs: Output[js.UndefOr[String]] = js.native
  /**
    * Name of the type of root device instances will have by default.
    */
  val defaultRootDeviceType: Output[js.UndefOr[String]] = js.native
  /**
    * Name of the SSH keypair that instances will have by default.
    */
  val defaultSshKeyName: Output[js.UndefOr[String]] = js.native
  /**
    * Id of the subnet in which instances will be created by default. Mandatory
    * if `vpcId` is set, and forbidden if it isn't.
    */
  val defaultSubnetId: Output[String] = js.native
  /**
    * Keyword representing the naming scheme that will be used for instance hostnames
    * within this stack.
    */
  val hostnameTheme: Output[js.UndefOr[String]] = js.native
  /**
    * Boolean value controlling whether Opsworks will run Berkshelf for this stack.
    */
  val manageBerkshelf: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The name of the stack.
    */
  val name: Output[String] = js.native
  /**
    * The name of the region where the stack will exist.
    */
  val region: Output[String] = js.native
  /**
    * The ARN of an IAM role that the OpsWorks service will act as.
    */
  val serviceRoleArn: Output[String] = js.native
  val stackEndpoint: Output[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Boolean value controlling whether the custom cookbook settings are
    * enabled.
    */
  val useCustomCookbooks: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Boolean value controlling whether the standard OpsWorks
    * security groups apply to created instances.
    */
  val useOpsworksSecurityGroups: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The id of the VPC that this stack belongs to.
    */
  val vpcId: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/opsworks/stack", "Stack")
@js.native
object Stack extends js.Object {
  /**
    * Get an existing Stack resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Stack = js.native
  def get(name: String, id: Input[ID], state: StackState): Stack = js.native
  def get(name: String, id: Input[ID], state: StackState, opts: CustomResourceOptions): Stack = js.native
  /**
    * Returns true if the given object is an instance of Stack.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/stack.Stack */ Boolean = js.native
}

