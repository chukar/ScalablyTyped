package typings.formstate

import typings.formstate.libCoreFormStateLazyMod.ValidatableArray
import typings.formstate.libCoreFormStateMod.ValidatableMapOrArray
import typings.formstate.libCoreTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formstate", JSImport.Namespace)
@js.native
object formstateMod extends js.Object {
  @js.native
  class FieldState[TValue] protected ()
    extends typings.formstate.libCoreFieldStateMod.FieldState[TValue] {
    def this(_initValue: TValue) = this()
  }
  
  @js.native
  class FormState[TValue /* <: ValidatableMapOrArray */] protected ()
    extends typings.formstate.libCoreFormStateMod.FormState[TValue] {
    def this(/**
      * SubItems can be any Validatable
      */
    $: TValue) = this()
  }
  
  @js.native
  class FormStateLazy[TValue /* <: ValidatableArray */] protected ()
    extends typings.formstate.libCoreFormStateLazyMod.FormStateLazy[TValue] {
    def this(/** It is a function as fields can change over time */
    getFields: js.Function0[TValue]) = this()
  }
  
  def applyValidators[TValue](value: TValue, validators: js.Array[Validator[TValue]]): js.Promise[js.UndefOr[String | Null]] = js.native
}

