package typings.chrome.chrome.privacy

import org.scalablytyped.runtime.TopLevel
import typings.chrome.chrome.types.ChromeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Websites extends js.Object {
  /** @since Chrome 65. */
  var doNotTrackEnabled: ChromeSetting
  var hyperlinkAuditingEnabled: ChromeSetting
  /** @since Chrome 21. Available on Windows and ChromeOS only. */
  var protectedContentEnabled: ChromeSetting
  var referrersEnabled: ChromeSetting
  var thirdPartyCookiesAllowed: ChromeSetting
}

object Websites {
  @scala.inline
  def apply(
    doNotTrackEnabled: ChromeSetting,
    hyperlinkAuditingEnabled: ChromeSetting,
    protectedContentEnabled: ChromeSetting,
    referrersEnabled: ChromeSetting,
    thirdPartyCookiesAllowed: ChromeSetting
  ): Websites = {
    val __obj = js.Dynamic.literal(doNotTrackEnabled = doNotTrackEnabled.asInstanceOf[js.Any], hyperlinkAuditingEnabled = hyperlinkAuditingEnabled.asInstanceOf[js.Any], protectedContentEnabled = protectedContentEnabled.asInstanceOf[js.Any], referrersEnabled = referrersEnabled.asInstanceOf[js.Any], thirdPartyCookiesAllowed = thirdPartyCookiesAllowed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Websites]
  }
}

@JSGlobal("chrome.privacy.websites")
@js.native
object websites extends TopLevel[Websites]

