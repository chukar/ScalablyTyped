package typings.stripe.stripeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListOptions extends IDataOptions {
  /**
    * A cursor for use in pagination. ending_before is an object ID that defines your place in the list. For instance, if you make
    * a list request and receive 100 objects, starting with obj_bar, your subsequent call can include ending_before=obj_bar in
    * order to fetch the previous page of the list.
    */
  var ending_before: js.UndefOr[String] = js.undefined
  /**
    * A limit on the number of objects to be returned. Limit can range between 1 and 100 items.
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * A cursor for use in pagination. starting_after is an object ID that defines your place in the list. For instance, if you make
    * a list request and receive 100 objects, ending with obj_foo, your subsequent call can include starting_after=obj_foo in order
    * to fetch the next page of the list.
    */
  var starting_after: js.UndefOr[String] = js.undefined
}

object IListOptions {
  @scala.inline
  def apply(
    ending_before: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    limit: Int | Double = null,
    starting_after: String = null
  ): IListOptions = {
    val __obj = js.Dynamic.literal()
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListOptions]
  }
}

