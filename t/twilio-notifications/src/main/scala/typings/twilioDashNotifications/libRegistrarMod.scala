package typings.twilioDashNotifications

import typings.node.eventsMod.EventEmitter
import typings.twilioDashNotifications.libConnectorMod.ChannelType
import typings.twilioDashNotifications.libConnectorMod.Connector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-notifications/lib/registrar", JSImport.Namespace)
@js.native
object libRegistrarMod extends js.Object {
  /**
    * Provides an interface to the ERS registrar
    */
  @js.native
  class Registrar protected () extends EventEmitter {
    /**
      * Creates the new instance of registrar client
      */
    def this(productId: String, transport: js.Any, twilsock: js.Any, config: js.Any) = this()
    val config: js.Any = js.native
    val connectors: js.Any = js.native
    /**
      * Returns platform string limited to max 128 chars
      */
    var detectPlatform: js.Any = js.native
    /**
      * @param {String} type Channel type
      * @throws {Error} Error with description
      */
    def connector(`type`: ChannelType): Connector = js.native
    /**
      *  Sets notification ID.
      *  If new URI is different from previous, it triggers updating of registration for given channel
      *
      *  @param {string} channelType channel type (apn|gcm|fcm|twilsock)
      *  @param {string} notificationId The notification ID
      */
    def setNotificationId(channelType: ChannelType, notificationId: String): Unit = js.native
    /**
      * Subscribe for given type of message
      *
      * @param {String} messageType Message type identifier
      * @param {String} channelType Channel type, can be 'twilsock', 'gcm' or 'fcm'
      * @public
      */
    def subscribe(messageType: String, channelType: ChannelType): js.Promise[Unit] = js.native
    /**
      * Remove subscription
      * @param {String} messageType Message type
      * @param {String} channelType Channel type (twilsock or gcm/fcm)
      */
    def unsubscribe(messageType: String, channelType: ChannelType): js.Promise[Unit] = js.native
    def updateToken(token: String): Unit = js.native
  }
  
}

