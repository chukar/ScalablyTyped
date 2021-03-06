package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreReplicaSettingsUpdateMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreAutoScalingSettingsUpdateMod._UnmarshalledAutoScalingSettingsUpdate
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreReplicaGlobalSecondaryIndexSettingsUpdateMod._UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledReplicaSettingsUpdate extends _ReplicaSettingsUpdate {
  /**
    * <p>Represents the settings of a global secondary index for a global table that will be modified.</p>
    */
  @JSName("ReplicaGlobalSecondaryIndexSettingsUpdate")
  var ReplicaGlobalSecondaryIndexSettingsUpdate__UnmarshalledReplicaSettingsUpdate: js.UndefOr[js.Array[_UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate]] = js.undefined
  /**
    * <p>Autoscaling settings for managing a global table replica's read capacity units.</p>
    */
  @JSName("ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate")
  var ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate__UnmarshalledReplicaSettingsUpdate: js.UndefOr[_UnmarshalledAutoScalingSettingsUpdate] = js.undefined
}

object _UnmarshalledReplicaSettingsUpdate {
  @scala.inline
  def apply(
    RegionName: String,
    ReplicaGlobalSecondaryIndexSettingsUpdate: js.Array[_UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate] = null,
    ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: _UnmarshalledAutoScalingSettingsUpdate = null,
    ReplicaProvisionedReadCapacityUnits: Int | Double = null
  ): _UnmarshalledReplicaSettingsUpdate = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    if (ReplicaGlobalSecondaryIndexSettingsUpdate != null) __obj.updateDynamic("ReplicaGlobalSecondaryIndexSettingsUpdate")(ReplicaGlobalSecondaryIndexSettingsUpdate.asInstanceOf[js.Any])
    if (ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate != null) __obj.updateDynamic("ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate")(ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate.asInstanceOf[js.Any])
    if (ReplicaProvisionedReadCapacityUnits != null) __obj.updateDynamic("ReplicaProvisionedReadCapacityUnits")(ReplicaProvisionedReadCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledReplicaSettingsUpdate]
  }
}

