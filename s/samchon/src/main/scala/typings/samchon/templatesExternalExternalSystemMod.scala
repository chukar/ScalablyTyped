package typings.samchon

import typings.ecol.libBasicCollectionEventMod.CollectionEvent
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Listener
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import typings.samchon.protocolCommunicatorIClientDriverMod.IClientDriver
import typings.samchon.protocolCommunicatorICommunicatorMod.ICommunicator
import typings.samchon.protocolEntityEntityCollectionMod.EntityDequeCollection
import typings.samchon.protocolInvokeIProtocolMod.IProtocol
import typings.samchon.protocolInvokeInvokeMod.Invoke
import typings.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray
import typings.samchon.templatesExternalExternalSystemRoleMod.ExternalSystemRole
import typings.tstl.containerDequeMod.Deque
import typings.tstl.containerDequeMod.Deque.Iterator
import typings.tstl.containerDequeMod.Deque.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/external/ExternalSystem", JSImport.Namespace)
@js.native
object templatesExternalExternalSystemMod extends js.Object {
  @js.native
  abstract class ExternalSystem protected ()
    extends EntityDequeCollection[ExternalSystemRole]
       with IProtocol {
    /**
      * Construct from parent {@link ExternalSystemArray}.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      */
    def this(systemArray: ExternalSystemArray[ExternalSystem]) = this()
    /**
      * Constrct from parent {@link ExternalSystemArray} and communicator.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      * @param communicator Communicator with the remote, external system.
      */
    def this(systemArray: ExternalSystemArray[ExternalSystem], communicator: IClientDriver) = this()
    /**
      * @hidden
      */
    var _Handle_close: js.Any = js.native
    /**
      * @hidden
      */
    /**
      * @hidden
      */
    var communicator: ICommunicator = js.native
    /**
      * @hidden
      */
    var communicator_ : js.Any = js.native
    /**
      * The name represents external system have connected.
      */
    var name: String = js.native
    /**
      * @hidden
      */
    var system_array_ : js.Any = js.native
    /* CompleteClass */
    /* InferMemberOverrides */
    override def addEventListener(
      `type`: Type,
      listener: Listener[
          ExternalSystemRole, 
          Deque[ExternalSystemRole], 
          Iterator[ExternalSystemRole], 
          ReverseIterator[ExternalSystemRole]
        ]
    ): Unit = js.native
    /**
      * Close connection.
      */
    def close(): Unit = js.native
    /**
      * Default Destructor.
      *
      * This {@link destructor destructor()} method is called when the {@link ExternalSystem} object is destructed and
      * the {@link ExternalSystem} object is destructed when connection with the remote system is closed or this
      * {@link ExternalSystem} object is {@link ExternalSystemArray.erase erased} from its parent
      * {@link ExternalSystemArray} object.
      *
      * Note that, don't call this {@link destructor destructor()} method by yourself. It must be called automatically
      * by those *destruction* cases. Also, if your derived {@link ExternalSystem} class has something to do on the
      * *destruction*, then overrides this {@link destructor destructor()} method and defines the something to do.
      * Overriding this {@link destructor destructor()}, don't forget to calling ```super.destructor();``` on tail.
      *
      * ```typescript
      * class SomeSystem extends templates.external.ExternalSystem
      * {
      *     protected destructor(): void
      *     {
      *         // DO SOMETHING
      *         this.do_something();
      *
      *         // CALL SUPER.DESTRUCTOR() ON TAIL. DON'T FORGET THIS
      *         super.destructor();
      *     }
      * }
      * ```
      */
    /* protected */ def destructor(): Unit = js.native
    /* CompleteClass */
    /* InferMemberOverrides */
    override def dispatchEvent(
      event: CollectionEvent[
          ExternalSystemRole, 
          Deque[ExternalSystemRole], 
          Iterator[ExternalSystemRole], 
          ReverseIterator[ExternalSystemRole]
        ]
    ): Unit = js.native
    /**
      * Get {@link name}.
      */
    def getName(): String = js.native
    /**
      * Get parent {@link ExternalSystemArray} object.
      */
    def getSystemArray(): ExternalSystemArray[ExternalSystem] = js.native
    /**
      * Get parent {@link ExternalSystemArray} object.
      */
    @JSName("getSystemArray")
    def getSystemArray_SystemArray_ExternalSystemArrayExternalSystem_SystemArray[SystemArray /* <: ExternalSystemArray[ExternalSystem] */](): SystemArray = js.native
    /* CompleteClass */
    /* InferMemberOverrides */
    override def hasEventListener(`type`: Type): Boolean = js.native
    /* CompleteClass */
    /* InferMemberOverrides */
    override def removeEventListener(
      `type`: Type,
      listener: Listener[
          ExternalSystemRole, 
          Deque[ExternalSystemRole], 
          Iterator[ExternalSystemRole], 
          ReverseIterator[ExternalSystemRole]
        ]
    ): Unit = js.native
    /**
      * Sending message.
      *
      * Sends message to related system or shifts the responsibility to chain.
      *
      * @param invoke Invoke message to send
      */
    /* CompleteClass */
    override def replyData(invoke: Invoke): Unit = js.native
    /**
      * Handling replied message.
      *
      * Handles replied message or shifts the responsibility to chain.
      *
      * @param invoke An {@link Invoke} message has received.
      */
    /* CompleteClass */
    override def sendData(invoke: Invoke): Unit = js.native
  }
  
}

