package typings.atPulumiAws.atPulumiAwsMod.wafregional

import typings.atPulumiAws.wafregionalByteMatchSetMod.ByteMatchSetArgs
import typings.atPulumiAws.wafregionalByteMatchSetMod.ByteMatchSetState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "wafregional.ByteMatchSet")
@js.native
class ByteMatchSet protected ()
  extends typings.atPulumiAws.wafregionalMod.ByteMatchSet {
  /**
    * Create a ByteMatchSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ByteMatchSetArgs) = this()
  def this(name: String, args: ByteMatchSetArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "wafregional.ByteMatchSet")
@js.native
object ByteMatchSet extends js.Object {
  /**
    * Get an existing ByteMatchSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.wafregionalByteMatchSetMod.ByteMatchSet = js.native
  def get(name: String, id: Input[ID], state: ByteMatchSetState): typings.atPulumiAws.wafregionalByteMatchSetMod.ByteMatchSet = js.native
  def get(name: String, id: Input[ID], state: ByteMatchSetState, opts: CustomResourceOptions): typings.atPulumiAws.wafregionalByteMatchSetMod.ByteMatchSet = js.native
  /**
    * Returns true if the given object is an instance of ByteMatchSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/byteMatchSet.ByteMatchSet */ Boolean = js.native
}

