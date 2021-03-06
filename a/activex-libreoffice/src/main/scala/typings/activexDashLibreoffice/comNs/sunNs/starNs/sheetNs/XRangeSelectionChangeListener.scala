package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows notification when the selected range is changed.
  * @see com.sun.star.sheet.XRangeSelection
  */
trait XRangeSelectionChangeListener extends XEventListener {
  /** is called when the selected range is changed while range selection is active. */
  def descriptorChanged(aEvent: RangeSelectionEvent): Unit
}

object XRangeSelectionChangeListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    descriptorChanged: RangeSelectionEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XRangeSelectionChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), descriptorChanged = js.Any.fromFunction1(descriptorChanged), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XRangeSelectionChangeListener]
  }
}

