package typings.electron.originalDashFsMod

import typings.electron.electronStrings.buffer
import typings.node.Buffer
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original-fs", "readlinkSync")
@js.native
object readlinkSync_buffer extends js.Object {
  def apply(path: PathLike, options: buffer): Buffer = js.native
}

