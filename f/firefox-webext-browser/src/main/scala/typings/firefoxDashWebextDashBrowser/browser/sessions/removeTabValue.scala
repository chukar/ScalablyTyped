package typings.firefoxDashWebextDashBrowser.browser.sessions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.sessions.removeTabValue")
@js.native
object removeTabValue extends js.Object {
  /**
    * Remove a key/value pair that was set on a given tab.
    * @param tabId The id of the tab whose key/value pair is being removed.
    * @param key The key which corresponds to the value.
    */
  def apply(tabId: Double, key: String): js.Promise[Unit] = js.native
}

