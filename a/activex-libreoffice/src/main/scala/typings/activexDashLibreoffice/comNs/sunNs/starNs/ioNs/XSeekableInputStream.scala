package typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface can be used to represent a seekable input stream. */
trait XSeekableInputStream
  extends XInputStream
     with XSeekable

object XSeekableInputStream {
  @scala.inline
  def apply(
    Length: Double,
    Position: Double,
    acquire: () => Unit,
    available: () => Double,
    closeInput: () => Unit,
    getLength: () => Double,
    getPosition: () => Double,
    queryInterface: `type` => js.Any,
    readBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readSomeBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    release: () => Unit,
    seek: Double => Unit,
    skipBytes: Double => Unit
  ): XSeekableInputStream = {
    val __obj = js.Dynamic.literal(Length = Length, Position = Position, acquire = js.Any.fromFunction0(acquire), available = js.Any.fromFunction0(available), closeInput = js.Any.fromFunction0(closeInput), getLength = js.Any.fromFunction0(getLength), getPosition = js.Any.fromFunction0(getPosition), queryInterface = js.Any.fromFunction1(queryInterface), readBytes = js.Any.fromFunction2(readBytes), readSomeBytes = js.Any.fromFunction2(readSomeBytes), release = js.Any.fromFunction0(release), seek = js.Any.fromFunction1(seek), skipBytes = js.Any.fromFunction1(skipBytes))
  
    __obj.asInstanceOf[XSeekableInputStream]
  }
}

