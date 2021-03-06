package typings.tarn

import typings.std.Error
import typings.tarn.libUtilsMod.Deferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tarn/lib/PendingOperation", JSImport.Namespace)
@js.native
object libPendingOperationMod extends js.Object {
  @js.native
  class PendingOperation[T] protected () extends js.Object {
    def this(timeoutMillis: Double) = this()
    var deferred: Deferred[T] = js.native
    var possibleTimeoutCause: Error | Null = js.native
    var promise: js.Promise[T] = js.native
    var timeoutMillis: Double = js.native
    def abort(): Unit = js.native
    def reject(err: Error): Unit = js.native
    def resolve(value: T): Unit = js.native
  }
  
}

