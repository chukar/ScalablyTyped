package typings.semanticDashUiDashProgress.SemanticUI.Progress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SelectorSettings {
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.bar
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.label
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.progress
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, bar | label | progress]) with (Partial[Pick[_Impl, bar | label | progress]])
}
