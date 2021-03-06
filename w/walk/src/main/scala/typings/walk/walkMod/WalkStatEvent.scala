package typings.walk.walkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.walk.walkStrings.file
  - typings.walk.walkStrings.directory
*/
trait WalkStatEvent extends js.Object

object WalkStatEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def directory: typings.walk.walkStrings.directory = this.cast("directory")
  @scala.inline
  def file: typings.walk.walkStrings.file = this.cast("file")
}

