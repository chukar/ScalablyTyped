package typings.openpgp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Signature extends js.Object {
  var signature: String
}

object Anon_Signature {
  @scala.inline
  def apply(signature: String): Anon_Signature = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Signature]
  }
}

