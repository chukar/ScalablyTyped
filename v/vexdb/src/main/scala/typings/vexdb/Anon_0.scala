package typings.vexdb

import typings.vexdb.vexdbNumbers.`0`
import typings.vexdb.vexdbNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0[T] extends js.Object {
  var result: js.Array[T]
  var size: Double
  var status: `0` | `1`
}

object Anon_0 {
  @scala.inline
  def apply[T](result: js.Array[T], size: Double, status: `0` | `1`): Anon_0[T] = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_0[T]]
  }
}

