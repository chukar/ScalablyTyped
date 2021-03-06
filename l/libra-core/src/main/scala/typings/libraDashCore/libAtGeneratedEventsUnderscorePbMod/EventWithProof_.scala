package typings.libraDashCore.libAtGeneratedEventsUnderscorePbMod

import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.libraDashCore.libAtGeneratedProofUnderscorePbMod.EventProof
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/events_pb", "EventWithProof")
@js.native
class EventWithProof_ () extends Message {
  def clearEvent(): Unit = js.native
  def clearProof(): Unit = js.native
  def getEvent(): js.UndefOr[Event] = js.native
  def getEventIndex(): String = js.native
  def getProof(): js.UndefOr[EventProof] = js.native
  def getTransactionVersion(): String = js.native
  def hasEvent(): Boolean = js.native
  def hasProof(): Boolean = js.native
  def setEvent(): Unit = js.native
  def setEvent(value: Event): Unit = js.native
  def setEventIndex(value: String): Unit = js.native
  def setProof(): Unit = js.native
  def setProof(value: EventProof): Unit = js.native
  def setTransactionVersion(value: String): Unit = js.native
}

