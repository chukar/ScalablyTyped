package typings.wiredep

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockDetectReplace extends js.Object {
  /**
    * @example:
    *  /(([ \t]*)\/\/\s*bower:*(\S*))(\n|\r|.)*?(\/\/\s*endbower)/gi
    */
  var block: RegExp
  var detect: Anon_CssLess
  var replace: Anon_CssLessString
}

object Anon_BlockDetectReplace {
  @scala.inline
  def apply(block: RegExp, detect: Anon_CssLess, replace: Anon_CssLessString): Anon_BlockDetectReplace = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], detect = detect.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BlockDetectReplace]
  }
}

