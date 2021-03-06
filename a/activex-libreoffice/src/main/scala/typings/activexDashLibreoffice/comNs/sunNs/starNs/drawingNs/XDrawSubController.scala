package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XFastPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs.XSelectionChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs.XSelectionSupplier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * View dependent part of the Draw and Impress controller.
  *
  * During the lifetime of an Impress application the {@link com.sun.star.drawing.DrawingDocumentDrawView} changes its sub controllers whenever the view
  * in the center pane is replaced by another one. The sub controller handles the things that are not common to all views, i.e. properties, the current
  * page/slide, and the selection.
  */
trait XDrawSubController
  extends XDrawView
     with XSelectionSupplier
     with XFastPropertySet

object XDrawSubController {
  @scala.inline
  def apply(
    CurrentPage: XDrawPage,
    Selection: js.Any,
    acquire: () => Unit,
    addSelectionChangeListener: XSelectionChangeListener => Unit,
    getCurrentPage: () => XDrawPage,
    getFastPropertyValue: Double => js.Any,
    getSelection: () => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeSelectionChangeListener: XSelectionChangeListener => Unit,
    select: js.Any => Boolean,
    setCurrentPage: XDrawPage => Unit,
    setFastPropertyValue: (Double, js.Any) => Unit
  ): XDrawSubController = {
    val __obj = js.Dynamic.literal(CurrentPage = CurrentPage, Selection = Selection, acquire = js.Any.fromFunction0(acquire), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), getCurrentPage = js.Any.fromFunction0(getCurrentPage), getFastPropertyValue = js.Any.fromFunction1(getFastPropertyValue), getSelection = js.Any.fromFunction0(getSelection), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), select = js.Any.fromFunction1(select), setCurrentPage = js.Any.fromFunction1(setCurrentPage), setFastPropertyValue = js.Any.fromFunction2(setFastPropertyValue))
  
    __obj.asInstanceOf[XDrawSubController]
  }
}

