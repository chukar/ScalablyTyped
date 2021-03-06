package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.Anon_Date
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response[T] extends js.Object {
  /** This is the data you would see in https://developer.github.com/v3/ */
  var data: T = js.native
  /** Response headers */
  var headers: Anon_Date = js.native
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[Iterator[_, _, js.UndefOr[scala.Nothing]]] = js.native
  /** Response status number */
  var status: Double = js.native
}

