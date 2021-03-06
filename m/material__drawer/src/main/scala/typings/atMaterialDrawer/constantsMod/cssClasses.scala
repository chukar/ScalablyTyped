package typings.atMaterialDrawer.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialDrawer.atMaterialDrawerStrings.`mdc-drawer--animate`
import typings.atMaterialDrawer.atMaterialDrawerStrings.`mdc-drawer--closing`
import typings.atMaterialDrawer.atMaterialDrawerStrings.`mdc-drawer--dismissible`
import typings.atMaterialDrawer.atMaterialDrawerStrings.`mdc-drawer--modal`
import typings.atMaterialDrawer.atMaterialDrawerStrings.`mdc-drawer--open`
import typings.atMaterialDrawer.atMaterialDrawerStrings.`mdc-drawer--opening`
import typings.atMaterialDrawer.atMaterialDrawerStrings.`mdc-drawer`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var ANIMATE: `mdc-drawer--animate`
  var CLOSING: `mdc-drawer--closing`
  var DISMISSIBLE: `mdc-drawer--dismissible`
  var MODAL: `mdc-drawer--modal`
  var OPEN: `mdc-drawer--open`
  var OPENING: `mdc-drawer--opening`
  var ROOT: `mdc-drawer`
}

object cssClasses {
  @scala.inline
  def apply(
    ANIMATE: `mdc-drawer--animate`,
    CLOSING: `mdc-drawer--closing`,
    DISMISSIBLE: `mdc-drawer--dismissible`,
    MODAL: `mdc-drawer--modal`,
    OPEN: `mdc-drawer--open`,
    OPENING: `mdc-drawer--opening`,
    ROOT: `mdc-drawer`,
    StringDictionary: StringDictionary[String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(ANIMATE = ANIMATE.asInstanceOf[js.Any], CLOSING = CLOSING.asInstanceOf[js.Any], DISMISSIBLE = DISMISSIBLE.asInstanceOf[js.Any], MODAL = MODAL.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any], OPENING = OPENING.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

