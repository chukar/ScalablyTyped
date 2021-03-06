package typings.gremlin.gremlinMod.process

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operator extends js.Object {
  var addall: EnumValue
  var and: EnumValue
  var assign: EnumValue
  var div: EnumValue
  var max: EnumValue
  var min: EnumValue
  var minus: EnumValue
  var mult: EnumValue
  var or: EnumValue
  var sum: EnumValue
  var sumlong: EnumValue
}

object Operator {
  @scala.inline
  def apply(
    addall: EnumValue,
    and: EnumValue,
    assign: EnumValue,
    div: EnumValue,
    max: EnumValue,
    min: EnumValue,
    minus: EnumValue,
    mult: EnumValue,
    or: EnumValue,
    sum: EnumValue,
    sumlong: EnumValue
  ): Operator = {
    val __obj = js.Dynamic.literal(addall = addall.asInstanceOf[js.Any], and = and.asInstanceOf[js.Any], assign = assign.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minus = minus.asInstanceOf[js.Any], mult = mult.asInstanceOf[js.Any], or = or.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], sumlong = sumlong.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Operator]
  }
}

@JSImport("gremlin", "process.operator")
@js.native
object operator extends TopLevel[Operator]

