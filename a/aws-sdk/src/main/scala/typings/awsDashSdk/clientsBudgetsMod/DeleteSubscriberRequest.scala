package typings.awsDashSdk.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSubscriberRequest extends js.Object {
  /**
    * The accountId that is associated with the budget whose subscriber you want to delete.
    */
  var AccountId: typings.awsDashSdk.clientsBudgetsMod.AccountId = js.native
  /**
    * The name of the budget whose subscriber you want to delete.
    */
  var BudgetName: typings.awsDashSdk.clientsBudgetsMod.BudgetName = js.native
  /**
    * The notification whose subscriber you want to delete.
    */
  var Notification: typings.awsDashSdk.clientsBudgetsMod.Notification = js.native
  /**
    * The subscriber that you want to delete.
    */
  var Subscriber: typings.awsDashSdk.clientsBudgetsMod.Subscriber = js.native
}

object DeleteSubscriberRequest {
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName, Notification: Notification, Subscriber: Subscriber): DeleteSubscriberRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], Subscriber = Subscriber.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteSubscriberRequest]
  }
}

