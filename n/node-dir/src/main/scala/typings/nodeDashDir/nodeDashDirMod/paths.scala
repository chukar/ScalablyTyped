package typings.nodeDashDir.nodeDashDirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-dir", "paths")
@js.native
object paths extends js.Object {
  def apply(dir: String, callback: js.Function2[/* error */ js.Any, /* paths */ PathsResult, Unit]): Unit = js.native
  def apply(
    dir: String,
    combine: Boolean,
    callback: js.Function2[/* error */ js.Any, /* paths */ js.Array[String] | PathsResult, Unit]
  ): Unit = js.native
}

