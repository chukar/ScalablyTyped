package typings.atPulumiAws.sesMod

import typings.atPulumiAws.sesIdentityPolicyMod.IdentityPolicyArgs
import typings.atPulumiAws.sesIdentityPolicyMod.IdentityPolicyState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ses", "IdentityPolicy")
@js.native
class IdentityPolicy protected ()
  extends typings.atPulumiAws.sesIdentityPolicyMod.IdentityPolicy {
  /**
    * Create a IdentityPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: IdentityPolicyArgs) = this()
  def this(name: String, args: IdentityPolicyArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ses", "IdentityPolicy")
@js.native
object IdentityPolicy extends js.Object {
  /**
    * Get an existing IdentityPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.sesIdentityPolicyMod.IdentityPolicy = js.native
  def get(name: String, id: Input[ID], state: IdentityPolicyState): typings.atPulumiAws.sesIdentityPolicyMod.IdentityPolicy = js.native
  def get(name: String, id: Input[ID], state: IdentityPolicyState, opts: CustomResourceOptions): typings.atPulumiAws.sesIdentityPolicyMod.IdentityPolicy = js.native
  /**
    * Returns true if the given object is an instance of IdentityPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/identityPolicy.IdentityPolicy */ Boolean = js.native
}

