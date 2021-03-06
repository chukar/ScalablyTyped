package typings.sodiumjs.sodiumjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs", "IOAction")
@js.native
class IOAction ()
  extends typings.sodiumjs.distTypingsSodiumIOActionMod.IOAction

/* static members */
@JSImport("sodiumjs", "IOAction")
@js.native
object IOAction extends js.Object {
  /*!
    * Convert a function that performs asynchronous I/O taking input A
    * and returning a value of type B into an I/O action of type
    * (sa : Stream<A>) => Stream<B>
    */
  def fromAsync[A, B](performIO: js.Function2[/* a */ A, /* result */ js.Function1[/* b */ B, scala.Unit], scala.Unit]): js.Function1[
    /* sa */ typings.sodiumjs.distTypingsSodiumStreamMod.Stream[A], 
    typings.sodiumjs.distTypingsSodiumStreamMod.Stream[B]
  ] = js.native
}

