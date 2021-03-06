package typings.activexDashLibreoffice.comNs.sunNs.starNs.graphicNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.geometryNs.RealRectangle2D
import typings.activexDashLibreoffice.comNs.sunNs.starNs.renderingNs.XBitmap
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link XPrimitive2DRenderer} interface
  *
  * This interface allows to convert from a sequence of XPrimitive2Ds to a XBitmap
  */
trait XPrimitive2DRenderer extends XInterface {
  /**
    * return rasterized version of given {@link XPrimitive2D}
    * @param Primitive2DSequence The graphic content description
    * @param aViewInformationSequence The ViewInformation2D
    * @param DPI_X The horizontal resolution of the callers device in pixel per inch. This value is needed to calculate the correct dimensions of the graphic
    * @param DPI_Y The vertical resolution of the callers device in pixel per inch. This value is needed to calculate the correct dimensions of the graphic to
    * @param Range The range in 1/100th mm of the graphic to be rasterized
    * @param MaximumQuadraticPixels The maximum allowed number of pixels to be used to allow limiting the possible size of used pixels. The AspectRatio is pre
    */
  def rasterize(
    Primitive2DSequence: SeqEquiv[XPrimitive2D],
    aViewInformationSequence: SeqEquiv[PropertyValue],
    DPI_X: Double,
    DPI_Y: Double,
    Range: RealRectangle2D,
    MaximumQuadraticPixels: Double
  ): XBitmap
}

object XPrimitive2DRenderer {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    rasterize: (SeqEquiv[XPrimitive2D], SeqEquiv[PropertyValue], Double, Double, RealRectangle2D, Double) => XBitmap,
    release: () => Unit
  ): XPrimitive2DRenderer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), rasterize = js.Any.fromFunction6(rasterize), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XPrimitive2DRenderer]
  }
}

