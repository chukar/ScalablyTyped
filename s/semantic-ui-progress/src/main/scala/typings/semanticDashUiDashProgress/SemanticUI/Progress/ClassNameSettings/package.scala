package typings.semanticDashUiDashProgress.SemanticUI.Progress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettings {
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.active
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.error
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.success
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.warning
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, active | error | success | warning]) with (Partial[Pick[_Impl, active | error | success | warning]])
}
