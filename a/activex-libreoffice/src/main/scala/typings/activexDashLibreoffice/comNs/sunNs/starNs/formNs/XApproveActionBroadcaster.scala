package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to probably veto actions to be performed on components.
  *
  * Usually, a component which supports the {@link XApproveActionBroadcaster} interface implements {@link com.sun.star.awt.XActionListener} as well.
  */
trait XApproveActionBroadcaster extends XInterface {
  /**
    * adds the specified listener to receive the {@link XApproveActionListener.approveAction()} event.
    * @param aListener the listener to be added
    */
  def addApproveActionListener(aListener: XApproveActionListener): Unit
  /**
    * removes the specified listener
    * @param aListener the listener to be removed
    */
  def removeApproveActionListener(aListener: XApproveActionListener): Unit
}

object XApproveActionBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addApproveActionListener: XApproveActionListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeApproveActionListener: XApproveActionListener => Unit
  ): XApproveActionBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addApproveActionListener = js.Any.fromFunction1(addApproveActionListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeApproveActionListener = js.Any.fromFunction1(removeApproveActionListener))
  
    __obj.asInstanceOf[XApproveActionBroadcaster]
  }
}

