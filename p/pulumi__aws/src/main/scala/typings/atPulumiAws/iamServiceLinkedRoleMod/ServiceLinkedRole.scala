package typings.atPulumiAws.iamServiceLinkedRoleMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam/serviceLinkedRole", "ServiceLinkedRole")
@js.native
class ServiceLinkedRole protected () extends CustomResource {
  /**
    * Create a ServiceLinkedRole resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ServiceLinkedRoleArgs) = this()
  def this(name: String, args: ServiceLinkedRoleArgs, opts: CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) specifying the role.
    */
  val arn: Output[String] = js.native
  /**
    * The AWS service to which this role is attached. You use a string similar to a URL but without the `http://` in front. For example: `elasticbeanstalk.amazonaws.com`. To find the full list of services that support service-linked roles, check [the docs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html).
    */
  val awsServiceName: Output[String] = js.native
  /**
    * The creation date of the IAM role.
    */
  val createDate: Output[String] = js.native
  /**
    * Additional string appended to the role name. Not all AWS services support custom suffixes.
    */
  val customSuffix: Output[js.UndefOr[String]] = js.native
  /**
    * The description of the role.
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * The name of the role.
    */
  val name: Output[String] = js.native
  /**
    * The path of the role.
    */
  val path: Output[String] = js.native
  /**
    * The stable and unique string identifying the role.
    */
  val uniqueId: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/iam/serviceLinkedRole", "ServiceLinkedRole")
@js.native
object ServiceLinkedRole extends js.Object {
  /**
    * Get an existing ServiceLinkedRole resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ServiceLinkedRole = js.native
  def get(name: String, id: Input[ID], state: ServiceLinkedRoleState): ServiceLinkedRole = js.native
  def get(name: String, id: Input[ID], state: ServiceLinkedRoleState, opts: CustomResourceOptions): ServiceLinkedRole = js.native
  /**
    * Returns true if the given object is an instance of ServiceLinkedRole.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/serviceLinkedRole.ServiceLinkedRole */ Boolean = js.native
}

