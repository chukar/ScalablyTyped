package typings.atPulumiAws.atPulumiAwsMod.ec2

import typings.atPulumiAws.ec2AmiCopyMod.AmiCopyArgs
import typings.atPulumiAws.ec2AmiCopyMod.AmiCopyState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.AmiCopy")
@js.native
class AmiCopy protected ()
  extends typings.atPulumiAws.ec2Mod.AmiCopy {
  /**
    * Create a AmiCopy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AmiCopyArgs) = this()
  def this(name: String, args: AmiCopyArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "ec2.AmiCopy")
@js.native
object AmiCopy extends js.Object {
  /**
    * Get an existing AmiCopy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.ec2AmiCopyMod.AmiCopy = js.native
  def get(name: String, id: Input[ID], state: AmiCopyState): typings.atPulumiAws.ec2AmiCopyMod.AmiCopy = js.native
  def get(name: String, id: Input[ID], state: AmiCopyState, opts: CustomResourceOptions): typings.atPulumiAws.ec2AmiCopyMod.AmiCopy = js.native
  /**
    * Returns true if the given object is an instance of AmiCopy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/amiCopy.AmiCopy */ Boolean = js.native
}

