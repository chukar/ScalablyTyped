package typings.atFirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Nanos extends js.Object {
  var nanos: Double
  var seconds: String
}

object Anon_Nanos {
  @scala.inline
  def apply(nanos: Double, seconds: String): Anon_Nanos = {
    val __obj = js.Dynamic.literal(nanos = nanos.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Nanos]
  }
}

