package typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.XEventBroadcaster
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XCloseListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XCloseable
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents common functionality for embedded objects. */
trait XEmbeddedObject
  extends XCloseable
     with XVisualObject
     with XClassifiedObject
     with XComponentSupplier
     with XStateChangeBroadcaster
     with XEventBroadcaster {
  /**
    * provides access to the internal link to the container client.
    * @returns a reference to related container client if any is set
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    */
  var ClientSite: XEmbeddedClient
  /**
    * returns the current state of the object.
    * @returns the current state of the object
    * @throws com::sun::star::embed::WrongStateException in case object is in invalid state
    */
  val CurrentState: Double
  /**
    * returns supported states for the object.
    * @returns the sequence of states the object can be set to
    * @throws com::sun::star::embed::NeedsRunnignStateException means that the object is in loaded state now and can be switched to running state, other possib
    * @throws com::sun::star::embed::WrongStateException in case object is in invalid state
    */
  val ReachableStates: SafeArray[Double]
  /**
    * returns supported verbs for the object.
    * @returns the sequence of verbs the object supports
    * @throws com::sun::star::embed::NeedsRunnignStateException means that the object is in loaded state now and can be switched to running state, acceptable v
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state to call the function
    */
  val SupportedVerbs: SafeArray[VerbDescriptor]
  /**
    * changes the state of the object to the requested one.
    * @param nNewState specifies the new state, can take values from the constant set {@link com.sun.star.embed.EmbedStates}
    * @throws com::sun::star::embed::UnreachableStateException the specified state can not be reached
    * @throws com::sun::star::embed::WrongStateException in case object is in invalid state
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def changeState(nNewState: Double): Unit
  /**
    * lets object perform an action referenced by nVerbID.
    * @param nVerbID specifies an action to perform, can take values from {@link EmbedVerbs}
    * @throws com::sun::star::lang::IllegalArgumentException the verb is not supported
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state to call the function
    * @throws com::sun::star::embed::UnreachableStateException the state, required by the verb, can not be reached
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def doVerb(nVerbID: Double): Unit
  /**
    * provides access to the internal link to the container client.
    * @returns a reference to related container client if any is set
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    */
  def getClientSite(): XEmbeddedClient
  /**
    * returns the current state of the object.
    * @returns the current state of the object
    * @throws com::sun::star::embed::WrongStateException in case object is in invalid state
    */
  def getCurrentState(): Double
  /**
    * returns supported states for the object.
    * @returns the sequence of states the object can be set to
    * @throws com::sun::star::embed::NeedsRunnignStateException means that the object is in loaded state now and can be switched to running state, other possib
    * @throws com::sun::star::embed::WrongStateException in case object is in invalid state
    */
  def getReachableStates(): SafeArray[Double]
  /**
    * retrieves the status of the object.
    * @param nAspect the aspect specifying the form of object representation
    * @returns the value specifying the status of the object for specified aspect can take values from {@link EmbedMisc} constant set
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    */
  def getStatus(nAspect: Double): Double
  /**
    * returns supported verbs for the object.
    * @returns the sequence of verbs the object supports
    * @throws com::sun::star::embed::NeedsRunnignStateException means that the object is in loaded state now and can be switched to running state, acceptable v
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state to call the function
    */
  def getSupportedVerbs(): SafeArray[VerbDescriptor]
  /**
    * sets a connection to the container's client.
    * @param xClient provides a reference to a client implementation
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    */
  def setClientSite(xClient: XEmbeddedClient): Unit
  /**
    * provides object with the name of container document.
    * @param sName name of the container document
    */
  def setContainerName(sName: String): Unit
  /**
    * specifies how often the object's representation should be updated.
    * @param nMode the new update mode, can take values from EmbeddedUpdateModes
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    */
  def setUpdateMode(nMode: Double): Unit
  /**
    * updates object's representations.
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state to call the function
    * @throws com::sun::star::uno::Exception in case problems detected
    */
  def update(): Unit
}

object XEmbeddedObject {
  @scala.inline
  def apply(
    ClassID: SafeArray[Double],
    ClassName: String,
    ClientSite: XEmbeddedClient,
    Component: XCloseable,
    CurrentState: Double,
    ReachableStates: SafeArray[Double],
    SupportedVerbs: SafeArray[VerbDescriptor],
    acquire: () => Unit,
    addCloseListener: XCloseListener => Unit,
    addEventListener: XEventListener => Unit,
    addStateChangeListener: XStateChangeListener => Unit,
    changeState: Double => Unit,
    close: Boolean => Unit,
    doVerb: Double => Unit,
    getClassID: () => SafeArray[Double],
    getClassName: () => String,
    getClientSite: () => XEmbeddedClient,
    getComponent: () => XCloseable,
    getCurrentState: () => Double,
    getMapUnit: Double => Double,
    getPreferredVisualRepresentation: Double => VisualRepresentation,
    getReachableStates: () => SafeArray[Double],
    getStatus: Double => Double,
    getSupportedVerbs: () => SafeArray[VerbDescriptor],
    getVisualAreaSize: Double => Size,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeCloseListener: XCloseListener => Unit,
    removeEventListener: XEventListener => Unit,
    removeStateChangeListener: XStateChangeListener => Unit,
    setClassInfo: (SeqEquiv[Double], String) => Unit,
    setClientSite: XEmbeddedClient => Unit,
    setContainerName: String => Unit,
    setUpdateMode: Double => Unit,
    setVisualAreaSize: (Double, Size) => Unit,
    update: () => Unit
  ): XEmbeddedObject = {
    val __obj = js.Dynamic.literal(ClassID = ClassID, ClassName = ClassName, ClientSite = ClientSite, Component = Component, CurrentState = CurrentState, ReachableStates = ReachableStates, SupportedVerbs = SupportedVerbs, acquire = js.Any.fromFunction0(acquire), addCloseListener = js.Any.fromFunction1(addCloseListener), addEventListener = js.Any.fromFunction1(addEventListener), addStateChangeListener = js.Any.fromFunction1(addStateChangeListener), changeState = js.Any.fromFunction1(changeState), close = js.Any.fromFunction1(close), doVerb = js.Any.fromFunction1(doVerb), getClassID = js.Any.fromFunction0(getClassID), getClassName = js.Any.fromFunction0(getClassName), getClientSite = js.Any.fromFunction0(getClientSite), getComponent = js.Any.fromFunction0(getComponent), getCurrentState = js.Any.fromFunction0(getCurrentState), getMapUnit = js.Any.fromFunction1(getMapUnit), getPreferredVisualRepresentation = js.Any.fromFunction1(getPreferredVisualRepresentation), getReachableStates = js.Any.fromFunction0(getReachableStates), getStatus = js.Any.fromFunction1(getStatus), getSupportedVerbs = js.Any.fromFunction0(getSupportedVerbs), getVisualAreaSize = js.Any.fromFunction1(getVisualAreaSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeCloseListener = js.Any.fromFunction1(removeCloseListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removeStateChangeListener = js.Any.fromFunction1(removeStateChangeListener), setClassInfo = js.Any.fromFunction2(setClassInfo), setClientSite = js.Any.fromFunction1(setClientSite), setContainerName = js.Any.fromFunction1(setContainerName), setUpdateMode = js.Any.fromFunction1(setUpdateMode), setVisualAreaSize = js.Any.fromFunction2(setVisualAreaSize), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[XEmbeddedObject]
  }
}

