package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBSnapshotAttributeResult extends js.Object {
  var DBSnapshotAttributesResult: js.UndefOr[typings.awsDashSdk.clientsRdsMod.DBSnapshotAttributesResult] = js.native
}

object ModifyDBSnapshotAttributeResult {
  @scala.inline
  def apply(DBSnapshotAttributesResult: DBSnapshotAttributesResult = null): ModifyDBSnapshotAttributeResult = {
    val __obj = js.Dynamic.literal()
    if (DBSnapshotAttributesResult != null) __obj.updateDynamic("DBSnapshotAttributesResult")(DBSnapshotAttributesResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBSnapshotAttributeResult]
  }
}

