package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojtableMod.ojTable.ColumnSelectionEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndIndex[K] extends ColumnSelectionEnd[K] {
  var endIndex: Anon_ColumnNumber
  var endKey: js.UndefOr[Anon_ColumnK[K]] = js.undefined
}

object Anon_EndIndex {
  @scala.inline
  def apply[K](endIndex: Anon_ColumnNumber, endKey: Anon_ColumnK[K] = null): Anon_EndIndex[K] = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any])
    if (endKey != null) __obj.updateDynamic("endKey")(endKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndIndex[K]]
  }
}

