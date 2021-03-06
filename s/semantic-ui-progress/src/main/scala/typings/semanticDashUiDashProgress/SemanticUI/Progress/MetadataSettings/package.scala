package typings.semanticDashUiDashProgress.SemanticUI.Progress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MetadataSettings {
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.percent
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.total
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.value
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, percent | total | value]) with (Partial[Pick[_Impl, percent | total | value]])
}
