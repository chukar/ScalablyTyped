package typings.kafkaDashNode.kafkaDashNodeMod

import typings.kafkaDashNode.Anon_Name
import typings.kafkaDashNode.Anon_Partition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTopicRequest extends js.Object {
  var configEntries: js.UndefOr[js.Array[Anon_Name]] = js.undefined
  var partitions: Double
  var replicaAssignment: js.UndefOr[js.Array[Anon_Partition]] = js.undefined
  var replicationFactor: Double
  var topic: String
}

object CreateTopicRequest {
  @scala.inline
  def apply(
    partitions: Double,
    replicationFactor: Double,
    topic: String,
    configEntries: js.Array[Anon_Name] = null,
    replicaAssignment: js.Array[Anon_Partition] = null
  ): CreateTopicRequest = {
    val __obj = js.Dynamic.literal(partitions = partitions.asInstanceOf[js.Any], replicationFactor = replicationFactor.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    if (configEntries != null) __obj.updateDynamic("configEntries")(configEntries.asInstanceOf[js.Any])
    if (replicaAssignment != null) __obj.updateDynamic("replicaAssignment")(replicaAssignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTopicRequest]
  }
}

