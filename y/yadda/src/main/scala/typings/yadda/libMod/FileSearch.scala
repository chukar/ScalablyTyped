package typings.yadda.libMod

import typings.std.RegExp
import typings.yadda.libFileSearchMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda/lib", "FileSearch")
@js.native
class FileSearch protected () extends ^ {
  def this(directories: String) = this()
  def this(directories: String, patterns: RegExp) = this()
}

