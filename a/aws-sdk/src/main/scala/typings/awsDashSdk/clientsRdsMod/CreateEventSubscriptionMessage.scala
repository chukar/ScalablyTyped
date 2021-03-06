package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEventSubscriptionMessage extends js.Object {
  /**
    *  A value that indicates whether to activate the subscription. If the event notification subscription isn't activated, the subscription is created but not active. 
    */
  var Enabled: js.UndefOr[BooleanOptional] = js.native
  /**
    *  A list of event categories for a SourceType that you want to subscribe to. You can see a list of the categories for a given SourceType in the Events topic in the Amazon RDS User Guide or by using the DescribeEventCategories action. 
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the SNS topic created for event notification. The ARN is created by Amazon SNS when you create a topic and subscribe to it.
    */
  var SnsTopicArn: String = js.native
  /**
    * The list of identifiers of the event sources for which events are returned. If not specified, then all sources are included in the response. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens. Constraints:   If SourceIds are supplied, SourceType must also be provided.   If the source type is a DB instance, then a DBInstanceIdentifier must be supplied.   If the source type is a DB security group, a DBSecurityGroupName must be supplied.   If the source type is a DB parameter group, a DBParameterGroupName must be supplied.   If the source type is a DB snapshot, a DBSnapshotIdentifier must be supplied.  
    */
  var SourceIds: js.UndefOr[SourceIdsList] = js.native
  /**
    * The type of source that is generating the events. For example, if you want to be notified of events generated by a DB instance, you would set this parameter to db-instance. if this value isn't specified, all events are returned. Valid values: db-instance | db-cluster | db-parameter-group | db-security-group | db-snapshot | db-cluster-snapshot 
    */
  var SourceType: js.UndefOr[String] = js.native
  /**
    * The name of the subscription. Constraints: The name must be less than 255 characters.
    */
  var SubscriptionName: String = js.native
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateEventSubscriptionMessage {
  @scala.inline
  def apply(
    SnsTopicArn: String,
    SubscriptionName: String,
    Enabled: js.UndefOr[scala.Boolean] = js.undefined,
    EventCategories: EventCategoriesList = null,
    SourceIds: SourceIdsList = null,
    SourceType: String = null,
    Tags: TagList = null
  ): CreateEventSubscriptionMessage = {
    val __obj = js.Dynamic.literal(SnsTopicArn = SnsTopicArn.asInstanceOf[js.Any], SubscriptionName = SubscriptionName.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (EventCategories != null) __obj.updateDynamic("EventCategories")(EventCategories.asInstanceOf[js.Any])
    if (SourceIds != null) __obj.updateDynamic("SourceIds")(SourceIds.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEventSubscriptionMessage]
  }
}

