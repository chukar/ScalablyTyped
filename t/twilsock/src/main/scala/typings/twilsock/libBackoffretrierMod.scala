package typings.twilsock

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/backoffretrier", JSImport.Namespace)
@js.native
object libBackoffretrierMod extends js.Object {
  /**
    * Retrier with backoff override capability
  */
  @js.native
  class BackoffRetrier protected () extends EventEmitter {
    def this(options: Anon_Initial) = this()
    var cleanRetrier: js.Any = js.native
    var createRetrier: js.Any = js.native
    var getRetryPolicy: js.Any = js.native
    val inProgress: Boolean = js.native
    var newBackoff: js.Any = js.native
    val options: js.Any = js.native
    var retrier: js.Any = js.native
    var usedBackoff: js.Any = js.native
    /**
      * Mark last emmited attempt as failed, initiating either next of fail if limits were hit.
      */
    def attemptFailed(): Unit = js.native
    def cancel(): Unit = js.native
    /**
      * Modifies backoff for next attempt.
      * Expected behavior:
      * - If there was no backoff passed previously reschedulling next attempt to given backoff
      * - If previous backoff was longer then ignoring this one.
      * - If previous backoff was shorter then reschedulling with this one.
      * With or without backoff retrier will keep growing normally.
      * @param delay delay of next attempts in ms.
      */
    def modifyBackoff(delay: Double): Unit = js.native
    /**
      * Should be called once per attempt series to start retrier.
      */
    def start(): Unit = js.native
    /**
      * Should be called to stop retrier entirely.
      */
    def stop(): Unit = js.native
  }
  
}

