package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Personalidnumber extends js.Object {
  /**
    * The personal_id_number for PII in string form.
    */
  var personal_id_number: String
}

object Anon_Personalidnumber {
  @scala.inline
  def apply(personal_id_number: String): Anon_Personalidnumber = {
    val __obj = js.Dynamic.literal(personal_id_number = personal_id_number.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Personalidnumber]
  }
}

