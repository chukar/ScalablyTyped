package typings.gapiDotCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Token obtained from the nextSyncToken field returned on the last page of results from the previous list request.
// It makes the result of this list request contain only entries that have changed since then.
// All events deleted since the previous list request will always be in the result set and it is not allowed to set showDeleted to False.
// There are several query parameters that cannot be specified together with nextSyncToken to ensure consistency of the client state.
// These are:
/* Rewritten from type alias, can be one of: 
  - typings.gapiDotCalendar.gapiDotCalendarStrings.iCalUID
  - typings.gapiDotCalendar.gapiDotCalendarStrings.orderBy
  - typings.gapiDotCalendar.gapiDotCalendarStrings.privateExtendedProperty
  - typings.gapiDotCalendar.gapiDotCalendarStrings.q
  - typings.gapiDotCalendar.gapiDotCalendarStrings.sharedExtendedProperty
  - typings.gapiDotCalendar.gapiDotCalendarStrings.timeMin
  - typings.gapiDotCalendar.gapiDotCalendarStrings.timeMax
  - typings.gapiDotCalendar.gapiDotCalendarStrings.updatedMin
*/
trait SyncToken extends js.Object

object SyncToken {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def iCalUID: typings.gapiDotCalendar.gapiDotCalendarStrings.iCalUID = this.cast("iCalUID")
  @scala.inline
  def orderBy: typings.gapiDotCalendar.gapiDotCalendarStrings.orderBy = this.cast("orderBy")
  @scala.inline
  def privateExtendedProperty: typings.gapiDotCalendar.gapiDotCalendarStrings.privateExtendedProperty = this.cast("privateExtendedProperty")
  @scala.inline
  def q: typings.gapiDotCalendar.gapiDotCalendarStrings.q = this.cast("q")
  @scala.inline
  def sharedExtendedProperty: typings.gapiDotCalendar.gapiDotCalendarStrings.sharedExtendedProperty = this.cast("sharedExtendedProperty")
  @scala.inline
  def timeMax: typings.gapiDotCalendar.gapiDotCalendarStrings.timeMax = this.cast("timeMax")
  @scala.inline
  def timeMin: typings.gapiDotCalendar.gapiDotCalendarStrings.timeMin = this.cast("timeMin")
  @scala.inline
  def updatedMin: typings.gapiDotCalendar.gapiDotCalendarStrings.updatedMin = this.cast("updatedMin")
}

