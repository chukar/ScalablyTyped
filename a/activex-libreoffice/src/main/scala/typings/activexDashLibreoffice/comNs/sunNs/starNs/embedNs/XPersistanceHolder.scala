package typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to disconnect an object from its persistence. */
trait XPersistanceHolder extends XInterface {
  /**
    * connects the object to a persistence.
    * @param xStream a stream that specify the persistence
    * @throws com::sun::star::io::IOException in case of io problems
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def connectPersistance(xStream: XStream): Unit
  /**
    * disconnects the object from the persistence.
    * @throws com::sun::star::io::IOException in case of io problems
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def disconnectPersistence(): Unit
}

object XPersistanceHolder {
  @scala.inline
  def apply(
    acquire: () => Unit,
    connectPersistance: XStream => Unit,
    disconnectPersistence: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPersistanceHolder = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), connectPersistance = js.Any.fromFunction1(connectPersistance), disconnectPersistence = js.Any.fromFunction0(disconnectPersistence), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XPersistanceHolder]
  }
}

