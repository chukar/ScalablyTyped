package typings.browserfs.distNodeBackendEmscriptenMod

import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.SynchronousFileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmscriptenFileSystem extends SynchronousFileSystem {
  var _FS: js.Any = js.native
  def getName(): String = js.native
  def isReadOnly(): Boolean = js.native
  /* private */ def modeToFileType(mode: js.Any): js.Any = js.native
  def supportsProps(): Boolean = js.native
}

