package typings.atPulumiAws.iamUserPolicyMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam/userPolicy", "UserPolicy")
@js.native
class UserPolicy protected () extends CustomResource {
  /**
    * Create a UserPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: UserPolicyArgs) = this()
  def this(name: String, args: UserPolicyArgs, opts: CustomResourceOptions) = this()
  /**
    * The name of the policy. If omitted, this provider will assign a random, unique name.
    */
  val name: Output[String] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: Output[js.UndefOr[String]] = js.native
  val policy: Output[String] = js.native
  /**
    * IAM user to which to attach this policy.
    */
  val user: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/iam/userPolicy", "UserPolicy")
@js.native
object UserPolicy extends js.Object {
  /**
    * Get an existing UserPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): UserPolicy = js.native
  def get(name: String, id: Input[ID], state: UserPolicyState): UserPolicy = js.native
  def get(name: String, id: Input[ID], state: UserPolicyState, opts: CustomResourceOptions): UserPolicy = js.native
  /**
    * Returns true if the given object is an instance of UserPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/userPolicy.UserPolicy */ Boolean = js.native
}

