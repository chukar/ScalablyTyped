package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/findIndex", JSImport.Namespace)
@js.native
object internalOperatorsFindIndexMod extends js.Object {
  def findIndex[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, Double] = js.native
  def findIndex[T](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    thisArg: js.Any
  ): OperatorFunction[T, Double] = js.native
}

