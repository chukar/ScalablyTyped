package typings.validator

import typings.validator.validatorMod.validator.HashAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isHash", JSImport.Namespace)
@js.native
object libIsHashMod extends js.Object {
  /**
    * Check if the string is a hash of type algorithm.
    *
    * @param algorithm - HashAlgorithm
    */
  def default(str: String, algorithm: HashAlgorithm): Boolean = js.native
}

