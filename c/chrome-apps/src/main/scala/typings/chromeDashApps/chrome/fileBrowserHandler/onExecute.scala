package typings.chromeDashApps.chrome.fileBrowserHandler

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.Anon_Entries
import typings.chromeDashApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when file system action is executed from ChromeOS file browser.
  */
@JSGlobal("chrome.fileBrowserHandler.onExecute")
@js.native
object onExecute
  extends TopLevel[
      Event[
        js.Function2[/* id */ FileBrowserHandleExecuteId, /* details */ Anon_Entries, Unit]
      ]
    ]

