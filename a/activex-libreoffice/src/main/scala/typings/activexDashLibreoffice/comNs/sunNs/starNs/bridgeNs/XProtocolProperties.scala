package typings.activexDashLibreoffice.comNs.sunNs.starNs.bridgeNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link Bridge} internal interface, that allows to change protocol settings of the remote counter part.
  *
  * In general, this interface is implemented by the bridge itself. It must not be called from outside the bridge.
  *
  * INTERNAL INTERFACE, DO NOT USE IT ELSEWHERE!
  */
trait XProtocolProperties extends XInterface {
  /**
    * called to get a list of bridge internal properties. Which properties can be retrieved, is protocol dependent.
    *
    * The properties MUST NOT change between a requestChange and a commit change call.
    */
  val Properties: SafeArray[ProtocolProperty]
  /**
    * called to commit a protocol change.
    *
    * It is only allowed to call commitChange, if requestChange has been called previously and the return value was true. The new properties are valid after
    * the reply of commitChange has been received. Note, that this is difficult for the callee, because it must marshal the reply with the old settings.
    *
    * All properties not mentioned in the list are unchanged. Note that the bridge must be blocked for other threads, before commitChange is sent and
    * unblocked after the reply has been received. This blocks the bridge.
    * @throws InvalidProtocolChangeException when the remote counterpart could not change at least one of the properties. No property has been changed. request
    */
  def commitChange(newValues: SeqEquiv[ProtocolProperty]): Unit
  /**
    * called to get a list of bridge internal properties. Which properties can be retrieved, is protocol dependent.
    *
    * The properties MUST NOT change between a requestChange and a commit change call.
    */
  def getProperties(): SafeArray[ProtocolProperty]
  /**
    * called to initiate a protocol change.
    *
    * This method should always be called in the scope of the local bridge setting object, because the remote counter part may do such a call at the same
    * time (typically at startup time).
    * @param nRandomNumber In case both processes call requestChange at the same time, the caller with the higher nRandomNumber is allowed to call commitChange.
    * @returns 1, if the caller may ( and MUST !!!) call commitChange. 0, if the caller is not allowed to call commitChange. This can only happen, if the other
    */
  def requestChange(nRandomNumber: Double): Double
}

object XProtocolProperties {
  @scala.inline
  def apply(
    Properties: SafeArray[ProtocolProperty],
    acquire: () => Unit,
    commitChange: SeqEquiv[ProtocolProperty] => Unit,
    getProperties: () => SafeArray[ProtocolProperty],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    requestChange: Double => Double
  ): XProtocolProperties = {
    val __obj = js.Dynamic.literal(Properties = Properties, acquire = js.Any.fromFunction0(acquire), commitChange = js.Any.fromFunction1(commitChange), getProperties = js.Any.fromFunction0(getProperties), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), requestChange = js.Any.fromFunction1(requestChange))
  
    __obj.asInstanceOf[XProtocolProperties]
  }
}

