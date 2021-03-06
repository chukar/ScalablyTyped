package typings.atPulumiAws.cfgConfigurationAggregatorMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.cfg.ConfigurationAggregatorAccountAggregationSource
import typings.atPulumiAws.typesOutputMod.cfg.ConfigurationAggregatorOrganizationAggregationSource
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cfg/configurationAggregator", "ConfigurationAggregator")
@js.native
class ConfigurationAggregator protected () extends CustomResource {
  /**
    * Create a ConfigurationAggregator resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ConfigurationAggregatorArgs) = this()
  def this(name: String, args: ConfigurationAggregatorArgs, opts: CustomResourceOptions) = this()
  /**
    * The account(s) to aggregate config data from as documented below.
    */
  val accountAggregationSource: Output[js.UndefOr[ConfigurationAggregatorAccountAggregationSource]] = js.native
  /**
    * The ARN of the aggregator
    */
  val arn: Output[String] = js.native
  /**
    * The name of the configuration aggregator.
    */
  val name: Output[String] = js.native
  /**
    * The organization to aggregate config data from as documented below.
    */
  val organizationAggregationSource: Output[js.UndefOr[ConfigurationAggregatorOrganizationAggregationSource]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cfg/configurationAggregator", "ConfigurationAggregator")
@js.native
object ConfigurationAggregator extends js.Object {
  /**
    * Get an existing ConfigurationAggregator resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ConfigurationAggregator = js.native
  def get(name: String, id: Input[ID], state: ConfigurationAggregatorState): ConfigurationAggregator = js.native
  def get(name: String, id: Input[ID], state: ConfigurationAggregatorState, opts: CustomResourceOptions): ConfigurationAggregator = js.native
  /**
    * Returns true if the given object is an instance of ConfigurationAggregator.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/configurationAggregator.ConfigurationAggregator */ Boolean = js.native
}

