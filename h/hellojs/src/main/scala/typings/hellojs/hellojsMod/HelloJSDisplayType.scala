package typings.hellojs.hellojsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hellojs.hellojsStrings.popup
  - typings.hellojs.hellojsStrings.page
  - typings.hellojs.hellojsStrings.none
*/
trait HelloJSDisplayType extends js.Object

object HelloJSDisplayType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typings.hellojs.hellojsStrings.none = this.cast("none")
  @scala.inline
  def page: typings.hellojs.hellojsStrings.page = this.cast("page")
  @scala.inline
  def popup: typings.hellojs.hellojsStrings.popup = this.cast("popup")
}

