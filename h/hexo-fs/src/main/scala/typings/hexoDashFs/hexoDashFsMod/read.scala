package typings.hexoDashFs.hexoDashFsMod

import typings.hexoDashFs.Anon_Buffer
import typings.hexoDashFs.Anon_BufferBytesRead
import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "read")
@js.native
object read extends js.Object {
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double): typings.bluebird.bluebirdMod.^[Anon_Buffer] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): typings.bluebird.bluebirdMod.^[Anon_Buffer] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double, length: Double): typings.bluebird.bluebirdMod.^[Anon_BufferBytesRead] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): typings.bluebird.bluebirdMod.^[Anon_BufferBytesRead] = js.native
}

