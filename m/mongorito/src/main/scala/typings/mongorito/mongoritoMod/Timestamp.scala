package typings.mongorito.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongorito", "Timestamp")
@js.native
class Timestamp ()
  extends typings.mongodb.mongodbMod.Timestamp

/* static members */
@JSImport("mongorito", "Timestamp")
@js.native
object Timestamp extends js.Object {
  val MAX_VALUE: typings.bson.bsonMod.Timestamp = js.native
  val MIN_VALUE: typings.bson.bsonMod.Timestamp = js.native
  val NEG_ONE: typings.bson.bsonMod.Timestamp = js.native
  val ONE: typings.bson.bsonMod.Timestamp = js.native
  val ZERO: typings.bson.bsonMod.Timestamp = js.native
  /**
    * Returns a Timestamp for the given high and low bits. Each is assumed to use 32 bits.
    * @param lowBits The low 32-bits.
    * @param highBits The high 32-bits.
    */
  def fromBits(lowBits: Double, highBits: Double): typings.bson.bsonMod.Timestamp = js.native
  /** Returns a Timestamp represented by the given (32-bit) integer value */
  def fromInt(value: Double): typings.bson.bsonMod.Timestamp = js.native
  /** Returns a Timestamp representing the given number value, provided that it is a finite number. */
  def fromNumber(value: Double): typings.bson.bsonMod.Timestamp = js.native
  /**
    * Returns a Timestamp from the given string.
    * @param opt_radix The radix in which the text is written. {default:10}
    */
  def fromString(str: String): typings.bson.bsonMod.Timestamp = js.native
  def fromString(str: String, opt_radix: Double): typings.bson.bsonMod.Timestamp = js.native
}

