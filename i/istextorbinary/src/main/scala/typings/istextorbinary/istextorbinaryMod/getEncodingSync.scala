package typings.istextorbinary.istextorbinaryMod

import typings.istextorbinary.istextorbinaryStrings.binary
import typings.istextorbinary.istextorbinaryStrings.utf8
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istextorbinary", "getEncodingSync")
@js.native
object getEncodingSync extends js.Object {
  def apply(buffer: Buffer): utf8 | binary = js.native
  def apply(buffer: Buffer, opts: Options): utf8 | binary = js.native
}

