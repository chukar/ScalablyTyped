package typings.numeric

import typings.numeric.numericMod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_B extends js.Object {
  var B: Matrix
  var Q: Matrix
}

object Anon_B {
  @scala.inline
  def apply(B: Matrix, Q: Matrix): Anon_B = {
    val __obj = js.Dynamic.literal(B = B.asInstanceOf[js.Any], Q = Q.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_B]
  }
}

