package typings.atJupyterlabLogconsole.libLoggerMod

import typings.atJupyterlabLogconsole.Anon_LastModel
import typings.atJupyterlabLogconsole.libLoggerMod.LoggerOutputAreaModel.IOptions
import typings.atJupyterlabOutputarea.atJupyterlabOutputareaMod.OutputAreaModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable because Already inherited
- typings.atJupyterlabOutputarea.libModelMod.IOutputAreaModel because Already inherited
- typings.atJupyterlabLogconsole.libTokensMod.ILoggerOutputAreaModel because var conflicts: trusted. Inlined maxLength */ @JSImport("@jupyterlab/logconsole/lib/logger", "LoggerOutputAreaModel")
@js.native
class LoggerOutputAreaModel_ protected () extends OutputAreaModel {
  def this(hasMaxLengthOptions: IOptions) = this()
  /**
    * Manually apply length limit.
    */
  var _applyMaxLength: js.Any = js.native
  var _maxLength: js.Any = js.native
  /**
    * Maximum number of outputs to store in the model.
    */
  var maxLength: Double = js.native
  /**
    * Whether an output should combine with the previous output.
    *
    * We combine if the two outputs are in the same second, which is the
    * resolution for our time display.
    */
  /* protected */ def shouldCombine(options: Anon_LastModel): Boolean = js.native
}

