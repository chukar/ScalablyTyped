package typings.atMaterialDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object focusDashTrapMod {
  import typings.atMaterialDrawer.atMaterialDrawerStrings.onActivate
  import typings.std.HTMLElement
  import typings.std.Pick

  type ActivateOptions = Pick[Options, onActivate]
  type FocusTarget = HTMLElement | String | js.Function0[HTMLElement]
}
