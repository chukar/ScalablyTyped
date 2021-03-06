package typings.atPulumiAws.atPulumiAwsMod.directconnect

import typings.atPulumiAws.directconnectPrivateVirtualInterfaceMod.PrivateVirtualInterfaceArgs
import typings.atPulumiAws.directconnectPrivateVirtualInterfaceMod.PrivateVirtualInterfaceState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "directconnect.PrivateVirtualInterface")
@js.native
class PrivateVirtualInterface protected ()
  extends typings.atPulumiAws.directconnectMod.PrivateVirtualInterface {
  /**
    * Create a PrivateVirtualInterface resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PrivateVirtualInterfaceArgs) = this()
  def this(name: String, args: PrivateVirtualInterfaceArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "directconnect.PrivateVirtualInterface")
@js.native
object PrivateVirtualInterface extends js.Object {
  /**
    * Get an existing PrivateVirtualInterface resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.directconnectPrivateVirtualInterfaceMod.PrivateVirtualInterface = js.native
  def get(name: String, id: Input[ID], state: PrivateVirtualInterfaceState): typings.atPulumiAws.directconnectPrivateVirtualInterfaceMod.PrivateVirtualInterface = js.native
  def get(name: String, id: Input[ID], state: PrivateVirtualInterfaceState, opts: CustomResourceOptions): typings.atPulumiAws.directconnectPrivateVirtualInterfaceMod.PrivateVirtualInterface = js.native
  /**
    * Returns true if the given object is an instance of PrivateVirtualInterface.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/privateVirtualInterface.PrivateVirtualInterface */ Boolean = js.native
}

