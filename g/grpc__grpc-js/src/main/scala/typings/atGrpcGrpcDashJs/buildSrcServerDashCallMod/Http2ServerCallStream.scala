package typings.atGrpcGrpcDashJs.buildSrcServerDashCallMod

import typings.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.StatusObject
import typings.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata
import typings.node.Buffer
import typings.node.NodeJS.Timer
import typings.node.eventsMod.EventEmitter
import typings.node.http2Mod.IncomingHttpHeaders
import typings.node.http2Mod.ServerHttp2Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/server-call", "Http2ServerCallStream")
@js.native
class Http2ServerCallStream[RequestType, ResponseType] protected () extends EventEmitter {
  def this(stream: ServerHttp2Stream, handler: Handler[RequestType, ResponseType]) = this()
  var bufferedMessages: js.Any = js.native
  var canPush: js.Any = js.native
  var cancelled: Boolean = js.native
  var deadline: Timer = js.native
  var handler: js.Any = js.native
  var isPushPending: js.Any = js.native
  var messagesToPush: js.Any = js.native
  var metadataSent: js.Any = js.native
  var pushMessage: js.Any = js.native
  var pushOrBufferMessage: js.Any = js.native
  var stream: js.Any = js.native
  var wantTrailers: js.Any = js.native
  def consumeUnpushedMessages(
    readable: (ServerDuplexStream[RequestType, ResponseType]) | (ServerReadableStream[RequestType, ResponseType])
  ): Boolean = js.native
  def deserializeMessage(bytes: Buffer): js.Promise[RequestType] = js.native
  def receiveMetadata(headers: IncomingHttpHeaders): js.UndefOr[Metadata] = js.native
  def receiveUnaryMessage(): js.Promise[RequestType] = js.native
  def resume(): Unit = js.native
  def sendError(error: ServerErrorResponse | ServerStatusResponse): Unit = js.native
  def sendMetadata(): Unit = js.native
  def sendMetadata(customMetadata: Metadata): Unit = js.native
  def sendStatus(statusObj: StatusObject): Unit = js.native
  def sendUnaryMessage(): js.Promise[Unit] = js.native
  def sendUnaryMessage(err: ServerErrorResponse | ServerStatusResponse): js.Promise[Unit] = js.native
  def sendUnaryMessage(err: ServerErrorResponse | ServerStatusResponse, value: ResponseType): js.Promise[Unit] = js.native
  def sendUnaryMessage(err: ServerErrorResponse | ServerStatusResponse, value: ResponseType, metadata: Metadata): js.Promise[Unit] = js.native
  def sendUnaryMessage(
    err: ServerErrorResponse | ServerStatusResponse,
    value: ResponseType,
    metadata: Metadata,
    flags: Double
  ): js.Promise[Unit] = js.native
  def sendUnaryMessage(err: ServerErrorResponse | ServerStatusResponse, value: Null, metadata: Metadata): js.Promise[Unit] = js.native
  def sendUnaryMessage(err: ServerErrorResponse | ServerStatusResponse, value: Null, metadata: Metadata, flags: Double): js.Promise[Unit] = js.native
  def sendUnaryMessage(err: Null, value: ResponseType): js.Promise[Unit] = js.native
  def sendUnaryMessage(err: Null, value: ResponseType, metadata: Metadata): js.Promise[Unit] = js.native
  def sendUnaryMessage(err: Null, value: ResponseType, metadata: Metadata, flags: Double): js.Promise[Unit] = js.native
  def sendUnaryMessage(err: Null, value: Null, metadata: Metadata): js.Promise[Unit] = js.native
  def sendUnaryMessage(err: Null, value: Null, metadata: Metadata, flags: Double): js.Promise[Unit] = js.native
  def serializeMessage(value: ResponseType): Buffer = js.native
  def setupReadable(
    readable: (ServerDuplexStream[RequestType, ResponseType]) | (ServerReadableStream[RequestType, ResponseType])
  ): Unit = js.native
  def setupSurfaceCall(call: ServerSurfaceCall): Unit = js.native
  def write(chunk: Buffer): js.UndefOr[Boolean] = js.native
}

