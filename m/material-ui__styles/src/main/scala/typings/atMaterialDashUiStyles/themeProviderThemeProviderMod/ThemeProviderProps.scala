package typings.atMaterialDashUiStyles.themeProviderThemeProviderMod

import typings.react.reactMod.ReactNode
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeProviderProps[Theme] extends js.Object {
  var children: ReactNode
  var theme: Partial[Theme] | (js.Function1[/* outerTheme */ Theme, Theme])
}

object ThemeProviderProps {
  @scala.inline
  def apply[Theme](theme: Partial[Theme] | (js.Function1[/* outerTheme */ Theme, Theme]), children: ReactNode = null): ThemeProviderProps[Theme] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeProviderProps[Theme]]
  }
}

