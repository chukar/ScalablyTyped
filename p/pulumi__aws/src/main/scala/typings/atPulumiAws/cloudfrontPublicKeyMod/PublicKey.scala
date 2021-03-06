package typings.atPulumiAws.cloudfrontPublicKeyMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudfront/publicKey", "PublicKey")
@js.native
class PublicKey protected () extends CustomResource {
  /**
    * Create a PublicKey resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PublicKeyArgs) = this()
  def this(name: String, args: PublicKeyArgs, opts: CustomResourceOptions) = this()
  /**
    * Internal value used by CloudFront to allow future updates to the public key configuration.
    */
  val callerReference: Output[String] = js.native
  /**
    * An optional comment about the public key.
    */
  val comment: Output[js.UndefOr[String]] = js.native
  /**
    * The encoded public key that you want to add to CloudFront to use with features like field-level encryption.
    */
  val encodedKey: Output[String] = js.native
  /**
    * The current version of the public key. For example: `E2QWRUHAPOMQZL`.
    */
  val etag: Output[String] = js.native
  /**
    * The name for the public key. By default generated by this provider.
    */
  val name: Output[String] = js.native
  /**
    * The name for the public key. Conflicts with `name`.
    */
  val namePrefix: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cloudfront/publicKey", "PublicKey")
@js.native
object PublicKey extends js.Object {
  /**
    * Get an existing PublicKey resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): PublicKey = js.native
  def get(name: String, id: Input[ID], state: PublicKeyState): PublicKey = js.native
  def get(name: String, id: Input[ID], state: PublicKeyState, opts: CustomResourceOptions): PublicKey = js.native
  /**
    * Returns true if the given object is an instance of PublicKey.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudfront/publicKey.PublicKey */ Boolean = js.native
}

