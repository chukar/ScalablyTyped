package typings.blake2sDashJs.blake2sDashJsMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BLAKE2s extends js.Object {
  def digest(): Uint8Array = js.native
  def hexDigest(): String = js.native
  def update(p: ByteArray): this.type = js.native
  def update(p: ByteArray, offset: Double): this.type = js.native
  def update(p: ByteArray, offset: Double, length: Double): this.type = js.native
}

