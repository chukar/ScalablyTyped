package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_scalarmult_base")
@js.native
object crypto_scalarmult_base extends js.Object {
  def apply(privateKey: Uint8Array): Uint8Array = js.native
  def apply(privateKey: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(privateKey: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
}

