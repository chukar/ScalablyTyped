package typings.activexDashPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Sequences")
@js.native
class Sequences protected () extends js.Object {
  val Application: typings.activexDashPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Sequences_typekey")
  var PowerPointDotSequences_typekey: Sequences = js.native
  /** @param number [Index=-1] */
  def Add(): Sequence = js.native
  def Add(Index: Double): Sequence = js.native
  def Item(Index: Double): Sequence = js.native
}

