package typings.atAngularCompiler.srcUtilMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/util", "getParseErrors")
@js.native
object getParseErrors extends js.Object {
  def apply(error: Error): js.Array[ParseError] = js.native
}

