package typings.pkijs.srcCommonMod

import typings.pkijs.Anon_Counter
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/common", "kdfWithCounter")
@js.native
object kdfWithCounter extends js.Object {
  /**
    * ANS X9.63 Key Derivation Function having a "Counter" as a parameter
    * 
    * @param {string} hashFunction Used hash function
    * @param {ArrayBuffer} Zbuffer ArrayBuffer containing ECDH shared secret to derive from
    * @param {number} Counter
    * @param {ArrayBuffer} SharedInfo Usually DER encoded "ECC_CMS_SharedInfo" structure
    */
  def apply(hashFunction: String, Zbuffer: ArrayBuffer, Counter: Double, SharedInfo: ArrayBuffer): js.Thenable[Anon_Counter] = js.native
}

