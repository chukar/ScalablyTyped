package typings.slate

import typings.immutable.Immutable.List
import typings.slate.slateMod.Operation
import typings.slate.slateMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Operations extends js.Object {
  var operations: List[Operation]
  var value: Value
}

object Anon_Operations {
  @scala.inline
  def apply(operations: List[Operation], value: Value): Anon_Operations = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Operations]
  }
}

