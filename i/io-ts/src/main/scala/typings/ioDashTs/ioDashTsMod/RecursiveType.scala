package typings.ioDashTs.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "RecursiveType")
@js.native
class RecursiveType[C /* <: Any */, A, O, I] protected () extends Type[A, O, I] {
  def this(
    name: String,
    is: Is[A],
    validate: Validate[I, A],
    encode: Encode[A, O],
    runDefinition: js.Function0[C]
  ) = this()
  val _tag: typings.ioDashTs.ioDashTsStrings.RecursiveType = js.native
  var runDefinition: js.Any = js.native
  def `type`(): C = js.native
}

