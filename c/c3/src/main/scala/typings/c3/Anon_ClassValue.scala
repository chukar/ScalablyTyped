package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassValue extends js.Object {
  var `class`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double | String] = js.undefined
}

object Anon_ClassValue {
  @scala.inline
  def apply(`class`: String = null, value: Double | String = null): Anon_ClassValue = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassValue]
  }
}

