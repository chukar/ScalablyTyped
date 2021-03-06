package typings.pvtsutils

import typings.pvtsutils.buildTypesConvertMod.BufferEncoding
import typings.std.ArrayBuffer
import typings.std.BufferSource
import typings.std.SharedArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pvtsutils", JSImport.Namespace)
@js.native
object pvtsutilsMod extends js.Object {
  @js.native
  class BufferSourceConverter ()
    extends typings.pvtsutils.buildTypesBufferUnderscoreSourceUnderscoreConverterMod.BufferSourceConverter
  
  @js.native
  class Convert ()
    extends typings.pvtsutils.buildTypesConvertMod.Convert
  
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
  def combine(buf: ArrayBuffer*): ArrayBuffer | SharedArrayBuffer = js.native
  def isEqual(bytes1: ArrayBuffer, bytes2: ArrayBuffer): Boolean = js.native
  /* static members */
  @js.native
  object BufferSourceConverter extends js.Object {
    def isBufferSource(data: js.Any): /* is std.BufferSource */ Boolean = js.native
    def toArrayBuffer(data: BufferSource): ArrayBuffer = js.native
    def toUint8Array(data: BufferSource): Uint8Array = js.native
  }
  
  /* static members */
  @js.native
  object Convert extends js.Object {
    /* protected */ def Base64Padding(base64: String): String = js.native
    def FromBase64(base64Text: String): ArrayBuffer | SharedArrayBuffer = js.native
    def FromBase64Url(base64url: String): ArrayBuffer | SharedArrayBuffer = js.native
    def FromBinary(text: String): ArrayBuffer | SharedArrayBuffer = js.native
    /**
      * Converts HEX string to buffer
      *
      * @static
      * @param {string} hexString
      * @returns {Uint8Array}
      *
      * @memberOf Convert
      */
    def FromHex(hexString: String): ArrayBuffer | SharedArrayBuffer = js.native
    def FromString(str: String): ArrayBuffer | SharedArrayBuffer = js.native
    def FromString(str: String, enc: BufferEncoding): ArrayBuffer | SharedArrayBuffer = js.native
    def FromUtf8String(text: String): ArrayBuffer | SharedArrayBuffer = js.native
    def ToBase64(buffer: BufferSource): String = js.native
    def ToBase64Url(data: BufferSource): String = js.native
    def ToBinary(buffer: BufferSource): String = js.native
    /**
      * Converts buffer to HEX string
      * @param  {BufferSource} buffer Incoming buffer
      * @returns string
      */
    def ToHex(buffer: BufferSource): String = js.native
    def ToString(buffer: BufferSource): String = js.native
    def ToString(buffer: BufferSource, enc: BufferEncoding): String = js.native
    def ToUtf8String(buffer: BufferSource): String = js.native
  }
  
}

