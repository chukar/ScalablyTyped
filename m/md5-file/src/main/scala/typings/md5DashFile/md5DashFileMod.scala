package typings.md5DashFile

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("md5-file", JSImport.Namespace)
@js.native
object md5DashFileMod extends js.Object {
  def apply(filename: String, cb: js.Function2[/* err */ Error, /* hash */ String, Unit]): Unit = js.native
  def sync(filename: String): String = js.native
}

