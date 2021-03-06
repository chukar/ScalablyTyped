package typings.atPulumiAws.dynamodbTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.dynamodbDynamodbMixinsMod.TableEventHandler
import typings.atPulumiAws.dynamodbDynamodbMixinsMod.TableEventSubscription
import typings.atPulumiAws.dynamodbDynamodbMixinsMod.TableEventSubscriptionArgs
import typings.atPulumiAws.typesOutputMod.dynamodb.TableAttribute
import typings.atPulumiAws.typesOutputMod.dynamodb.TableGlobalSecondaryIndex
import typings.atPulumiAws.typesOutputMod.dynamodb.TableLocalSecondaryIndex
import typings.atPulumiAws.typesOutputMod.dynamodb.TablePointInTimeRecovery
import typings.atPulumiAws.typesOutputMod.dynamodb.TableServerSideEncryption
import typings.atPulumiAws.typesOutputMod.dynamodb.TableTtl
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dynamodb/table", "Table")
@js.native
class Table protected () extends CustomResource {
  /**
    * Create a Table resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TableArgs) = this()
  def this(name: String, args: TableArgs, opts: CustomResourceOptions) = this()
  /**
    * The arn of the table
    */
  val arn: Output[String] = js.native
  /**
    * List of nested attribute definitions. Only required for `hashKey` and `rangeKey` attributes. Each attribute has two properties:
    */
  val attributes: Output[js.Array[TableAttribute]] = js.native
  /**
    * Controls how you are charged for read and write throughput and how you manage capacity. The valid values are `PROVISIONED` and `PAY_PER_REQUEST`. Defaults to `PROVISIONED`.
    */
  val billingMode: Output[js.UndefOr[String]] = js.native
  /**
    * Describe a GSI for the table;
    * subject to the normal limits on the number of GSIs, projected
    * attributes, etc.
    */
  val globalSecondaryIndexes: Output[js.UndefOr[js.Array[TableGlobalSecondaryIndex]]] = js.native
  /**
    * The name of the hash key in the index; must be
    * defined as an attribute in the resource.
    */
  val hashKey: Output[String] = js.native
  /**
    * Describe an LSI on the table;
    * these can only be allocated *at creation* so you cannot change this
    * definition after you have created the resource.
    */
  val localSecondaryIndexes: Output[js.UndefOr[js.Array[TableLocalSecondaryIndex]]] = js.native
  /**
    * The name of the index
    */
  val name: Output[String] = js.native
  /**
    * Point-in-time recovery options.
    */
  val pointInTimeRecovery: Output[TablePointInTimeRecovery] = js.native
  /**
    * The name of the range key; must be defined
    */
  val rangeKey: Output[js.UndefOr[String]] = js.native
  /**
    * The number of read units for this index. Must be set if billingMode is set to PROVISIONED.
    */
  val readCapacity: Output[js.UndefOr[Double]] = js.native
  /**
    * Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS owned Customer Master Key if this argument isn't specified.
    */
  val serverSideEncryption: Output[TableServerSideEncryption] = js.native
  /**
    * The ARN of the Table Stream. Only available when `streamEnabled = true`
    */
  val streamArn: Output[String] = js.native
  /**
    * Indicates whether Streams are to be enabled (true) or disabled (false).
    */
  val streamEnabled: Output[js.UndefOr[Boolean]] = js.native
  /**
    * A timestamp, in ISO 8601 format, for this stream. Note that this timestamp is not
    * a unique identifier for the stream on its own. However, the combination of AWS customer ID,
    * table name and this field is guaranteed to be unique.
    * It can be used for creating CloudWatch Alarms. Only available when `streamEnabled = true`
    */
  val streamLabel: Output[String] = js.native
  /**
    * When an item in the table is modified, StreamViewType determines what information is written to the table's stream. Valid values are `KEYS_ONLY`, `NEW_IMAGE`, `OLD_IMAGE`, `NEW_AND_OLD_IMAGES`.
    */
  val streamViewType: Output[String] = js.native
  /**
    * A map of tags to populate on the created table.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Defines ttl, has two properties, and can only be specified once:
    */
  val ttl: Output[js.UndefOr[TableTtl]] = js.native
  /**
    * The number of write units for this index. Must be set if billingMode is set to PROVISIONED.
    */
  val writeCapacity: Output[js.UndefOr[Double]] = js.native
  /**
    * Creates a new subscription to events fired from this Table to the handler provided,
    * along with options to control the behavior of the subscription.
    *
    * In order to receive events the [Table] must have been created with the `streamEnabled: true`
    * value as well as an appropriate `streamViewType`.
    */
  def onEvent(name: String, handler: TableEventHandler, args: TableEventSubscriptionArgs): TableEventSubscription = js.native
  def onEvent(
    name: String,
    handler: TableEventHandler,
    args: TableEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ): TableEventSubscription = js.native
}

/* static members */
@JSImport("@pulumi/aws/dynamodb/table", "Table")
@js.native
object Table extends js.Object {
  /**
    * Get an existing Table resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Table = js.native
  def get(name: String, id: Input[ID], state: TableState): Table = js.native
  def get(name: String, id: Input[ID], state: TableState, opts: CustomResourceOptions): Table = js.native
  /**
    * Returns true if the given object is an instance of Table.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dynamodb/table.Table */ Boolean = js.native
}

