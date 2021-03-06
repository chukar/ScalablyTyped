package typings.rxjs

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.internalTypesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/exhaust", JSImport.Namespace)
@js.native
object internalOperatorsExhaustMod extends js.Object {
  def exhaust[R](): OperatorFunction[_, R] = js.native
  @JSName("exhaust")
  def exhaust_T[T](): OperatorFunction[ObservableInput[T], T] = js.native
}

