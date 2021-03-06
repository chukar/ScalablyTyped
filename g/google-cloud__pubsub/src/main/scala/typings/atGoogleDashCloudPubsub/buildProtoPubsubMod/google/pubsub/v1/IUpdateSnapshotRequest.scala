package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1

import typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.protobuf.IFieldMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an UpdateSnapshotRequest. */
trait IUpdateSnapshotRequest extends js.Object {
  /** UpdateSnapshotRequest snapshot */
  var snapshot: js.UndefOr[ISnapshot | Null] = js.undefined
  /** UpdateSnapshotRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}

object IUpdateSnapshotRequest {
  @scala.inline
  def apply(snapshot: ISnapshot = null, updateMask: IFieldMask = null): IUpdateSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateSnapshotRequest]
  }
}

