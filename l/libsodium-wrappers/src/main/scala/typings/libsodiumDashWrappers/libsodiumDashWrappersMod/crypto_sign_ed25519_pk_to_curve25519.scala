package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_sign_ed25519_pk_to_curve25519")
@js.native
object crypto_sign_ed25519_pk_to_curve25519 extends js.Object {
  def apply(edPk: Uint8Array): Uint8Array = js.native
  def apply(edPk: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(edPk: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
}

