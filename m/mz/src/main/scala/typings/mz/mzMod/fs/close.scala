package typings.mz.mzMod.fs

import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.NoParamCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("mz", "fs.close")
@js.native
object close extends js.Object {
  def apply(fd: Double): js.Promise[Unit] = js.native
  /**
    * Asynchronous close(2) - close a file descriptor.
    * @param fd A file descriptor.
    */
  def apply(fd: Double, callback: (js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]) | NoParamCallback): Unit = js.native
  /**
    * Asynchronous close(2) - close a file descriptor.
    * @param fd A file descriptor.
    */
  def __promisify__(fd: Double): js.Promise[Unit] = js.native
}

