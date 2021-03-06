package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAutoSnapshotRequest extends js.Object {
  /**
    * The date of the automatic snapshot to delete in YYYY-MM-DD format. Use the get auto snapshots operation to get the available automatic snapshots for a resource.
    */
  var date: AutoSnapshotDate = js.native
  /**
    * The name of the source instance or disk from which to delete the automatic snapshot.
    */
  var resourceName: ResourceName = js.native
}

object DeleteAutoSnapshotRequest {
  @scala.inline
  def apply(date: AutoSnapshotDate, resourceName: ResourceName): DeleteAutoSnapshotRequest = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteAutoSnapshotRequest]
  }
}

