package typings.atPulumiAws.pinpointAppMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.pinpoint.AppCampaignHook
import typings.atPulumiAws.typesOutputMod.pinpoint.AppLimits
import typings.atPulumiAws.typesOutputMod.pinpoint.AppQuietTime
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/pinpoint/app", "App")
@js.native
class App protected () extends CustomResource {
  /**
    * Create a App resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: AppArgs) = this()
  def this(name: String, args: AppArgs, opts: CustomResourceOptions) = this()
  /**
    * The Application ID of the Pinpoint App.
    */
  val applicationId: Output[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the PinPoint Application
    */
  val arn: Output[String] = js.native
  /**
    * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own
    */
  val campaignHook: Output[js.UndefOr[AppCampaignHook]] = js.native
  /**
    * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own
    */
  val limits: Output[js.UndefOr[AppLimits]] = js.native
  /**
    * The application name. By default generated by this provider
    */
  val name: Output[String] = js.native
  /**
    * The name of the Pinpoint application. Conflicts with `name`
    */
  val namePrefix: Output[js.UndefOr[String]] = js.native
  /**
    * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own
    */
  val quietTime: Output[js.UndefOr[AppQuietTime]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/pinpoint/app", "App")
@js.native
object App extends js.Object {
  /**
    * Get an existing App resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): App = js.native
  def get(name: String, id: Input[ID], state: AppState): App = js.native
  def get(name: String, id: Input[ID], state: AppState, opts: CustomResourceOptions): App = js.native
  /**
    * Returns true if the given object is an instance of App.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/app.App */ Boolean = js.native
}

