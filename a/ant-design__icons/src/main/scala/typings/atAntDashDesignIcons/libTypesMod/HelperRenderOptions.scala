package typings.atAntDashDesignIcons.libTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAntDashDesignIcons.Anon_PrimaryColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelperRenderOptions extends js.Object {
  var extraSVGAttrs: js.UndefOr[StringDictionary[String]] = js.undefined
  var placeholders: js.UndefOr[Anon_PrimaryColor] = js.undefined
}

object HelperRenderOptions {
  @scala.inline
  def apply(extraSVGAttrs: StringDictionary[String] = null, placeholders: Anon_PrimaryColor = null): HelperRenderOptions = {
    val __obj = js.Dynamic.literal()
    if (extraSVGAttrs != null) __obj.updateDynamic("extraSVGAttrs")(extraSVGAttrs.asInstanceOf[js.Any])
    if (placeholders != null) __obj.updateDynamic("placeholders")(placeholders.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelperRenderOptions]
  }
}

