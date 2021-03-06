package typings.googleDashAppsDashScript.GoogleAppsScript.HTML

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A template object for dynamically constructing HTML. For more information, see the guide to templates.
  */
trait HtmlTemplate
  extends /* propName */ StringDictionary[js.Any] {
  def evaluate(): HtmlOutput
  def getCode(): String
  def getCodeWithComments(): String
  def getRawContent(): String
}

object HtmlTemplate {
  @scala.inline
  def apply(
    evaluate: () => HtmlOutput,
    getCode: () => String,
    getCodeWithComments: () => String,
    getRawContent: () => String,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): HtmlTemplate = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction0(evaluate), getCode = js.Any.fromFunction0(getCode), getCodeWithComments = js.Any.fromFunction0(getCodeWithComments), getRawContent = js.Any.fromFunction0(getRawContent))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[HtmlTemplate]
  }
}

