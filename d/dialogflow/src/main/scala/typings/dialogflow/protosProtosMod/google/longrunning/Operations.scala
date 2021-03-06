package typings.dialogflow.protosProtosMod.google.longrunning

import typings.dialogflow.protosProtosMod.google.longrunning.Operations.CancelOperationCallback
import typings.dialogflow.protosProtosMod.google.longrunning.Operations.DeleteOperationCallback
import typings.dialogflow.protosProtosMod.google.longrunning.Operations.GetOperationCallback
import typings.dialogflow.protosProtosMod.google.longrunning.Operations.ListOperationsCallback
import typings.dialogflow.protosProtosMod.google.longrunning.Operations.WaitOperationCallback
import typings.dialogflow.protosProtosMod.google.protobuf.Empty
import typings.protobufjs.protobufjsMod.RPCImpl
import typings.protobufjs.protobufjsMod.rpc.Service
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an Operations */
@JSImport("dialogflow/protos/protos", "google.longrunning.Operations")
@js.native
class Operations protected () extends Service {
  /**
    * Constructs a new Operations service.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    */
  def this(rpcImpl: RPCImpl) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
  /**
    * Calls CancelOperation.
    * @param request CancelOperationRequest message or plain object
    * @returns Promise
    */
  def cancelOperation(request: ICancelOperationRequest): js.Promise[Empty] = js.native
  /**
    * Calls CancelOperation.
    * @param request CancelOperationRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Empty
    */
  def cancelOperation(request: ICancelOperationRequest, callback: CancelOperationCallback): Unit = js.native
  /**
    * Calls DeleteOperation.
    * @param request DeleteOperationRequest message or plain object
    * @returns Promise
    */
  def deleteOperation(request: IDeleteOperationRequest): js.Promise[Empty] = js.native
  /**
    * Calls DeleteOperation.
    * @param request DeleteOperationRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Empty
    */
  def deleteOperation(request: IDeleteOperationRequest, callback: DeleteOperationCallback): Unit = js.native
  /**
    * Calls GetOperation.
    * @param request GetOperationRequest message or plain object
    * @returns Promise
    */
  def getOperation(request: IGetOperationRequest): js.Promise[Operation] = js.native
  /**
    * Calls GetOperation.
    * @param request GetOperationRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def getOperation(request: IGetOperationRequest, callback: GetOperationCallback): Unit = js.native
  /**
    * Calls ListOperations.
    * @param request ListOperationsRequest message or plain object
    * @returns Promise
    */
  def listOperations(request: IListOperationsRequest): js.Promise[ListOperationsResponse] = js.native
  /**
    * Calls ListOperations.
    * @param request ListOperationsRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ListOperationsResponse
    */
  def listOperations(request: IListOperationsRequest, callback: ListOperationsCallback): Unit = js.native
  /**
    * Calls WaitOperation.
    * @param request WaitOperationRequest message or plain object
    * @returns Promise
    */
  def waitOperation(request: IWaitOperationRequest): js.Promise[Operation] = js.native
  /**
    * Calls WaitOperation.
    * @param request WaitOperationRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def waitOperation(request: IWaitOperationRequest, callback: WaitOperationCallback): Unit = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.longrunning.Operations")
@js.native
object Operations extends js.Object {
  /**
    * Creates new Operations service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  def create(rpcImpl: RPCImpl): Operations = js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean): Operations = js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): Operations = js.native
  /**
    * Callback as used by {@link google.longrunning.Operations#cancelOperation}.
    * @param error Error, if any
    * @param [response] Empty
    */
  type CancelOperationCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Empty], Unit]
  /**
    * Callback as used by {@link google.longrunning.Operations#deleteOperation}.
    * @param error Error, if any
    * @param [response] Empty
    */
  type DeleteOperationCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Empty], Unit]
  /**
    * Callback as used by {@link google.longrunning.Operations#getOperation}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type GetOperationCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Operation], Unit]
  /**
    * Callback as used by {@link google.longrunning.Operations#listOperations}.
    * @param error Error, if any
    * @param [response] ListOperationsResponse
    */
  type ListOperationsCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[ListOperationsResponse], Unit]
  /**
    * Callback as used by {@link google.longrunning.Operations#waitOperation}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type WaitOperationCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Operation], Unit]
}

