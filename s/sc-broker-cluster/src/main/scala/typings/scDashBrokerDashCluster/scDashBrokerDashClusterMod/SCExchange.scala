package typings.scDashBrokerDashCluster.scDashBrokerDashClusterMod

import typings.async.asyncMod.AsyncResultArrayCallback
import typings.fleximap.fleximapMod.KeyChain
import typings.scDashBrokerDashCluster.Anon_Targets
import typings.scDashBrokerDashCluster.clientclusterMod.ClientCluster
import typings.scDashChannel.scDashChannelMod.SCChannel
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-broker-cluster", "SCExchange")
@js.native
class SCExchange protected () extends AbstractDataClient {
  def this(privateClientCluster: ClientCluster, publicClientCluster: ClientCluster, ioClusterClient: Client) = this()
  def channel(channelName: String): SCChannel = js.native
  def destroy(): Unit = js.native
  def destroyChannel(channelName: String): Unit = js.native
  def getMapper(): mapperFunction = js.native
  def isSubscribed(channelName: String): Boolean = js.native
  def isSubscribed(channelName: String, includePending: Boolean): Boolean = js.native
  def map(keyChain: KeyChain, method: String): Anon_Targets = js.native
  def publish(channelName: String, data: js.Any): Unit = js.native
  def publish(channelName: String, data: js.Any, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def send(data: js.Any): Unit = js.native
  def send(data: js.Any, mapIndex: String): Unit = js.native
  def send(data: js.Any, mapIndex: String, callback: AsyncResultArrayCallback[_, Error]): Unit = js.native
  def send(data: js.Any, mapIndex: js.Array[String]): Unit = js.native
  def send(data: js.Any, mapIndex: js.Array[String], callback: AsyncResultArrayCallback[_, Error]): Unit = js.native
  def send(data: js.Any, mapIndex: Double): Unit = js.native
  def send(data: js.Any, mapIndex: Double, callback: AsyncResultArrayCallback[_, Error]): Unit = js.native
  def send(data: js.Any, mapIndex: Null, callback: AsyncResultArrayCallback[_, Error]): Unit = js.native
  def setMapper(mapper: mapperFunction): Unit = js.native
  def subscribe(channelName: String): SCChannel = js.native
  def subscriptions(): js.Array[String] = js.native
  def subscriptions(includePending: Boolean): js.Array[String] = js.native
  def unsubscribe(channelName: String): Unit = js.native
  def unwatch(channelName: String): Unit = js.native
  def unwatch(channelName: String, handler: handlerFunction): Unit = js.native
  def watch(channelName: String, handler: handlerFunction): Unit = js.native
  def watchers(channelName: String): js.Array[handlerFunction] = js.native
}

