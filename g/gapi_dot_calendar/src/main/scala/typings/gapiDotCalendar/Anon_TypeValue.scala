package typings.gapiDotCalendar

import typings.gapiDotCalendar.gapi.client.calendar.ScopeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeValue extends js.Object {
  var `type`: ScopeType
  var value: js.UndefOr[String] = js.undefined
}

object Anon_TypeValue {
  @scala.inline
  def apply(`type`: ScopeType, value: String = null): Anon_TypeValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TypeValue]
  }
}

