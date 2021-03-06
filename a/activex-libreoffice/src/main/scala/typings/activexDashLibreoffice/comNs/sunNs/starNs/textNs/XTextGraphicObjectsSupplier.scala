package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the collection of all embedded and linked graphics within this context (i.e. within this document). */
trait XTextGraphicObjectsSupplier extends XInterface {
  /** @returns the collection of graphic objects in this object (document). */
  val GraphicObjects: XNameAccess
  /** @returns the collection of graphic objects in this object (document). */
  def getGraphicObjects(): XNameAccess
}

object XTextGraphicObjectsSupplier {
  @scala.inline
  def apply(
    GraphicObjects: XNameAccess,
    acquire: () => Unit,
    getGraphicObjects: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextGraphicObjectsSupplier = {
    val __obj = js.Dynamic.literal(GraphicObjects = GraphicObjects, acquire = js.Any.fromFunction0(acquire), getGraphicObjects = js.Any.fromFunction0(getGraphicObjects), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTextGraphicObjectsSupplier]
  }
}

