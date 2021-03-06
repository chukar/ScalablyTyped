package typings.cliDashProgress.cliDashProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cli-progress", "SingleBar")
@js.native
class SingleBar protected () extends js.Object {
  /** Initialize a new Progress bar. An instance can be used multiple times! it's not required to re-create it! */
  def this(opt: Options) = this()
  def this(opt: Options, preset: Preset) = this()
  def calculateETA(): Unit = js.native
  def formatTime(t: js.Any, roundToMultipleOf: js.Any): js.Any = js.native
  def getTotal(): js.Any = js.native
  /** Increases the current progress value by a specified amount (default +1). Update payload optionally */
  def increment(step: Double): Unit = js.native
  def increment(step: Double, payload: js.Object): Unit = js.native
  def render(): Unit = js.native
  /** Sets the total progress value while progressbar is active. Especially useful handling dynamic tasks. */
  def setTotal(total: Double): Unit = js.native
  /** Starts the progress bar and set the total and initial value */
  def start(total: Double, startValue: Double): Unit = js.native
  def start(total: Double, startValue: Double, payload: js.Object): Unit = js.native
  /** Stops the progress bar and go to next line */
  def stop(): Unit = js.native
  def stopTimer(): Unit = js.native
  /** Sets the current progress value and optionally the payload with values of custom tokens as a second parameter */
  def update(current: Double): Unit = js.native
  def update(current: Double, payload: js.Object): Unit = js.native
}

