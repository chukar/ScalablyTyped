package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalculatedColumn extends js.Object {
  /**
    * A unique ID to identify a calculated column. During a dataset update, if the column ID of a calculated column matches that of an existing calculated column, Amazon QuickSight preserves the existing calculated column.
    */
  var ColumnId: typings.awsDashSdk.clientsQuicksightMod.ColumnId = js.native
  /**
    * Column name.
    */
  var ColumnName: typings.awsDashSdk.clientsQuicksightMod.ColumnName = js.native
  /**
    * An expression that defines the calculated column.
    */
  var Expression: typings.awsDashSdk.clientsQuicksightMod.Expression = js.native
}

object CalculatedColumn {
  @scala.inline
  def apply(ColumnId: ColumnId, ColumnName: ColumnName, Expression: Expression): CalculatedColumn = {
    val __obj = js.Dynamic.literal(ColumnId = ColumnId.asInstanceOf[js.Any], ColumnName = ColumnName.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CalculatedColumn]
  }
}

