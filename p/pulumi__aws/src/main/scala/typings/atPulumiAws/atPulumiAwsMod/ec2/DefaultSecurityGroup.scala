package typings.atPulumiAws.atPulumiAwsMod.ec2

import typings.atPulumiAws.ec2DefaultSecurityGroupMod.DefaultSecurityGroupArgs
import typings.atPulumiAws.ec2DefaultSecurityGroupMod.DefaultSecurityGroupState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.DefaultSecurityGroup")
@js.native
class DefaultSecurityGroup protected ()
  extends typings.atPulumiAws.ec2Mod.DefaultSecurityGroup {
  /**
    * Create a DefaultSecurityGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: DefaultSecurityGroupArgs) = this()
  def this(name: String, args: DefaultSecurityGroupArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "ec2.DefaultSecurityGroup")
@js.native
object DefaultSecurityGroup extends js.Object {
  /**
    * Get an existing DefaultSecurityGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.ec2DefaultSecurityGroupMod.DefaultSecurityGroup = js.native
  def get(name: String, id: Input[ID], state: DefaultSecurityGroupState): typings.atPulumiAws.ec2DefaultSecurityGroupMod.DefaultSecurityGroup = js.native
  def get(name: String, id: Input[ID], state: DefaultSecurityGroupState, opts: CustomResourceOptions): typings.atPulumiAws.ec2DefaultSecurityGroupMod.DefaultSecurityGroup = js.native
  /**
    * Returns true if the given object is an instance of DefaultSecurityGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultSecurityGroup.DefaultSecurityGroup */ Boolean = js.native
}

