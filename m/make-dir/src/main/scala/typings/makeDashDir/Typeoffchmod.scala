package typings.makeDashDir

import typings.node.fsMod.NoParamCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoffchmod extends js.Object {
  /**
    * Asynchronous fchmod(2) - Change permissions of a file.
    * @param fd A file descriptor.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def apply(fd: Double, mode: String, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, mode: Double, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous fchmod(2) - Change permissions of a file.
    * @param fd A file descriptor.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def __promisify__(fd: Double, mode: String): js.Promise[Unit] = js.native
  def __promisify__(fd: Double, mode: Double): js.Promise[Unit] = js.native
}

