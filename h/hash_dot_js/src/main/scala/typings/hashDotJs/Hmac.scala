package typings.hashDotJs

import typings.hashDotJs.hashDotJsNumbers.`160`
import typings.hashDotJs.hashDotJsNumbers.`512`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hmac extends MessageDigest[Hmac] {
  @JSName("blockSize")
  var blockSize_Hmac: `512` = js.native
  @JSName("outSize")
  var outSize_Hmac: `160` = js.native
}

