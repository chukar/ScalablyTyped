package typings.atOracleOraclejet.ojtableMod.ojTable

import typings.atOracleOraclejet.Anon_DataIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait DragRowContext[K, D] extends js.Object {
  var rows: js.Array[Anon_DataIndex[D, K]]
}

object DragRowContext {
  @scala.inline
  def apply[K, D](rows: js.Array[Anon_DataIndex[D, K]]): DragRowContext[K, D] = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DragRowContext[K, D]]
  }
}

