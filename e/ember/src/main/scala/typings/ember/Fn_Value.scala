package typings.ember

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Value extends js.Object {
  def apply(): js.Promise[Unit] = js.native
  def apply[T](value: T): js.Promise[T] = js.native
  def apply[T](value: js.Thenable[T]): js.Promise[T] = js.native
}

