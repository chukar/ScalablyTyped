package typings.atMaterialDrawer.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialDrawer.atMaterialDrawerStrings.MDCDrawerColonclosed
import typings.atMaterialDrawer.atMaterialDrawerStrings.MDCDrawerColonopened
import typings.atMaterialDrawer.atMaterialDrawerStrings.`Dotmdc-drawer-app-content`
import typings.atMaterialDrawer.atMaterialDrawerStrings.`Dotmdc-drawer-scrim`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var APP_CONTENT_SELECTOR: `Dotmdc-drawer-app-content`
  var CLOSE_EVENT: MDCDrawerColonclosed
  var OPEN_EVENT: MDCDrawerColonopened
  var SCRIM_SELECTOR: `Dotmdc-drawer-scrim`
}

object strings {
  @scala.inline
  def apply(
    APP_CONTENT_SELECTOR: `Dotmdc-drawer-app-content`,
    CLOSE_EVENT: MDCDrawerColonclosed,
    OPEN_EVENT: MDCDrawerColonopened,
    SCRIM_SELECTOR: `Dotmdc-drawer-scrim`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(APP_CONTENT_SELECTOR = APP_CONTENT_SELECTOR.asInstanceOf[js.Any], CLOSE_EVENT = CLOSE_EVENT.asInstanceOf[js.Any], OPEN_EVENT = OPEN_EVENT.asInstanceOf[js.Any], SCRIM_SELECTOR = SCRIM_SELECTOR.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

