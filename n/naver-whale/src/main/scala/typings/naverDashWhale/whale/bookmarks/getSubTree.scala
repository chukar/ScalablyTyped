package typings.naverDashWhale.whale.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bookmarks.getSubTree")
@js.native
object getSubTree extends js.Object {
  def apply(
    id: String,
    callback: js.Function1[/* results */ js.Array[typings.chrome.chrome.bookmarks.BookmarkTreeNode], Unit]
  ): Unit = js.native
}

