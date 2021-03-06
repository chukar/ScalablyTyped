package typings.backlogDashJs.backlogDashJsMod.Option.User

import typings.backlogDashJs.backlogDashJsMod.Option.ActivityType
import typings.backlogDashJs.backlogDashJsMod.Option.Order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserActivitiesParams extends js.Object {
  var activityTypeId: js.UndefOr[js.Array[ActivityType]] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var maxId: js.UndefOr[Double] = js.undefined
  var minId: js.UndefOr[Double] = js.undefined
  var order: js.UndefOr[Order] = js.undefined
}

object GetUserActivitiesParams {
  @scala.inline
  def apply(
    activityTypeId: js.Array[ActivityType] = null,
    count: Int | Double = null,
    maxId: Int | Double = null,
    minId: Int | Double = null,
    order: Order = null
  ): GetUserActivitiesParams = {
    val __obj = js.Dynamic.literal()
    if (activityTypeId != null) __obj.updateDynamic("activityTypeId")(activityTypeId.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (maxId != null) __obj.updateDynamic("maxId")(maxId.asInstanceOf[js.Any])
    if (minId != null) __obj.updateDynamic("minId")(minId.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserActivitiesParams]
  }
}

