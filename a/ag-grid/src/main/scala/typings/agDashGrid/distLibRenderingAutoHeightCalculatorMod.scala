package typings.agDashGrid

import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibGridPanelGridPanelMod.GridPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/autoHeightCalculator", JSImport.Namespace)
@js.native
object distLibRenderingAutoHeightCalculatorMod extends js.Object {
  @js.native
  class AutoHeightCalculator () extends js.Object {
    @JSName("$scope")
    var $scope: js.Any = js.native
    var beans: js.Any = js.native
    var columnController: js.Any = js.native
    var eDummyContainer: js.Any = js.native
    var gridPanel: js.Any = js.native
    def getPreferredHeightForRow(rowNode: RowNode): Double = js.native
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
  }
  
}

