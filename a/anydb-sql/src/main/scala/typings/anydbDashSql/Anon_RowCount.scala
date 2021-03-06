package typings.anydbDashSql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RowCount[T] extends js.Object {
  var rowCount: Double
  var rows: js.Array[T]
}

object Anon_RowCount {
  @scala.inline
  def apply[T](rowCount: Double, rows: js.Array[T]): Anon_RowCount[T] = {
    val __obj = js.Dynamic.literal(rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_RowCount[T]]
  }
}

