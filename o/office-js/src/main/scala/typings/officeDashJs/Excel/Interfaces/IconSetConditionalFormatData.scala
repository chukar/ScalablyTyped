package typings.officeDashJs.Excel.Interfaces

import typings.officeDashJs.Excel.ConditionalIconCriterion
import typings.officeDashJs.Excel.IconSet
import typings.officeDashJs.officeDashJsStrings.FiveArrows
import typings.officeDashJs.officeDashJsStrings.FiveArrowsGray
import typings.officeDashJs.officeDashJsStrings.FiveBoxes
import typings.officeDashJs.officeDashJsStrings.FiveQuarters
import typings.officeDashJs.officeDashJsStrings.FiveRating
import typings.officeDashJs.officeDashJsStrings.FourArrows
import typings.officeDashJs.officeDashJsStrings.FourArrowsGray
import typings.officeDashJs.officeDashJsStrings.FourRating
import typings.officeDashJs.officeDashJsStrings.FourRedToBlack
import typings.officeDashJs.officeDashJsStrings.FourTrafficLights
import typings.officeDashJs.officeDashJsStrings.Invalid
import typings.officeDashJs.officeDashJsStrings.ThreeArrows
import typings.officeDashJs.officeDashJsStrings.ThreeArrowsGray
import typings.officeDashJs.officeDashJsStrings.ThreeFlags
import typings.officeDashJs.officeDashJsStrings.ThreeSigns
import typings.officeDashJs.officeDashJsStrings.ThreeStars
import typings.officeDashJs.officeDashJsStrings.ThreeSymbols
import typings.officeDashJs.officeDashJsStrings.ThreeSymbols2
import typings.officeDashJs.officeDashJsStrings.ThreeTrafficLights1
import typings.officeDashJs.officeDashJsStrings.ThreeTrafficLights2
import typings.officeDashJs.officeDashJsStrings.ThreeTriangles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `iconSetConditionalFormat.toJSON()`. */
trait IconSetConditionalFormatData extends js.Object {
  /**
    *
    * An array of Criteria and IconSets for the rules and potential custom icons for conditional icons. Note that for the first criterion only the custom icon can be modified, while type, formula, and operator will be ignored when set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var criteria: js.UndefOr[js.Array[ConditionalIconCriterion]] = js.undefined
  /**
    *
    * If true, reverses the icon orders for the IconSet. Note that this cannot be set if custom icons are used.
    *
    * [Api set: ExcelApi 1.6]
    */
  var reverseIconOrder: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * If true, hides the values and only shows icons.
    *
    * [Api set: ExcelApi 1.6]
    */
  var showIconOnly: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * If set, displays the IconSet option for the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var style: js.UndefOr[
    IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes
  ] = js.undefined
}

object IconSetConditionalFormatData {
  @scala.inline
  def apply(
    criteria: js.Array[ConditionalIconCriterion] = null,
    reverseIconOrder: js.UndefOr[Boolean] = js.undefined,
    showIconOnly: js.UndefOr[Boolean] = js.undefined,
    style: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes = null
  ): IconSetConditionalFormatData = {
    val __obj = js.Dynamic.literal()
    if (criteria != null) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseIconOrder)) __obj.updateDynamic("reverseIconOrder")(reverseIconOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(showIconOnly)) __obj.updateDynamic("showIconOnly")(showIconOnly.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconSetConditionalFormatData]
  }
}

