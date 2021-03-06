package typings.chromeDashApps.chrome.vpnProvider

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.Anon_CONNECTEDConnectedDISCONNECTED
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chrome.events.Event
import typings.chromeDashApps.chromeDashAppsStrings.connected_
import typings.chromeDashApps.chromeDashAppsStrings.disconnected_
import typings.chromeDashApps.chromeDashAppsStrings.error
import typings.chromeDashApps.chromeDashAppsStrings.linkChanged
import typings.chromeDashApps.chromeDashAppsStrings.linkDown
import typings.chromeDashApps.chromeDashAppsStrings.linkUp
import typings.chromeDashApps.chromeDashAppsStrings.resume
import typings.chromeDashApps.chromeDashAppsStrings.suspend
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Triggered when a message is received from the platform for a VPN configuration owned by the extension. */
@JSGlobal("chrome.vpnProvider.onPlatformMessage")
@js.native
object onPlatformMessage
  extends TopLevel[
      Event[
        js.Function3[
          /* id */ String, 
          /* message */ ToStringLiteral[
            Anon_CONNECTEDConnectedDISCONNECTED, 
            String, 
            Exclude[
              String, 
              linkUp | linkChanged | suspend | resume | linkDown | connected_ | error | disconnected_
            ]
          ], 
          /* error */ String, 
          Unit
        ]
      ]
    ]

