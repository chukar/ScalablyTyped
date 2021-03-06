package typings.tar.tarMod

import typings.node.streamMod.Writable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tar", "t")
@js.native
object t extends js.Object {
  def apply(): Writable = js.native
  def apply(options: ListOptions with FileOptions): js.Promise[Unit] = js.native
  def apply(options: ListOptions with FileOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
  def apply(
    options: ListOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Writable = js.native
}

