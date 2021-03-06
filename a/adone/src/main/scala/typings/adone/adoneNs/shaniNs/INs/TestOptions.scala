package typings.adone.adoneNs.shaniNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOptions extends js.Object {
  /**
    * Add after hook for this test
    */
  var after: js.UndefOr[HookCallback | (js.Tuple2[String, HookCallback])] = js.undefined
  /**
    * Add before hook for this test
    */
  var before: js.UndefOr[HookCallback | (js.Tuple2[String, HookCallback])] = js.undefined
  /**
    * Specify that this test must be skipped
    */
  var skip: js.UndefOr[Boolean | js.Function0[Unit]] = js.undefined
  /**
    * Specify timeout for this test
    */
  var timeout: js.UndefOr[Double | js.Function0[Unit]] = js.undefined
}

object TestOptions {
  @scala.inline
  def apply(
    after: HookCallback | (js.Tuple2[String, HookCallback]) = null,
    before: HookCallback | (js.Tuple2[String, HookCallback]) = null,
    skip: Boolean | js.Function0[Unit] = null,
    timeout: Double | js.Function0[Unit] = null
  ): TestOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestOptions]
  }
}

