package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.URL
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.2 */
trait XAppDispatchProvider
  extends XDispatchInformationProvider
     with XDispatchProvider

object XAppDispatchProvider {
  @scala.inline
  def apply(
    SupportedCommandGroups: SafeArray[Double],
    acquire: () => Unit,
    getConfigurableDispatchInformation: Double => SafeArray[DispatchInformation],
    getSupportedCommandGroups: () => SafeArray[Double],
    queryDispatch: (URL, String, Double) => XDispatch,
    queryDispatches: SeqEquiv[DispatchDescriptor] => SafeArray[XDispatch],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAppDispatchProvider = {
    val __obj = js.Dynamic.literal(SupportedCommandGroups = SupportedCommandGroups, acquire = js.Any.fromFunction0(acquire), getConfigurableDispatchInformation = js.Any.fromFunction1(getConfigurableDispatchInformation), getSupportedCommandGroups = js.Any.fromFunction0(getSupportedCommandGroups), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAppDispatchProvider]
  }
}

