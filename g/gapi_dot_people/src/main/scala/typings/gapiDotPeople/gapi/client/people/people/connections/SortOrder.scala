package typings.gapiDotPeople.gapi.client.people.people.connections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gapiDotPeople.gapiDotPeopleStrings.LAST_MODIFIED_ASCENDING
  - typings.gapiDotPeople.gapiDotPeopleStrings.FIRST_NAME_ASCENDING
  - typings.gapiDotPeople.gapiDotPeopleStrings.LAST_NAME_ASCENDING
*/
trait SortOrder extends js.Object

object SortOrder {
  @scala.inline
  def FIRST_NAME_ASCENDING: typings.gapiDotPeople.gapiDotPeopleStrings.FIRST_NAME_ASCENDING = this.cast("FIRST_NAME_ASCENDING")
  @scala.inline
  def LAST_MODIFIED_ASCENDING: typings.gapiDotPeople.gapiDotPeopleStrings.LAST_MODIFIED_ASCENDING = this.cast("LAST_MODIFIED_ASCENDING")
  @scala.inline
  def LAST_NAME_ASCENDING: typings.gapiDotPeople.gapiDotPeopleStrings.LAST_NAME_ASCENDING = this.cast("LAST_NAME_ASCENDING")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

