package typings.xterm.xtermMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a line in the terminal's buffer.
  */
@js.native
trait IBufferLine extends js.Object {
  /**
    * Whether the line is wrapped from the previous line.
    */
  val isWrapped: Boolean = js.native
  /**
    * Gets a cell from the line, or undefined if the line index does not exist.
    *
    * Note that the result of this function should be used immediately after
    * calling as when the terminal updates it could lead to unexpected
    * behavior.
    *
    * @param x The character index to get.
    */
  def getCell(x: Double): js.UndefOr[IBufferCell] = js.native
  /**
    * Gets the line as a string. Note that this is gets only the string for the
    * line, not taking isWrapped into account.
    *
    * @param trimRight Whether to trim any whitespace at the right of the line.
    * @param startColumn The column to start from (inclusive).
    * @param endColumn The column to end at (exclusive).
    */
  def translateToString(): String = js.native
  def translateToString(trimRight: Boolean): String = js.native
  def translateToString(trimRight: Boolean, startColumn: Double): String = js.native
  def translateToString(trimRight: Boolean, startColumn: Double, endColumn: Double): String = js.native
}

