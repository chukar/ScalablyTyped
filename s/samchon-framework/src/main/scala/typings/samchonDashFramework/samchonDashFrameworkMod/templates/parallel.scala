package typings.samchonDashFramework.samchonDashFrameworkMod.templates

import typings.samchon.protocolCommunicatorIClientDriverMod.IClientDriver
import typings.samchon.protocolInvokeInvokeMod.Invoke
import typings.samchon.templatesDistributedDistributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
import typings.samchon.templatesParallelInterfacesIParallelServerMod.IParallelServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon-framework", "templates.parallel")
@js.native
object parallel extends js.Object {
  @js.native
  class MediatorClient protected ()
    extends typings.samchon.samchonMod.templates.parallel.MediatorClient {
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
      * @param ip IP address to connect.
      * @param port Port number to connect.
      */
    def this(systemArray: DistributedSystemArrayMediator[DistributedSystem], ip: String, port: Double) = this()
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
      * @param ip IP address to connect.
      * @param port Port number to connect.
      */
    def this(
      systemArray: typings.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typings.samchon.templatesParallelParallelSystemMod.ParallelSystem],
      ip: String,
      port: Double
    ) = this()
  }
  
  @js.native
  class MediatorDedicatedWorkerServer ()
    extends typings.samchon.templatesParallelDerivedMediatorServerMod.MediatorDedicatedWorkerServer
  
  @js.native
  class MediatorServer protected ()
    extends typings.samchon.samchonMod.templates.parallel.MediatorServer {
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
      * @param port Port number of server to open.
      */
    def this(systemArray: DistributedSystemArrayMediator[DistributedSystem], port: Double) = this()
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
      * @param port Port number of server to open.
      */
    def this(
      systemArray: typings.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typings.samchon.templatesParallelParallelSystemMod.ParallelSystem],
      port: Double
    ) = this()
  }
  
  @js.native
  class MediatorSharedWorkerClient ()
    extends typings.samchon.templatesParallelDerivedMediatorClientMod.MediatorSharedWorkerClient
  
  @js.native
  class MediatorSharedWorkerServer ()
    extends typings.samchon.templatesParallelDerivedMediatorServerMod.MediatorSharedWorkerServer
  
  @js.native
  abstract class MediatorSystem protected ()
    extends typings.samchon.samchonMod.templates.parallel.MediatorSystem {
    /**
      * Construct from parent {@link DistributedSystemArrayMediator} object.
      *
      * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
      */
    def this(systemArray: DistributedSystemArrayMediator[DistributedSystem]) = this()
    /**
      * Construct from parent {@link ParallelSystemArrayMediator} object.
      *
      * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
      */
    def this(systemArray: typings.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typings.samchon.templatesParallelParallelSystemMod.ParallelSystem]) = this()
  }
  
  @js.native
  class MediatorWebClient ()
    extends typings.samchon.templatesParallelDerivedMediatorClientMod.MediatorWebClient
  
  @js.native
  class MediatorWebServer ()
    extends typings.samchon.templatesParallelDerivedMediatorServerMod.MediatorWebServer
  
  @js.native
  /**
    * Default Constructor.
    */
  class PRInvokeHistory ()
    extends typings.samchon.samchonMod.templates.parallel.PRInvokeHistory {
    /**
      * Construct from an {@link Invoke} message.
      *
      * @param invoke An {@link Invoke} message requesting a *parallel process*.
      */
    def this(invoke: Invoke) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelClientArray[System /* <: typings.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends typings.samchon.samchonMod.templates.parallel.ParallelClientArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelClientArrayMediator[System /* <: typings.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends typings.samchon.samchonMod.templates.parallel.ParallelClientArrayMediator[System]
  
  @js.native
  abstract class ParallelServer protected ()
    extends typings.samchon.samchonMod.templates.parallel.ParallelServer {
    /**
      * Construct from parent {@link ParallelSystemArray}.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      */
    def this(systemArray: typings.samchon.templatesParallelParallelSystemArrayMod.ParallelSystemArray[IParallelServer]) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerArray[System /* <: IParallelServer */] ()
    extends typings.samchon.samchonMod.templates.parallel.ParallelServerArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerArrayMediator[System /* <: IParallelServer */] ()
    extends typings.samchon.samchonMod.templates.parallel.ParallelServerArrayMediator[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerClientArray[System /* <: typings.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends typings.samchon.samchonMod.templates.parallel.ParallelServerClientArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerClientArrayMediator[System /* <: typings.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends typings.samchon.samchonMod.templates.parallel.ParallelServerClientArrayMediator[System]
  
  @js.native
  abstract class ParallelSystem protected ()
    extends typings.samchon.samchonMod.templates.parallel.ParallelSystem {
    /**
      * Construct from parent {@link ParallelSystemArray}.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      */
    def this(systemArray: typings.samchon.templatesParallelParallelSystemArrayMod.ParallelSystemArray[typings.samchon.templatesParallelParallelSystemMod.ParallelSystem]) = this()
    /**
      * Construct from parent {@link ParallelSystemArray} and communicator.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      * @param communicator A communicator communicates with remote, the external system.
      */
    def this(
      systemArray: typings.samchon.templatesParallelParallelSystemArrayMod.ParallelSystemArray[typings.samchon.templatesParallelParallelSystemMod.ParallelSystem],
      communicator: IClientDriver
    ) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelSystemArray[System /* <: typings.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends typings.samchon.samchonMod.templates.parallel.ParallelSystemArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelSystemArrayMediator[System /* <: typings.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends typings.samchon.samchonMod.templates.parallel.ParallelSystemArrayMediator[System]
  
}

