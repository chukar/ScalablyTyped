package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lifecycle extends js.Object {
  /**
    * Specifies the number of days after creation that a recovery point is deleted. Must be greater than MoveToColdStorageAfterDays.
    */
  var DeleteAfterDays: js.UndefOr[Long] = js.native
  /**
    * Specifies the number of days after creation that a recovery point is moved to cold storage.
    */
  var MoveToColdStorageAfterDays: js.UndefOr[Long] = js.native
}

object Lifecycle {
  @scala.inline
  def apply(DeleteAfterDays: Int | Double = null, MoveToColdStorageAfterDays: Int | Double = null): Lifecycle = {
    val __obj = js.Dynamic.literal()
    if (DeleteAfterDays != null) __obj.updateDynamic("DeleteAfterDays")(DeleteAfterDays.asInstanceOf[js.Any])
    if (MoveToColdStorageAfterDays != null) __obj.updateDynamic("MoveToColdStorageAfterDays")(MoveToColdStorageAfterDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lifecycle]
  }
}

