package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecScaleMod.SortOrder
import typings.vegaDashTypings.typesSpecScaleMod._UnionSortField
import typings.vegaDashTypings.vegaDashTypingsStrings.count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CountOp extends _UnionSortField {
  var op: count
  var order: js.UndefOr[SortOrder] = js.undefined
}

object Anon_CountOp {
  @scala.inline
  def apply(op: count, order: SortOrder = null): Anon_CountOp = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CountOp]
  }
}

