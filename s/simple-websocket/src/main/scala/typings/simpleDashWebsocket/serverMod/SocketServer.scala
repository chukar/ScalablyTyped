package typings.simpleDashWebsocket.serverMod

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.netMod.Socket
import typings.simpleDashWebsocket.simpleDashWebsocketStrings.connection
import typings.simpleDashWebsocket.simpleDashWebsocketStrings.error
import typings.simpleDashWebsocket.simpleDashWebsocketStrings.headers
import typings.simpleDashWebsocket.simpleDashWebsocketStrings.listening
import typings.std.Error
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketServer extends EventEmitter {
  var clients: Set[typings.ws.wsMod.^] = js.native
  var options: Options = js.native
  var path: String = js.native
  // Events
  @JSName("addListener")
  def addListener_connection(
    event: connection,
    cb: js.Function1[/* client */ typings.simpleDashWebsocket.simpleDashWebsocketMod.^, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, cb: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_headers(
    event: headers,
    cb: js.Function2[/* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_listening(event: listening, cb: js.Function0[Unit]): this.type = js.native
  def close(): Unit = js.native
  def close(cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  @JSName("emit")
  def emit_connection(event: connection, socket: typings.simpleDashWebsocket.simpleDashWebsocketMod.^): Boolean = js.native
  @JSName("emit")
  def emit_error(event: error, error: Error): Boolean = js.native
  @JSName("emit")
  def emit_headers(event: headers, headers: js.Array[String], request: IncomingMessage): Boolean = js.native
  @JSName("emit")
  def emit_listening(event: listening): Boolean = js.native
  def handleUpgrade(
    request: IncomingMessage,
    socket: Socket,
    upgradeHead: Buffer,
    callback: js.Function1[/* client */ typings.ws.wsMod.^, Unit]
  ): Unit = js.native
  @JSName("listeners")
  def listeners_connection(event: connection): js.Array[
    js.Function2[
      /* socket */ typings.simpleDashWebsocket.simpleDashWebsocketMod.^, 
      /* request */ IncomingMessage, 
      Unit
    ]
  ] = js.native
  @JSName("listeners")
  def listeners_error(event: error): js.Array[js.Function1[/* error */ Error, Unit]] = js.native
  @JSName("listeners")
  def listeners_headers(event: headers): js.Array[
    js.Function2[/* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
  ] = js.native
  @JSName("listeners")
  def listeners_listening(event: listening): js.Array[js.Function0[Unit]] = js.native
  @JSName("off")
  def off_connection(
    event: connection,
    cb: js.Function2[
      /* socket */ typings.simpleDashWebsocket.simpleDashWebsocketMod.^, 
      /* request */ IncomingMessage, 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_error(event: error, cb: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("off")
  def off_headers(
    event: headers,
    cb: js.Function2[/* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_listening(event: listening, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_connection(
    event: connection,
    cb: js.Function2[
      /* socket */ typings.simpleDashWebsocket.simpleDashWebsocketMod.^, 
      /* request */ IncomingMessage, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_error(event: error, cb: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_headers(
    event: headers,
    cb: js.Function2[/* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_listening(event: listening, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_connection(
    event: connection,
    cb: js.Function2[
      /* socket */ typings.simpleDashWebsocket.simpleDashWebsocketMod.^, 
      /* request */ IncomingMessage, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_error(event: error, cb: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_headers(
    event: headers,
    cb: js.Function2[/* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_listening(event: listening, cb: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_connection(
    event: connection,
    cb: js.Function1[/* client */ typings.simpleDashWebsocket.simpleDashWebsocketMod.^, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, cb: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_headers(
    event: headers,
    cb: js.Function2[/* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_listening(event: listening, cb: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_connection(
    event: connection,
    cb: js.Function1[/* client */ typings.simpleDashWebsocket.simpleDashWebsocketMod.^, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, cb: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_headers(
    event: headers,
    cb: js.Function2[/* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_listening(event: listening, cb: js.Function0[Unit]): this.type = js.native
  @JSName("rawListeners")
  def rawListeners_connection(event: connection): js.Array[
    js.Function2[
      /* socket */ typings.simpleDashWebsocket.simpleDashWebsocketMod.^, 
      /* request */ IncomingMessage, 
      Unit
    ]
  ] = js.native
  @JSName("rawListeners")
  def rawListeners_error(event: error): js.Array[js.Function1[/* error */ Error, Unit]] = js.native
  @JSName("rawListeners")
  def rawListeners_headers(event: headers): js.Array[
    js.Function2[/* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
  ] = js.native
  @JSName("rawListeners")
  def rawListeners_listening(event: listening): js.Array[js.Function0[Unit]] = js.native
  @JSName("removeListener")
  def removeListener_connection(
    event: connection,
    cb: js.Function1[/* client */ typings.simpleDashWebsocket.simpleDashWebsocketMod.^, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, cb: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_headers(
    event: headers,
    cb: js.Function2[/* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_listening(event: listening, cb: js.Function0[Unit]): this.type = js.native
  def shouldHandle(request: IncomingMessage): Boolean = js.native
}

