package typings.semanticDashUiDashReact.distCommonjsViewsCardCardHeaderMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.center
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.left
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardHeaderProps
  extends StrictCardHeaderProps
     with /* key */ StringDictionary[js.Any]

object CardHeaderProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    textAlign: center | left | right = null
  ): CardHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardHeaderProps]
  }
}

