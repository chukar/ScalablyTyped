package typings.reactDashForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashFormMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.react.reactMod._Global_.JSX.Element
  import typings.reactDashForm.Anon_Label
  import typings.reactDashForm.reactDashFormBooleans.`false`

  type FormError = js.UndefOr[String]
  type FormErrors = StringDictionary[FormError]
  type FormValue = js.Any
  type FormValues = Nested[FormValue]
  type NestedErrors = Nested[FormErrors]
  type RenderReturn = Element | `false` | Null | js.Array[scala.Nothing]
  type SelectOptions = js.Array[Anon_Label]
  type Touched = Nested[Boolean]
  type ValidateValuesFunction = js.Function1[/* values */ FormValues, FormErrors]
}
