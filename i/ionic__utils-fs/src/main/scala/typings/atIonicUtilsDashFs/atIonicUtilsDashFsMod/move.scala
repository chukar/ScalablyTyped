package typings.atIonicUtilsDashFs.atIonicUtilsDashFsMod

import typings.fsDashExtra.fsDashExtraMod.MoveOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", "move")
@js.native
object move extends js.Object {
  def apply(src: String, dest: String): js.Promise[Unit] = js.native
  def apply(src: String, dest: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(src: String, dest: String, options: MoveOptions): js.Promise[Unit] = js.native
  def apply(src: String, dest: String, options: MoveOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

