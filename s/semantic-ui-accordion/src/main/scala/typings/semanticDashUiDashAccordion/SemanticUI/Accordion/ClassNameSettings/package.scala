package typings.semanticDashUiDashAccordion.SemanticUI.Accordion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettings {
  import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.active
  import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.animating
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, active | animating]) with (Partial[Pick[_Impl, active | animating]])
}
