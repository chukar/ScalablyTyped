package typings.node.zlibMod

import typings.node.Anon_End
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeflateRaw
  extends Transform
     with Zlib
     with ZlibReset
     with ZlibParams {
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
}

@JSImport("zlib", "deflateRaw")
@js.native
object deflateRaw extends js.Object {
  def apply(buf: InputType, callback: CompressCallback): Unit = js.native
  def apply(buf: InputType, options: ZlibOptions, callback: CompressCallback): Unit = js.native
}

