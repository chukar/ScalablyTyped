package typings.activexDashLibreoffice.comNs.sunNs.starNs.renderingNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.geometryNs.IntegerSize2D
import typings.activexDashLibreoffice.comNs.sunNs.starNs.geometryNs.RealSize2D
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a generic interface to a bitmap.
  *
  * This interface contains the generic functionality to be used on every {@link XCanvas} bitmap object. More format-specific methods can be found at the
  * {@link XIntegerBitmap} , {@link XIeeeDoubleBitmap} , {@link XIeeeFloatBitmap} and {@link XHalfFloatBitmap} interfaces.
  * @since OOo 2.0
  */
trait XBitmap extends XInterface {
  /**
    * Query the size of the bitmap.
    *
    * This method queries the bitmap size in pixel.
    * @returns the bitmap size in pixel.
    */
  val Size: IntegerSize2D
  /**
    * Query a scaled copy of the original bitmap.
    * @param newSize Requested size of the new bitmap. Both of the two size components must be greater than zero.
    * @param beFast When set to true, this parameter advises getScaledBitmap to use the fastest available algorithm to scale the bitmap, which might cause vis
    * @returns the new scaled bitmap.
    * @throws com::sun::star::lang::IllegalArgumentException if the size components are outside the specified range.
    * @throws VolatileContentDestroyedException if the contents of a volatile bitmap have been destroyed, and thus cannot be read to generate the scaled bitmap.
    */
  def getScaledBitmap(newSize: RealSize2D, beFast: Boolean): XBitmap
  /**
    * Query the size of the bitmap.
    *
    * This method queries the bitmap size in pixel.
    * @returns the bitmap size in pixel.
    */
  def getSize(): IntegerSize2D
  /**
    * Query transparency status of the bitmap.
    *
    * The method checks, whether the bitmap contains any alpha information. The same information is also available at the {@link XColorSpace} associated
    * with this bitmap, though much easier to access here (the color space then has a component flagged {@link ColorComponentTag.ALPHA} ).
    * @returns `TRUE` , if the bitmap has alpha data, or `FALSE` if not.
    */
  def hasAlpha(): Boolean
}

object XBitmap {
  @scala.inline
  def apply(
    Size: IntegerSize2D,
    acquire: () => Unit,
    getScaledBitmap: (RealSize2D, Boolean) => XBitmap,
    getSize: () => IntegerSize2D,
    hasAlpha: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XBitmap = {
    val __obj = js.Dynamic.literal(Size = Size, acquire = js.Any.fromFunction0(acquire), getScaledBitmap = js.Any.fromFunction2(getScaledBitmap), getSize = js.Any.fromFunction0(getSize), hasAlpha = js.Any.fromFunction0(hasAlpha), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XBitmap]
  }
}

