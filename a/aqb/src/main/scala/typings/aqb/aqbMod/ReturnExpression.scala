package typings.aqb.aqbMod

import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnExpression
  extends Expression
     with Instantiable3[/* prev */ LetExpression, /* value */ js.Any, /* distinct */ Boolean, Expression] {
  var _distinct: Boolean = js.native
  var _prev: LetExpression = js.native
  def toAQL(): String = js.native
}

