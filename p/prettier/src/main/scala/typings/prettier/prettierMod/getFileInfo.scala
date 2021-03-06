package typings.prettier.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prettier", "getFileInfo")
@js.native
object getFileInfo extends js.Object {
  def apply(filePath: String): js.Promise[FileInfoResult] = js.native
  def apply(filePath: String, options: FileInfoOptions): js.Promise[FileInfoResult] = js.native
  def sync(filePath: String): FileInfoResult = js.native
  def sync(filePath: String, options: FileInfoOptions): FileInfoResult = js.native
}

