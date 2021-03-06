package typings.ejDotWebDotAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsMappingRow extends js.Object {
  /** Specifies the value of the column or row.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /** Specifies the name of the column or row.
    */
  var propertyName: js.UndefOr[String] = js.undefined
}

object ItemsMappingRow {
  @scala.inline
  def apply(displayName: String = null, propertyName: String = null): ItemsMappingRow = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (propertyName != null) __obj.updateDynamic("propertyName")(propertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsMappingRow]
  }
}

