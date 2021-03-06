package typings.atPulumiAws.atPulumiAwsMod.opsworks

import typings.atPulumiAws.opsworksPermissionMod.PermissionArgs
import typings.atPulumiAws.opsworksPermissionMod.PermissionState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "opsworks.Permission")
@js.native
class Permission protected ()
  extends typings.atPulumiAws.opsworksMod.Permission {
  /**
    * Create a Permission resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PermissionArgs) = this()
  def this(name: String, args: PermissionArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "opsworks.Permission")
@js.native
object Permission extends js.Object {
  /**
    * Get an existing Permission resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.opsworksPermissionMod.Permission = js.native
  def get(name: String, id: Input[ID], state: PermissionState): typings.atPulumiAws.opsworksPermissionMod.Permission = js.native
  def get(name: String, id: Input[ID], state: PermissionState, opts: CustomResourceOptions): typings.atPulumiAws.opsworksPermissionMod.Permission = js.native
  /**
    * Returns true if the given object is an instance of Permission.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/permission.Permission */ Boolean = js.native
}

