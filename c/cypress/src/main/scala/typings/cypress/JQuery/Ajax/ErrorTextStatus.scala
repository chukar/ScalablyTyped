package typings.cypress.JQuery.Ajax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cypress.cypressStrings.timeout
  - typings.cypress.cypressStrings.error
  - typings.cypress.cypressStrings.abort
  - typings.cypress.cypressStrings.parsererror
*/
trait ErrorTextStatus extends js.Object

object ErrorTextStatus {
  @scala.inline
  def abort: typings.cypress.cypressStrings.abort = this.cast("abort")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.cypress.cypressStrings.error = this.cast("error")
  @scala.inline
  def parsererror: typings.cypress.cypressStrings.parsererror = this.cast("parsererror")
  @scala.inline
  def timeout: typings.cypress.cypressStrings.timeout = this.cast("timeout")
}

