package typings.activexDashWia.WIA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Formats object is a collection of supported FormatIDs that you can use when calling Transfer on an Item object or ShowTransfer on a CommonDialog
  * object for this Item.
  */
@js.native
trait Formats extends js.Object {
  /** Returns the number of members in the collection */
  val Count: Double = js.native
  /** Returns the specified item in the collection by position */
  def apply(Index: Double): String = js.native
  /** Returns the specified item in the collection by position */
  def Item(Index: Double): String = js.native
}

