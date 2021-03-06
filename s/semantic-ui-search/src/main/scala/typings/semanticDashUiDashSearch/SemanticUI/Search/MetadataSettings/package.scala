package typings.semanticDashUiDashSearch.SemanticUI.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MetadataSettings {
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.cache
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.results
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, cache | results]) with (Partial[Pick[_Impl, cache | results]])
}
