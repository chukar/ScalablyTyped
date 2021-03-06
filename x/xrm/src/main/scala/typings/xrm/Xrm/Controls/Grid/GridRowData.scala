package typings.xrm.Xrm.Controls.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for grid row data.  Use the GridRowData.getEntity method to access the GridEntity. GridRowData is
  * returned by the GridRow.getData method.
  */
trait GridRowData extends js.Object {
  /**
    * Returns the GridEntity for the GridRowData.
    * @returns The entity.
    * @deprecated Use GridRow.data.entity instead of using GridRow.getData().getEntity().
    */
  def getEntity(): GridEntity
}

object GridRowData {
  @scala.inline
  def apply(getEntity: () => GridEntity): GridRowData = {
    val __obj = js.Dynamic.literal(getEntity = js.Any.fromFunction0(getEntity))
  
    __obj.asInstanceOf[GridRowData]
  }
}

