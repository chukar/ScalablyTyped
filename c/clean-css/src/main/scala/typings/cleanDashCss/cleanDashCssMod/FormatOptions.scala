package typings.cleanDashCss.cleanDashCssMod

import typings.cleanDashCss.Anon_AfterAtRule
import typings.cleanDashCss.Anon_AroundSelectorRelation
import typings.cleanDashCss.cleanDashCssBooleans.`false`
import typings.cleanDashCss.cleanDashCssStrings.space
import typings.cleanDashCss.cleanDashCssStrings.tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fine grained options for configuring the CSS formatting
  */
trait FormatOptions extends js.Object {
  /**
    * Controls the new line character, can be `'\r\n'` or `'\n'`(aliased as `'windows'` and `'unix'`
    * or `'crlf'` and `'lf'`); defaults to system one, so former on Windows and latter on Unix
    */
  var breakWith: js.UndefOr[String] = js.undefined
  /**
    *  Controls where to insert breaks
    */
  var breaks: js.UndefOr[Anon_AfterAtRule] = js.undefined
  /**
    * Controls number of characters to indent with; defaults to `0`
    */
  var indentBy: js.UndefOr[Double] = js.undefined
  /**
    * Controls a character to indent with, can be `'space'` or `'tab'`; defaults to `'space'`
    */
  var indentWith: js.UndefOr[space | tab] = js.undefined
  /**
    * Controls where to insert spaces
    */
  var spaces: js.UndefOr[Anon_AroundSelectorRelation] = js.undefined
  /**
    * Controls maximum line length; defaults to `false`
    */
  var wrapAt: js.UndefOr[`false` | Double] = js.undefined
}

object FormatOptions {
  @scala.inline
  def apply(
    breakWith: String = null,
    breaks: Anon_AfterAtRule = null,
    indentBy: Int | Double = null,
    indentWith: space | tab = null,
    spaces: Anon_AroundSelectorRelation = null,
    wrapAt: `false` | Double = null
  ): FormatOptions = {
    val __obj = js.Dynamic.literal()
    if (breakWith != null) __obj.updateDynamic("breakWith")(breakWith.asInstanceOf[js.Any])
    if (breaks != null) __obj.updateDynamic("breaks")(breaks.asInstanceOf[js.Any])
    if (indentBy != null) __obj.updateDynamic("indentBy")(indentBy.asInstanceOf[js.Any])
    if (indentWith != null) __obj.updateDynamic("indentWith")(indentWith.asInstanceOf[js.Any])
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    if (wrapAt != null) __obj.updateDynamic("wrapAt")(wrapAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatOptions]
  }
}

