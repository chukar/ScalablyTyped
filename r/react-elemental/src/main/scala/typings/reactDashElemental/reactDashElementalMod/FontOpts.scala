package typings.reactDashElemental.reactDashElementalMod

import typings.reactDashElemental.Anon_BoldRegular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontOpts extends js.Object {
  var primary: js.UndefOr[Anon_BoldRegular] = js.undefined
  var secondary: js.UndefOr[Anon_BoldRegular] = js.undefined
}

object FontOpts {
  @scala.inline
  def apply(primary: Anon_BoldRegular = null, secondary: Anon_BoldRegular = null): FontOpts = {
    val __obj = js.Dynamic.literal()
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (secondary != null) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontOpts]
  }
}

