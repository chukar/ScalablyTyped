package typings.reactDashAsync

import typings.reactDashAsync.reactDashAsyncBooleans.`false`
import typings.reactDashAsync.reactDashAsyncBooleans.`true`
import typings.reactDashAsync.reactDashAsyncStrings.rejected
import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataErrorFalseFinishedAt[T] extends js.Object {
  var data: js.UndefOr[T] = js.undefined
  var error: Error
  var finishedAt: Date
  var isFulfilled: `false`
  var isInitial: `false`
  var isLoading: `false`
  var isPending: `false`
  var isRejected: `true`
  var isResolved: `false`
  var isSettled: `true`
  var startedAt: Date
  var status: rejected
  var value: Error
}

object Anon_DataErrorFalseFinishedAt {
  @scala.inline
  def apply[T](
    error: Error,
    finishedAt: Date,
    isFulfilled: `false`,
    isInitial: `false`,
    isLoading: `false`,
    isPending: `false`,
    isRejected: `true`,
    isResolved: `false`,
    isSettled: `true`,
    startedAt: Date,
    status: rejected,
    value: Error,
    data: T = null
  ): Anon_DataErrorFalseFinishedAt[T] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], finishedAt = finishedAt.asInstanceOf[js.Any], isFulfilled = isFulfilled.asInstanceOf[js.Any], isInitial = isInitial.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], isPending = isPending.asInstanceOf[js.Any], isRejected = isRejected.asInstanceOf[js.Any], isResolved = isResolved.asInstanceOf[js.Any], isSettled = isSettled.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataErrorFalseFinishedAt[T]]
  }
}

