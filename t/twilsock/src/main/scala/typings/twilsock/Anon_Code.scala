package typings.twilsock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: Double
  var status: String
}

object Anon_Code {
  @scala.inline
  def apply(code: Double, status: String): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Code]
  }
}

