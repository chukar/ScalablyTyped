package typings.officeDashJs.Excel.Interfaces

import typings.officeDashJs.Excel.ArrowheadLength
import typings.officeDashJs.Excel.ArrowheadStyle
import typings.officeDashJs.Excel.ArrowheadWidth
import typings.officeDashJs.Excel.ConnectorType
import typings.officeDashJs.officeDashJsStrings.Curve
import typings.officeDashJs.officeDashJsStrings.Diamond
import typings.officeDashJs.officeDashJsStrings.Elbow
import typings.officeDashJs.officeDashJsStrings.Long
import typings.officeDashJs.officeDashJsStrings.Medium
import typings.officeDashJs.officeDashJsStrings.Narrow
import typings.officeDashJs.officeDashJsStrings.None
import typings.officeDashJs.officeDashJsStrings.Open
import typings.officeDashJs.officeDashJsStrings.Oval
import typings.officeDashJs.officeDashJsStrings.Short
import typings.officeDashJs.officeDashJsStrings.Stealth
import typings.officeDashJs.officeDashJsStrings.Straight
import typings.officeDashJs.officeDashJsStrings.Triangle
import typings.officeDashJs.officeDashJsStrings.Wide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Line object, for use in `line.set({ ... })`. */
trait LineUpdateData extends js.Object {
  /**
    *
    * Represents the length of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadLength: js.UndefOr[ArrowheadLength | Short | Medium | Long] = js.undefined
  /**
    *
    * Represents the style of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadStyle: js.UndefOr[ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open] = js.undefined
  /**
    *
    * Represents the width of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadWidth: js.UndefOr[ArrowheadWidth | Narrow | Medium | Wide] = js.undefined
  /**
    *
    * Represents the connector type for the line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var connectorType: js.UndefOr[ConnectorType | Straight | Elbow | Curve] = js.undefined
  /**
    *
    * Represents the length of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadLength: js.UndefOr[ArrowheadLength | Short | Medium | Long] = js.undefined
  /**
    *
    * Represents the style of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadStyle: js.UndefOr[ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open] = js.undefined
  /**
    *
    * Represents the width of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadWidth: js.UndefOr[ArrowheadWidth | Narrow | Medium | Wide] = js.undefined
}

object LineUpdateData {
  @scala.inline
  def apply(
    beginArrowheadLength: ArrowheadLength | Short | Medium | Long = null,
    beginArrowheadStyle: ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open = null,
    beginArrowheadWidth: ArrowheadWidth | Narrow | Medium | Wide = null,
    connectorType: ConnectorType | Straight | Elbow | Curve = null,
    endArrowheadLength: ArrowheadLength | Short | Medium | Long = null,
    endArrowheadStyle: ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open = null,
    endArrowheadWidth: ArrowheadWidth | Narrow | Medium | Wide = null
  ): LineUpdateData = {
    val __obj = js.Dynamic.literal()
    if (beginArrowheadLength != null) __obj.updateDynamic("beginArrowheadLength")(beginArrowheadLength.asInstanceOf[js.Any])
    if (beginArrowheadStyle != null) __obj.updateDynamic("beginArrowheadStyle")(beginArrowheadStyle.asInstanceOf[js.Any])
    if (beginArrowheadWidth != null) __obj.updateDynamic("beginArrowheadWidth")(beginArrowheadWidth.asInstanceOf[js.Any])
    if (connectorType != null) __obj.updateDynamic("connectorType")(connectorType.asInstanceOf[js.Any])
    if (endArrowheadLength != null) __obj.updateDynamic("endArrowheadLength")(endArrowheadLength.asInstanceOf[js.Any])
    if (endArrowheadStyle != null) __obj.updateDynamic("endArrowheadStyle")(endArrowheadStyle.asInstanceOf[js.Any])
    if (endArrowheadWidth != null) __obj.updateDynamic("endArrowheadWidth")(endArrowheadWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineUpdateData]
  }
}

