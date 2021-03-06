package typings.reactDashAddonsDashTestDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashAddonsDashTestDashUtilsMod {
  import typings.react.reactMod.Component
  import typings.std.Element

  type EventSimulator = js.Function2[
    /* element */ Element | (Component[js.Any, js.Object, js.Any]), 
    /* eventData */ js.UndefOr[SyntheticEventData], 
    Unit
  ]
}
