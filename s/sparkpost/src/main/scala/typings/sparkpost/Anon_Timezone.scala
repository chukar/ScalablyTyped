package typings.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Timezone extends js.Object {
  var timezone: js.UndefOr[String] = js.undefined
}

object Anon_Timezone {
  @scala.inline
  def apply(timezone: String = null): Anon_Timezone = {
    val __obj = js.Dynamic.literal()
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Timezone]
  }
}

