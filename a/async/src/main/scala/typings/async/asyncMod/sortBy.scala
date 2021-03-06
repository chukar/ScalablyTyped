package typings.async.asyncMod

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async", "sortBy")
@js.native
object sortBy extends js.Object {
  def apply[T, V, E](arr: js.Array[T], iterator: AsyncResultIterator[T, V, E]): Unit = js.native
  def apply[T, V, E](arr: js.Array[T], iterator: AsyncResultIterator[T, V, E], callback: AsyncResultArrayCallback[T, E]): Unit = js.native
  def apply[T, V, E](arr: IterableIterator[T], iterator: AsyncResultIterator[T, V, E]): Unit = js.native
  def apply[T, V, E](
    arr: IterableIterator[T],
    iterator: AsyncResultIterator[T, V, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
}

