package typings.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Numrcpterrors extends js.Object {
  var num_rcpt_errors: js.UndefOr[Double] = js.undefined
}

object Anon_Numrcpterrors {
  @scala.inline
  def apply(num_rcpt_errors: Int | Double = null): Anon_Numrcpterrors = {
    val __obj = js.Dynamic.literal()
    if (num_rcpt_errors != null) __obj.updateDynamic("num_rcpt_errors")(num_rcpt_errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Numrcpterrors]
  }
}

