package typings.semanticDashUiDashEmbed.SemanticUI.Embed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettings {
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.active
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.embed
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, active | embed]) with (Partial[Pick[_Impl, active | embed]])
}
