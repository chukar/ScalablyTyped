package typings.fsDashPlus.fsDashPlusMod

import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-plus", "utimes")
@js.native
object utimes extends js.Object {
  /**
    * Asynchronously change file timestamps of the file referenced by the supplied path.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  def apply(path: PathLike, atime: String, mtime: String, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: String, mtime: Double, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: String, mtime: Date, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: Double, mtime: String, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: Double, mtime: Double, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: Double, mtime: Date, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: Date, mtime: String, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: Date, mtime: Double, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: Date, mtime: Date, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronously change file timestamps of the file referenced by the supplied path.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  def __promisify__(path: PathLike, atime: String, mtime: String): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, atime: String, mtime: Double): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, atime: String, mtime: Date): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, atime: Double, mtime: String): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, atime: Double, mtime: Date): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, atime: Date, mtime: String): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, atime: Date, mtime: Double): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, atime: Date, mtime: Date): js.Promise[Unit] = js.native
}

