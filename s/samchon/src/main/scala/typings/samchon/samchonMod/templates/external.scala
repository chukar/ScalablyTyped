package typings.samchon.samchonMod.templates

import typings.samchon.protocolCommunicatorIClientDriverMod.IClientDriver
import typings.samchon.templatesExternalInterfacesIExternalServerMod.IExternalServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon", "templates.external")
@js.native
object external extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalClientArray[T /* <: typings.samchon.templatesExternalExternalSystemMod.ExternalSystem */] ()
    extends typings.samchon.templatesMod.external.ExternalClientArray[T]
  
  @js.native
  abstract class ExternalServer protected ()
    extends typings.samchon.templatesMod.external.ExternalServer {
    /**
      * Construct from parent {@link ExternalSystemArray}.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      */
    def this(systemArray: typings.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray[IExternalServer]) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalServerArray[T /* <: IExternalServer */] ()
    extends typings.samchon.templatesMod.external.ExternalServerArray[T]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalServerClientArray[T /* <: typings.samchon.templatesExternalExternalSystemMod.ExternalSystem */] ()
    extends typings.samchon.templatesMod.external.ExternalServerClientArray[T]
  
  @js.native
  abstract class ExternalSystem protected ()
    extends typings.samchon.templatesMod.external.ExternalSystem {
    /**
      * Construct from parent {@link ExternalSystemArray}.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      */
    def this(systemArray: typings.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray[typings.samchon.templatesExternalExternalSystemMod.ExternalSystem]) = this()
    /**
      * Constrct from parent {@link ExternalSystemArray} and communicator.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      * @param communicator Communicator with the remote, external system.
      */
    def this(
      systemArray: typings.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray[typings.samchon.templatesExternalExternalSystemMod.ExternalSystem],
      communicator: IClientDriver
    ) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalSystemArray[System /* <: typings.samchon.templatesExternalExternalSystemMod.ExternalSystem */] ()
    extends typings.samchon.templatesMod.external.ExternalSystemArray[System]
  
  @js.native
  abstract class ExternalSystemRole protected ()
    extends typings.samchon.templatesMod.external.ExternalSystemRole {
    /**
      * Constructor from a system.
      *
      * @param system An external system containing this role.
      */
    def this(system: typings.samchon.templatesExternalExternalSystemMod.ExternalSystem) = this()
  }
  
}

