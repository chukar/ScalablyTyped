package typings.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attempts extends js.Object {
  var attempts: Double
  var batch_id: String
  var response_code: Double
  var ts: String
}

object Anon_Attempts {
  @scala.inline
  def apply(attempts: Double, batch_id: String, response_code: Double, ts: String): Anon_Attempts = {
    val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], batch_id = batch_id.asInstanceOf[js.Any], response_code = response_code.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Attempts]
  }
}

