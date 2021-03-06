package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteFailScope extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 需要获取权限的 scope
    */
  var scope: String
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Anon_CompleteFailScope {
  @scala.inline
  def apply(scope: String, complete: () => Unit = null, fail: () => Unit = null, success: () => Unit = null): Anon_CompleteFailScope = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[Anon_CompleteFailScope]
  }
}

