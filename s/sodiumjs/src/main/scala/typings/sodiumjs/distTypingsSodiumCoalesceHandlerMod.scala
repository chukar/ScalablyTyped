package typings.sodiumjs

import typings.sodiumjs.distTypingsSodiumLambdaMod.Lambda2
import typings.sodiumjs.distTypingsSodiumStreamMod.StreamWithSend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs/dist/typings/sodium/CoalesceHandler", JSImport.Namespace)
@js.native
object distTypingsSodiumCoalesceHandlerMod extends js.Object {
  @js.native
  class CoalesceHandler[A] protected () extends js.Object {
    def this(f: js.Function2[/* l */ A, /* r */ A, A], out: StreamWithSend[A]) = this()
    def this(f: Lambda2[A, A, A], out: StreamWithSend[A]) = this()
    var accum: js.Any = js.native
    var accumValid: js.Any = js.native
    var f: js.Any = js.native
    var out: js.Any = js.native
    var verbose: js.Any = js.native
    def send_(a: A): Unit = js.native
  }
  
}

