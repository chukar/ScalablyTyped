package typings.atPulumiAws.atPulumiAwsMod.wafregional

import typings.atPulumiAws.wafregionalRegexPatternSetMod.RegexPatternSetArgs
import typings.atPulumiAws.wafregionalRegexPatternSetMod.RegexPatternSetState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "wafregional.RegexPatternSet")
@js.native
class RegexPatternSet protected ()
  extends typings.atPulumiAws.wafregionalMod.RegexPatternSet {
  /**
    * Create a RegexPatternSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: RegexPatternSetArgs) = this()
  def this(name: String, args: RegexPatternSetArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "wafregional.RegexPatternSet")
@js.native
object RegexPatternSet extends js.Object {
  /**
    * Get an existing RegexPatternSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.wafregionalRegexPatternSetMod.RegexPatternSet = js.native
  def get(name: String, id: Input[ID], state: RegexPatternSetState): typings.atPulumiAws.wafregionalRegexPatternSetMod.RegexPatternSet = js.native
  def get(name: String, id: Input[ID], state: RegexPatternSetState, opts: CustomResourceOptions): typings.atPulumiAws.wafregionalRegexPatternSetMod.RegexPatternSet = js.native
  /**
    * Returns true if the given object is an instance of RegexPatternSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/regexPatternSet.RegexPatternSet */ Boolean = js.native
}

