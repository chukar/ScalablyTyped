package typings.samchon.samchonMod.protocol

import typings.samchon.protocolInvokeIProtocolMod.IProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon", "protocol.ServerConnector")
@js.native
class ServerConnector protected ()
  extends typings.samchon.protocolMod.ServerConnector {
  /**
    * Construct from *listener*.
    *
    * @param listener A listener object to listen replied message from newly connected client in
    *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
    */
  def this(listener: IProtocol) = this()
}

