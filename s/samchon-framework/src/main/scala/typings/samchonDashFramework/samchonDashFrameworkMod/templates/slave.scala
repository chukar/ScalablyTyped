package typings.samchonDashFramework.samchonDashFrameworkMod.templates

import typings.samchon.protocolInvokeInvokeMod.Invoke
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon-framework", "templates.slave")
@js.native
object slave extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  class InvokeHistory ()
    extends typings.samchon.samchonMod.templates.slave.InvokeHistory {
    /**
      * Construct from an {@link Invoke} message.
      *
      * @param invoke An {@link Invoke} message requesting a *parallel or distributed process*.
      */
    def this(invoke: Invoke) = this()
  }
  
  @js.native
  class PInvoke protected ()
    extends typings.samchon.samchonMod.templates.slave.PInvoke {
    /**
      * Initializer Constructor.
      *
      * @param invoke Original {@link Invoke} message.
      * @param history {@link InvokeHistory} object archiving execution time.
      * @param slaveSystem Related {@link SlaveSystem} object who gets those processes from its master.
      */
    def this(
      invoke: Invoke,
      history: typings.samchon.templatesSlaveInvokeHistoryMod.InvokeHistory,
      slaveSystem: typings.samchon.templatesSlaveSlaveSystemMod.SlaveSystem
    ) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveClient ()
    extends typings.samchon.samchonMod.templates.slave.SlaveClient
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveServer ()
    extends typings.samchon.samchonMod.templates.slave.SlaveServer
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveSystem ()
    extends typings.samchon.samchonMod.templates.slave.SlaveSystem
  
}

