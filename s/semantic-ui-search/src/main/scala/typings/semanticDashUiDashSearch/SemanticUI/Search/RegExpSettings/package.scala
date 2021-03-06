package typings.semanticDashUiDashSearch.SemanticUI.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RegExpSettings {
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.beginsWith
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.escape
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, escape | beginsWith]) with (Partial[Pick[_Impl, escape | beginsWith]])
}
