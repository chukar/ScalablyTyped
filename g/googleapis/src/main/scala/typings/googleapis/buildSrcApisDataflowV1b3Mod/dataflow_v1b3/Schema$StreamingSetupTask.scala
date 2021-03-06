package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A task which initializes part of a streaming Dataflow job.
  */
@js.native
trait Schema$StreamingSetupTask extends js.Object {
  /**
    * The user has requested drain.
    */
  var drain: js.UndefOr[Boolean] = js.native
  /**
    * The TCP port on which the worker should listen for messages from other
    * streaming computation workers.
    */
  var receiveWorkPort: js.UndefOr[Double] = js.native
  /**
    * Configures streaming appliance snapshot.
    */
  var snapshotConfig: js.UndefOr[Schema$StreamingApplianceSnapshotConfig] = js.native
  /**
    * The global topology of the streaming Dataflow job.
    */
  var streamingComputationTopology: js.UndefOr[Schema$TopologyConfig] = js.native
  /**
    * The TCP port used by the worker to communicate with the Dataflow worker
    * harness.
    */
  var workerHarnessPort: js.UndefOr[Double] = js.native
}

object Schema$StreamingSetupTask {
  @scala.inline
  def apply(
    drain: js.UndefOr[Boolean] = js.undefined,
    receiveWorkPort: Int | Double = null,
    snapshotConfig: Schema$StreamingApplianceSnapshotConfig = null,
    streamingComputationTopology: Schema$TopologyConfig = null,
    workerHarnessPort: Int | Double = null
  ): Schema$StreamingSetupTask = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(drain)) __obj.updateDynamic("drain")(drain.asInstanceOf[js.Any])
    if (receiveWorkPort != null) __obj.updateDynamic("receiveWorkPort")(receiveWorkPort.asInstanceOf[js.Any])
    if (snapshotConfig != null) __obj.updateDynamic("snapshotConfig")(snapshotConfig.asInstanceOf[js.Any])
    if (streamingComputationTopology != null) __obj.updateDynamic("streamingComputationTopology")(streamingComputationTopology.asInstanceOf[js.Any])
    if (workerHarnessPort != null) __obj.updateDynamic("workerHarnessPort")(workerHarnessPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StreamingSetupTask]
  }
}

