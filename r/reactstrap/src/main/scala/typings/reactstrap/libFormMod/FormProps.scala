package typings.reactstrap.libFormMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ReactType
import typings.react.reactMod.Ref
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormProps
  extends AllHTMLAttributes[HTMLFormElement]
     with ClassAttributes[HTMLFormElement]
     with /* key */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var innerRef: js.UndefOr[Ref[HTMLFormElement]] = js.undefined
  var tag: js.UndefOr[String | ReactType[_]] = js.undefined
}

object FormProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLFormElement] = null,
    ClassAttributes: ClassAttributes[HTMLFormElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    cssModule: CSSModule = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    innerRef: Ref[HTMLFormElement] = null,
    tag: String | ReactType[_] = null
  ): FormProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormProps]
  }
}

