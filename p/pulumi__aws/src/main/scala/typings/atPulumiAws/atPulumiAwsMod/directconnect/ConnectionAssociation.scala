package typings.atPulumiAws.atPulumiAwsMod.directconnect

import typings.atPulumiAws.directconnectConnectionAssociationMod.ConnectionAssociationArgs
import typings.atPulumiAws.directconnectConnectionAssociationMod.ConnectionAssociationState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "directconnect.ConnectionAssociation")
@js.native
class ConnectionAssociation protected ()
  extends typings.atPulumiAws.directconnectMod.ConnectionAssociation {
  /**
    * Create a ConnectionAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ConnectionAssociationArgs) = this()
  def this(name: String, args: ConnectionAssociationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "directconnect.ConnectionAssociation")
@js.native
object ConnectionAssociation extends js.Object {
  /**
    * Get an existing ConnectionAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.directconnectConnectionAssociationMod.ConnectionAssociation = js.native
  def get(name: String, id: Input[ID], state: ConnectionAssociationState): typings.atPulumiAws.directconnectConnectionAssociationMod.ConnectionAssociation = js.native
  def get(name: String, id: Input[ID], state: ConnectionAssociationState, opts: CustomResourceOptions): typings.atPulumiAws.directconnectConnectionAssociationMod.ConnectionAssociation = js.native
  /**
    * Returns true if the given object is an instance of ConnectionAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/connectionAssociation.ConnectionAssociation */ Boolean = js.native
}

