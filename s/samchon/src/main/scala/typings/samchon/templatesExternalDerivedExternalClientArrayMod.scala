package typings.samchon

import typings.ecol.libBasicCollectionEventMod.CollectionEvent
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Listener
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import typings.samchon.protocolCommunicatorIClientDriverMod.IClientDriver
import typings.samchon.protocolServerIServerMod.IServer
import typings.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray
import typings.samchon.templatesExternalExternalSystemMod.ExternalSystem
import typings.tstl.containerDequeMod.Deque
import typings.tstl.containerDequeMod.Deque.Iterator
import typings.tstl.containerDequeMod.Deque.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/external/derived/ExternalClientArray", JSImport.Namespace)
@js.native
object templatesExternalDerivedExternalClientArrayMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalClientArray[T /* <: ExternalSystem */] ()
    extends ExternalSystemArray[T]
       with IServer {
    /**
      * @hidden
      */
    var server_base_ : js.Any = js.native
    /**
      * Add a newly connected remote client.
      *
      * The {@link addClient addClient()} is an abstract method being called when a remote client is newly connected
      * with {@link IClientDriver} object who communicates with the remote system. Overrides this method and defines
      * what to do with the *driver*, a newly connected remote client.
      *
      * Below methods and example codes may be good for comprehending how to utilize this {@link addClient} method.
      *
      * - https://github.com/samchon/framework-examples/blob/master/calculator/calculator-server.ts
      * - https://github.com/samchon/framework-examples/blob/master/chat-server/server.ts
      * - {@link service.Server.addClient}
      * - {@link external.ExternalClientArray.addClient}
      * - {@link slave.SlaveServer.addClient}
      *
      * @param driver A {@link ICommunicator communicator} with (newly connected) remote client.
      */
    /* CompleteClass */
    override def addClient(driver: IClientDriver): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: Type, listener: Listener[T, Deque[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
    /**
      * Close server.
      *
      * Close opened server. All remote clients, have connected with this server, are also closed and their call back
      * functions, for closed connection, {@link IClientDriver.onClose} are also called.
      */
    /* CompleteClass */
    override def close(): Unit = js.native
    /**
      * Factory method creating a child {@link ExternalSystem} object.
      *
      * @param driver A communicator with connected client.
      * @return A newly created {@link ExternalSystem} object.
      */
    /* protected */ def createExternalClient(driver: IClientDriver): T = js.native
    /**
      * Factory method creating {@link IServerBase} object.
      *
      * This method {@link createServerBase createServerBase()} determines which templates is used in this server,
      * {@link ExternalClientArray}. If the templates is determined, then {@link ExternalSystem external clients} who
      * may connect to {@link ExternalClientArray this server} must follow the specified templates.
      *
      * Creates and returns one of them:
      *
      * - {@link ServerBase}
      * - {@link WebServerBase}
      * - {@link SharedWorkerServerBase}
      *
      * @return A new {@link IServerBase} object.
      */
    /* protected */ def createServerBase(): IServer = js.native
    /* InferMemberOverrides */
    override def dispatchEvent(event: CollectionEvent[T, Deque[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
    /* InferMemberOverrides */
    override def hasEventListener(`type`: Type): Boolean = js.native
    /**
      * Open server.
      *
      * @param port Port number to open.
      */
    /* CompleteClass */
    override def open(port: Double): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: Type, listener: Listener[T, Deque[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
  }
  
}

