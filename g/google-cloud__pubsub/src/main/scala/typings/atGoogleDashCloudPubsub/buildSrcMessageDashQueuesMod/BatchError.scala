package typings.atGoogleDashCloudPubsub.buildSrcMessageDashQueuesMod

import typings.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.StatusObject
import typings.atGrpcGrpcDashJs.buildSrcCallMod.ServiceError
import typings.atGrpcGrpcDashJs.buildSrcConstantsMod.Status
import typings.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/message-queues", "BatchError")
@js.native
class BatchError protected ()
  extends Error
     with StatusObject {
  def this(err: ServiceError, ackIds: js.Array[String], rpc: String) = this()
  var ackIds: js.Array[String] = js.native
  /* CompleteClass */
  override var code: Status = js.native
  /* CompleteClass */
  override var details: String = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var metadata: Metadata = js.native
  @JSName("metadata")
  var metadata_BatchError: typings.atGrpcGrpcDashJs.atGrpcGrpcDashJsMod.Metadata = js.native
  /* CompleteClass */
  override var name: String = js.native
}

