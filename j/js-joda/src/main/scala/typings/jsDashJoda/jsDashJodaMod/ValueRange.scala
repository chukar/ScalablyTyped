package typings.jsDashJoda.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "ValueRange")
@js.native
class ValueRange protected () extends js.Object {
  def checkValidIntValue(value: Double, field: TemporalField): Double = js.native
  def checkValidValue(value: Double, field: TemporalField): js.Any = js.native
  def equals(other: js.Any): Boolean = js.native
  def isFixed(): Boolean = js.native
  def isIntValue(): Boolean = js.native
  def isValidIntValue(value: Double): Boolean = js.native
  def isValidValue(value: js.Any): Boolean = js.native
  def largestMinimum(): Double = js.native
  def maximum(): Double = js.native
  def minimum(): Double = js.native
  def smallestMaximum(): Double = js.native
}

/* static members */
@JSImport("js-joda", "ValueRange")
@js.native
object ValueRange extends js.Object {
  def of(minSmallest: Double, minLargest: Double, maxSmallest: Double, maxLargest: Double): ValueRange = js.native
  def of(min: Double, maxSmallest: Double, maxLargest: Double): ValueRange = js.native
  def of(min: Double, max: Double): ValueRange = js.native
}

