package typings.orientjs.orientjsMod.Topology

import typings.node.eventsMod.EventEmitter
import typings.orientjs.orientjsMod.OConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "Topology.OServerNode")
@js.native
class OServerNode () extends EventEmitter {
  def acquireConnection(): js.Promise[OConnection] = js.native
  def acquireForSubscribe(): js.Promise[OConnection] = js.native
  def close(): js.Promise[Unit] = js.native
  def connect(): js.Promise[OServerNode] = js.native
  def subscribeCluster(): js.Promise[OConnection] = js.native
  def subscribeCluster(data: js.Any): js.Promise[OConnection] = js.native
}

