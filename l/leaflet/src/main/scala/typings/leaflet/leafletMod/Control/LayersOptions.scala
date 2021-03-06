package typings.leaflet.leafletMod.Control

import typings.leaflet.leafletMod.ControlOptions
import typings.leaflet.leafletMod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersOptions extends ControlOptions {
  var autoZIndex: js.UndefOr[Boolean] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var hideSingleBase: js.UndefOr[Boolean] = js.undefined
}

object LayersOptions {
  @scala.inline
  def apply(
    autoZIndex: js.UndefOr[Boolean] = js.undefined,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    hideSingleBase: js.UndefOr[Boolean] = js.undefined,
    position: ControlPosition = null
  ): LayersOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoZIndex)) __obj.updateDynamic("autoZIndex")(autoZIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (!js.isUndefined(hideSingleBase)) __obj.updateDynamic("hideSingleBase")(hideSingleBase.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersOptions]
  }
}

