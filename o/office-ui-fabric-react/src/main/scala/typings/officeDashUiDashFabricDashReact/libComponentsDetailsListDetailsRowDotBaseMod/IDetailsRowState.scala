package typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowDotBaseMod

import typings.officeDashUiDashFabricDashReact.Anon_Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsRowState extends js.Object {
  var columnMeasureInfo: js.UndefOr[Anon_Column] = js.undefined
  var isDropping: js.UndefOr[Boolean] = js.undefined
  var selectionState: IDetailsRowSelectionState
}

object IDetailsRowState {
  @scala.inline
  def apply(
    selectionState: IDetailsRowSelectionState,
    columnMeasureInfo: Anon_Column = null,
    isDropping: js.UndefOr[Boolean] = js.undefined
  ): IDetailsRowState = {
    val __obj = js.Dynamic.literal(selectionState = selectionState.asInstanceOf[js.Any])
    if (columnMeasureInfo != null) __obj.updateDynamic("columnMeasureInfo")(columnMeasureInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(isDropping)) __obj.updateDynamic("isDropping")(isDropping.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsRowState]
  }
}

