package typings.atPulumiAws.iamMod

import typings.atPulumiAws.iamSshKeyMod.SshKeyArgs
import typings.atPulumiAws.iamSshKeyMod.SshKeyState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam", "SshKey")
@js.native
class SshKey protected ()
  extends typings.atPulumiAws.iamSshKeyMod.SshKey {
  /**
    * Create a SshKey resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SshKeyArgs) = this()
  def this(name: String, args: SshKeyArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/iam", "SshKey")
@js.native
object SshKey extends js.Object {
  /**
    * Get an existing SshKey resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.iamSshKeyMod.SshKey = js.native
  def get(name: String, id: Input[ID], state: SshKeyState): typings.atPulumiAws.iamSshKeyMod.SshKey = js.native
  def get(name: String, id: Input[ID], state: SshKeyState, opts: CustomResourceOptions): typings.atPulumiAws.iamSshKeyMod.SshKey = js.native
  /**
    * Returns true if the given object is an instance of SshKey.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/sshKey.SshKey */ Boolean = js.native
}

