package typings.reactDashCssDashThemr.reactDashCssDashThemrMod

import typings.reactDashCssDashThemr.Anon_Theme
import typings.reactDashCssDashThemr.reactDashCssDashThemrBooleans.`false`
import typings.reactDashCssDashThemr.reactDashCssDashThemrStrings.deeply
import typings.reactDashCssDashThemr.reactDashCssDashThemrStrings.softly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThemrOptions extends js.Object {
  /** @default "deeply" */
  var composeTheme: js.UndefOr[deeply | softly | `false`] = js.undefined
  //currently there's no way to lift decorated component's generic type argument (P) to upper decorator
  //that's why just {}
  var mapThemrProps: js.UndefOr[TMapThemrProps[js.Object]] = js.undefined
}

object IThemrOptions {
  @scala.inline
  def apply(
    composeTheme: deeply | softly | `false` = null,
    mapThemrProps: (js.Object, /* theme */ TReactCSSThemrTheme) => js.Object with Anon_Theme = null
  ): IThemrOptions = {
    val __obj = js.Dynamic.literal()
    if (composeTheme != null) __obj.updateDynamic("composeTheme")(composeTheme.asInstanceOf[js.Any])
    if (mapThemrProps != null) __obj.updateDynamic("mapThemrProps")(js.Any.fromFunction2(mapThemrProps))
    __obj.asInstanceOf[IThemrOptions]
  }
}

