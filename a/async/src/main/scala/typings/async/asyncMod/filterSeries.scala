package typings.async.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async", "filterSeries")
@js.native
object filterSeries extends js.Object {
  def apply[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def apply[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
}

