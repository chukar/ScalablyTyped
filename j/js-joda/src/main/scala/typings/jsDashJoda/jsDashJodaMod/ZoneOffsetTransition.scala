package typings.jsDashJoda.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "ZoneOffsetTransition")
@js.native
class ZoneOffsetTransition protected () extends js.Object {
  def compareTo(transition: ZoneOffsetTransition): Double = js.native
  def dateTimeAfter(): LocalDateTime = js.native
  def dateTimeBefore(): LocalDateTime = js.native
  def duration(): Duration = js.native
  def durationSeconds(): Double = js.native
  def equals(other: js.Any): Boolean = js.native
  def instant(): Instant = js.native
  def isGap(): Boolean = js.native
  def isOverlap(): Boolean = js.native
  def isValidOffset(offset: ZoneOffset): Boolean = js.native
  def offsetAfter(): ZoneOffset = js.native
  def offsetBefore(): ZoneOffset = js.native
  def toEpochSecond(): Double = js.native
  def validOffsets(): js.Array[ZoneOffset] = js.native
}

/* static members */
@JSImport("js-joda", "ZoneOffsetTransition")
@js.native
object ZoneOffsetTransition extends js.Object {
  def of(transition: LocalDateTime, offsetBefore: ZoneOffset, offsetAfter: ZoneOffset): ZoneOffsetTransition = js.native
}

