package typings.cpx.cpxMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cpx", "copy")
@js.native
object copy extends js.Object {
  def apply(source: String, dest: String): Unit = js.native
  def apply(source: String, dest: String, callback: js.Function1[/* error */ Error | Null, Unit]): Unit = js.native
  def apply(source: String, dest: String, options: AsyncOptions): Unit = js.native
  def apply(
    source: String,
    dest: String,
    options: AsyncOptions,
    callback: js.Function1[/* error */ Error | Null, Unit]
  ): Unit = js.native
}

