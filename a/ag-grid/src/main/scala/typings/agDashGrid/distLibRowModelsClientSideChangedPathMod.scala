package typings.agDashGrid

import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rowModels/clientSide/changedPath", JSImport.Namespace)
@js.native
object distLibRowModelsClientSideChangedPathMod extends js.Object {
  @js.native
  class ChangedPath protected () extends js.Object {
    def this(keepingColumns: Boolean) = this()
    var active: js.Any = js.native
    var keepingColumns: js.Any = js.native
    var nodeIdsToBoolean: js.Any = js.native
    var nodeIdsToColumns: js.Any = js.native
    def addParentNode(rowNode: RowNode): Unit = js.native
    def addParentNode(rowNode: RowNode, columns: js.Array[Column]): Unit = js.native
    def getNotValueColumnsForNode(rowNode: RowNode, valueColumns: js.Array[Column]): js.Array[Column] = js.native
    def getValueColumnsForNode(rowNode: RowNode, valueColumns: js.Array[Column]): js.Array[Column] = js.native
    def isActive(): Boolean = js.native
    def isInPath(rowNode: RowNode): Boolean = js.native
    def setInactive(): Unit = js.native
    /* private */ def validateActive(): js.Any = js.native
  }
  
}

