package typings.atPulumiAws.sesMod

import typings.atPulumiAws.sesDomainIdentityMod.DomainIdentityArgs
import typings.atPulumiAws.sesDomainIdentityMod.DomainIdentityState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ses", "DomainIdentity")
@js.native
class DomainIdentity protected ()
  extends typings.atPulumiAws.sesDomainIdentityMod.DomainIdentity {
  /**
    * Create a DomainIdentity resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DomainIdentityArgs) = this()
  def this(name: String, args: DomainIdentityArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ses", "DomainIdentity")
@js.native
object DomainIdentity extends js.Object {
  /**
    * Get an existing DomainIdentity resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.sesDomainIdentityMod.DomainIdentity = js.native
  def get(name: String, id: Input[ID], state: DomainIdentityState): typings.atPulumiAws.sesDomainIdentityMod.DomainIdentity = js.native
  def get(name: String, id: Input[ID], state: DomainIdentityState, opts: CustomResourceOptions): typings.atPulumiAws.sesDomainIdentityMod.DomainIdentity = js.native
  /**
    * Returns true if the given object is an instance of DomainIdentity.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/domainIdentity.DomainIdentity */ Boolean = js.native
}

