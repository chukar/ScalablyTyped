package typings.victory

import typings.victory.victoryMod.DomainTuple
import typings.victory.victoryMod._DomainPropType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XYDomainTupleOptional extends _DomainPropType {
  var x: DomainTuple
  var y: js.UndefOr[DomainTuple] = js.undefined
}

object Anon_XYDomainTupleOptional {
  @scala.inline
  def apply(x: DomainTuple, y: DomainTuple = null): Anon_XYDomainTupleOptional = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_XYDomainTupleOptional]
  }
}

