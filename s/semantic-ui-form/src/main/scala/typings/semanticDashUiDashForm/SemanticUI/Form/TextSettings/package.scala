package typings.semanticDashUiDashForm.SemanticUI.Form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TextSettings {
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.unspecifiedField
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.unspecifiedRule
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, unspecifiedRule | unspecifiedField]) with (Partial[Pick[_Impl, unspecifiedRule | unspecifiedField]])
}
