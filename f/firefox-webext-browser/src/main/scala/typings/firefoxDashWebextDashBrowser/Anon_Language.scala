package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.i18n.LanguageCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Language extends js.Object {
  var language: LanguageCode
  /** The percentage of the detected language */
  var percentage: Double
}

object Anon_Language {
  @scala.inline
  def apply(language: LanguageCode, percentage: Double): Anon_Language = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Language]
  }
}

