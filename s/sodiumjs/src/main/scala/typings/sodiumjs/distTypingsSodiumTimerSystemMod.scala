package typings.sodiumjs

import typings.sodiumjs.distTypingsSodiumCellMod.Cell
import typings.sodiumjs.distTypingsSodiumStreamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs/dist/typings/sodium/TimerSystem", JSImport.Namespace)
@js.native
object distTypingsSodiumTimerSystemMod extends js.Object {
  @js.native
  class TimerSystem protected () extends js.Object {
    def this(impl: TimerSystemImpl) = this()
    var eventQueue: js.Any = js.native
    var impl: js.Any = js.native
    var tMinimum: js.Any = js.native
    /**
      * A cell giving the current clock time.
      */
    var time: Cell[Double] = js.native
    /**
      * A timer that fires at the specified time, which can be null, meaning
      * that the alarm is not set.
      */
    def at(tAlarm: Cell[Double]): Stream[Double] = js.native
  }
  
  @js.native
  abstract class TimerSystemImpl () extends js.Object {
    /**
      * Return the current clock time.
      */
    def now(): Double = js.native
    /**
      * Set a timer that will execute the specified callback at the specified time.
      * @return A function that can be used to cancel the timer.
      */
    def setTimer(t: Double, callback: js.Function0[Unit]): js.Function0[Unit] = js.native
  }
  
}

