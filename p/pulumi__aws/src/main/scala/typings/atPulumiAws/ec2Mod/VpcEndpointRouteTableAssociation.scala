package typings.atPulumiAws.ec2Mod

import typings.atPulumiAws.ec2VpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociationArgs
import typings.atPulumiAws.ec2VpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociationState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "VpcEndpointRouteTableAssociation")
@js.native
class VpcEndpointRouteTableAssociation protected ()
  extends typings.atPulumiAws.ec2VpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociation {
  /**
    * Create a VpcEndpointRouteTableAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpcEndpointRouteTableAssociationArgs) = this()
  def this(name: String, args: VpcEndpointRouteTableAssociationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ec2", "VpcEndpointRouteTableAssociation")
@js.native
object VpcEndpointRouteTableAssociation extends js.Object {
  /**
    * Get an existing VpcEndpointRouteTableAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.ec2VpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociation = js.native
  def get(name: String, id: Input[ID], state: VpcEndpointRouteTableAssociationState): typings.atPulumiAws.ec2VpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociation = js.native
  def get(
    name: String,
    id: Input[ID],
    state: VpcEndpointRouteTableAssociationState,
    opts: CustomResourceOptions
  ): typings.atPulumiAws.ec2VpcEndpointRouteTableAssociationMod.VpcEndpointRouteTableAssociation = js.native
  /**
    * Returns true if the given object is an instance of VpcEndpointRouteTableAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpointRouteTableAssociation.VpcEndpointRouteTableAssociation */ Boolean = js.native
}

