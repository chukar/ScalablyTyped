package typings.transducersDashJs.transducersDashJsMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "cat")
@js.native
object cat extends js.Object {
  def apply[TResult, TInput](xf: Transformer[TResult, TInput]): Transformer[TResult, Iterable[TInput]] = js.native
}

