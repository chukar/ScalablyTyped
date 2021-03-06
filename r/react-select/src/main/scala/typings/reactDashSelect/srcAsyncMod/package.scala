package typings.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcAsyncMod {
  import typings.react.reactMod.ComponentType
  import typings.reactDashSelect.srcTypesMod.OptionTypeBase

  type AsyncComponentProps[T /* <: ComponentType[_] */] = SelectComponentProps[T] with AsyncProps[_]
  type ClassProps[T] = js.Any
  type FunctionProps[T] = js.Any
  type Props[OptionType /* <: OptionTypeBase */] = typings.reactDashSelect.srcSelectMod.Props[OptionType] with AsyncProps[OptionType]
  type SelectComponentProps[T] = ClassProps[T] | FunctionProps[T]
}
