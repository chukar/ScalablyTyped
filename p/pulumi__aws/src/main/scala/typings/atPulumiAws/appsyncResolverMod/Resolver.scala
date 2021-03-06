package typings.atPulumiAws.appsyncResolverMod

import typings.atPulumiAws.typesOutputMod.appsync.ResolverPipelineConfig
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appsync/resolver", "Resolver")
@js.native
class Resolver protected () extends CustomResource {
  /**
    * Create a Resolver resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ResolverArgs) = this()
  def this(name: String, args: ResolverArgs, opts: CustomResourceOptions) = this()
  /**
    * The API ID for the GraphQL API.
    */
  val apiId: Output[String] = js.native
  /**
    * The ARN
    */
  val arn: Output[String] = js.native
  /**
    * The DataSource name.
    */
  val dataSource: Output[js.UndefOr[String]] = js.native
  /**
    * The field name from the schema defined in the GraphQL API.
    */
  val field: Output[String] = js.native
  /**
    * The resolver type. Valid values are `UNIT` and `PIPELINE`.
    */
  val kind: Output[js.UndefOr[String]] = js.native
  /**
    * The PipelineConfig. A `pipelineConfig` block is documented below.
    */
  val pipelineConfig: Output[js.UndefOr[ResolverPipelineConfig]] = js.native
  /**
    * The request mapping template for UNIT resolver or 'before mapping template' for PIPELINE resolver.
    */
  val requestTemplate: Output[String] = js.native
  /**
    * The response mapping template for UNIT resolver or 'after mapping template' for PIPELINE resolver.
    */
  val responseTemplate: Output[String] = js.native
  /**
    * The type name from the schema defined in the GraphQL API.
    */
  val `type`: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/appsync/resolver", "Resolver")
@js.native
object Resolver extends js.Object {
  /**
    * Get an existing Resolver resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Resolver = js.native
  def get(name: String, id: Input[ID], state: ResolverState): Resolver = js.native
  def get(name: String, id: Input[ID], state: ResolverState, opts: CustomResourceOptions): Resolver = js.native
  /**
    * Returns true if the given object is an instance of Resolver.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/resolver.Resolver */ Boolean = js.native
}

