package typings.ioDashTs.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "ReadonlyArrayType")
@js.native
class ReadonlyArrayType[C /* <: Any */, A, O, I] protected () extends Type[A, O, I] {
  def this(name: String, is: Is[A], validate: Validate[I, A], encode: Encode[A, O], `type`: C) = this()
  val _tag: typings.ioDashTs.ioDashTsStrings.ReadonlyArrayType = js.native
  val `type`: C = js.native
}

