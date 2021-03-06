package typings.atIonicCliDashFramework.libMod

import org.scalablytyped.runtime.TopLevel
import typings.atIonicCliDashFramework.libLoggerMod.LoggerHandler
import typings.atIonicCliDashFramework.libLoggerMod.LoggerOptions
import typings.std.ReadonlySet
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib", "Logger")
@js.native
class Logger ()
  extends typings.atIonicCliDashFramework.libLoggerMod.Logger {
  def this(hasLevelHandlers: LoggerOptions) = this()
}

/* static members */
@JSImport("@ionic/cli-framework/lib", "Logger")
@js.native
object Logger extends js.Object {
  def cloneHandlers(handlers: ReadonlySet[LoggerHandler]): Set[LoggerHandler] = js.native
}

@JSImport("@ionic/cli-framework/lib", "logger")
@js.native
object logger
  extends TopLevel[typings.atIonicCliDashFramework.libLoggerMod.Logger]

