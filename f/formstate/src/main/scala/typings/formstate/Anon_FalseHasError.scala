package typings.formstate

import typings.formstate.formstateBooleans.`false`
import typings.formstate.libCoreFormStateMod.ValidatableMapOrArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FalseHasError[TValue /* <: ValidatableMapOrArray */] extends js.Object {
  var hasError: `false`
  var value: TValue
}

object Anon_FalseHasError {
  @scala.inline
  def apply[TValue /* <: ValidatableMapOrArray */](hasError: `false`, value: TValue): Anon_FalseHasError[TValue] = {
    val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FalseHasError[TValue]]
  }
}

