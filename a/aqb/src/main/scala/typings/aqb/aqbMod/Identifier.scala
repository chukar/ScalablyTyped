package typings.aqb.aqbMod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Identifier
  extends Expression
     with Instantiable1[/* value */ js.Any, Expression] {
  var _value: String = js.native
  def toAQL(): String = js.native
}

