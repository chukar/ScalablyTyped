package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.XInteractionContinuation
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A continuation to return filter options from interaction helper.
  * @since OOo 1.1.2
  */
trait XInteractionFilterOptions extends XInteractionContinuation {
  /**
    * Get results from the continuation.
    * @returns the stored list of properties containing filter options.
    */
  var FilterOptions: SafeArray[PropertyValue]
  /**
    * Get results from the continuation.
    * @returns the stored list of properties containing filter options.
    */
  def getFilterOptions(): SafeArray[PropertyValue]
  /**
    * Store results to the continuation.
    * @param rProperties the list of properties containing filter options.
    */
  def setFilterOptions(rProperties: SeqEquiv[PropertyValue]): Unit
}

object XInteractionFilterOptions {
  @scala.inline
  def apply(
    FilterOptions: SafeArray[PropertyValue],
    acquire: () => Unit,
    getFilterOptions: () => SafeArray[PropertyValue],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    select: () => Unit,
    setFilterOptions: SeqEquiv[PropertyValue] => Unit
  ): XInteractionFilterOptions = {
    val __obj = js.Dynamic.literal(FilterOptions = FilterOptions, acquire = js.Any.fromFunction0(acquire), getFilterOptions = js.Any.fromFunction0(getFilterOptions), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), select = js.Any.fromFunction0(select), setFilterOptions = js.Any.fromFunction1(setFilterOptions))
  
    __obj.asInstanceOf[XInteractionFilterOptions]
  }
}

