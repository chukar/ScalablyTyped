package typings.gapiDotClientDotSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateInstanceMetadata extends js.Object {
  /**
    * The time at which this operation was cancelled. If set, this operation is
    * in the process of undoing itself (which is guaranteed to succeed) and
    * cannot be cancelled again.
    */
  var cancelTime: js.UndefOr[String] = js.undefined
  /** The time at which this operation failed or was completed successfully. */
  var endTime: js.UndefOr[String] = js.undefined
  /** The desired end state of the update. */
  var instance: js.UndefOr[Instance] = js.undefined
  /**
    * The time at which UpdateInstance
    * request was received.
    */
  var startTime: js.UndefOr[String] = js.undefined
}

object UpdateInstanceMetadata {
  @scala.inline
  def apply(
    cancelTime: String = null,
    endTime: String = null,
    instance: Instance = null,
    startTime: String = null
  ): UpdateInstanceMetadata = {
    val __obj = js.Dynamic.literal()
    if (cancelTime != null) __obj.updateDynamic("cancelTime")(cancelTime.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInstanceMetadata]
  }
}

