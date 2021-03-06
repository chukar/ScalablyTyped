package typings.reduxDashForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFormMod {
  import typings.react.reactMod.FormHTMLAttributes
  import typings.reduxDashForm.reduxDashFormMod.Omit
  import typings.reduxDashForm.reduxDashFormStrings.onSubmit
  import typings.std.HTMLFormElement

  type FormProps[FormData, P, ErrorType] = (Omit[FormHTMLAttributes[HTMLFormElement], onSubmit]) with (FormSubmitProp[FormData, P, ErrorType])
}
