package typings.kdbxweb.kdbxwebMod

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "ProtectedValue")
@js.native
class ProtectedValue protected () extends js.Object {
  def this(value: ArrayBuffer, salt: ArrayBuffer) = this()
  def getBinary(): Uint8Array = js.native
  def getHash(): js.Promise[ArrayBuffer] = js.native
  def getText(): String = js.native
  def includes(str: String): Boolean = js.native
  def setSalt(newSalt: ArrayBuffer): Unit = js.native
}

/* static members */
@JSImport("kdbxweb", "ProtectedValue")
@js.native
object ProtectedValue extends js.Object {
  def fromBinary(binary: ArrayBuffer): ProtectedValue = js.native
  def fromString(str: String): ProtectedValue = js.native
}

