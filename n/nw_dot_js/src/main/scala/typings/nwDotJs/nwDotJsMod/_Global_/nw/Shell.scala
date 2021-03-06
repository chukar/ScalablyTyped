package typings.nwDotJs.nwDotJsMod._Global_.nw

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Shell: http://docs.nwjs.io/en/latest/References/Shell/ */
/**
  * `Shell` is a collection of APIs that do desktop related jobs.
  */
trait Shell extends js.Object {
  /**
    * Open the given external URI in the desktop"s default manner.
    *
    * @param uri {string} A URL to open in system default manner.
    */
  def openExternal(uri: String): Unit
  /**
    * Open the given file_path in the desktop"s default manner.
    *
    * @param file_path {string} path to a local file
    */
  def openItem(file_path: String): Unit
  /**
    * Show the given file_path in the parent folder with file manager. If possible, select the file.
    *
    * @param file_path {string} path to a local file
    */
  def showItemInFolder(file_path: String): Unit
}

@JSGlobal("nw.Shell")
@js.native
object Shell extends TopLevel[Shell]

