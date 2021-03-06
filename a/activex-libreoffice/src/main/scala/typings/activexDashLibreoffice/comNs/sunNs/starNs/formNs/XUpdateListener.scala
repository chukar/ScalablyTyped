package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * used to listen on objects which allow updating their data.
  *
  * In addition to just get notified when an data update happened, the listener has a chance to veto updates **before** they happen.
  * @see XUpdateBroadcaster
  */
trait XUpdateListener extends XEventListener {
  /**
    * is invoked to check the current data.
    *
    * For a given update process, if one of the XUpdateListeners vetoes the change, the update is canceled, and no further notification happens.
    * @param aEvent An event descriptor specifying the broadcaster of the change.
    * @returns `TRUE` when the update was approved, otherwise `FALSE` .
    */
  def approveUpdate(aEvent: EventObject): Boolean
  /**
    * is invoked when an object has finished processing the updates and the data has been successfully written.
    * @param aEvent A event descriptor specifying the broadcaster of the change.
    */
  def updated(aEvent: EventObject): Unit
}

object XUpdateListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    approveUpdate: EventObject => Boolean,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    updated: EventObject => Unit
  ): XUpdateListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveUpdate = js.Any.fromFunction1(approveUpdate), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updated = js.Any.fromFunction1(updated))
  
    __obj.asInstanceOf[XUpdateListener]
  }
}

