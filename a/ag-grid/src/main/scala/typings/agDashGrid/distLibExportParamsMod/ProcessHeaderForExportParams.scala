package typings.agDashGrid.distLibExportParamsMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibGridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessHeaderForExportParams extends js.Object {
  var api: GridApi
  var column: Column
  var columnApi: ColumnApi
  var context: js.Any
}

object ProcessHeaderForExportParams {
  @scala.inline
  def apply(api: GridApi, column: Column, columnApi: ColumnApi, context: js.Any): ProcessHeaderForExportParams = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProcessHeaderForExportParams]
  }
}

