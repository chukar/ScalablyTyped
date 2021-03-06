package typings.firefoxDashWebextDashBrowser.browser.webNavigation

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.Anon_ReplacedTabId
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when the contents of the tab is replaced by a different (usually previously pre-rendered) tab. */
@JSGlobal("browser.webNavigation.onTabReplaced")
@js.native
object onTabReplaced
  extends TopLevel[WebExtEvent[js.Function1[/* details */ Anon_ReplacedTabId, Unit]]]

