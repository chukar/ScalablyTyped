package typings.tabulatorDashTables.Tabulator

import typings.std.HTMLElement
import typings.tabulatorDashTables.tabulatorDashTablesBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupComponent extends js.Object {
  /** The getElement function returns the DOM node for the group header. */
  def getElement(): HTMLElement
  /** Returns the string of the field that all rows in this group have been grouped by. (if a function is used to group the rows rather than a field, this function will return false) */
  def getField(): String
  /** The getKey function returns the unique key that is shared between all rows in this group. */
  def getKey(): js.Any
  /** The getParentGroup function returns the GroupComponent for the parent group of this group. if no parent exists, this function will return false */
  def getParentGroup(): GroupComponent | `false`
  /** The getRows function returns an array of RowComponent objects, one for each row in the group */
  def getRows(): js.Array[RowComponent]
  /** The getSubGroups function returns an array of GroupComponent objects, one for each sub group of this group. */
  def getSubGroups(): js.Array[GroupComponent]
  /** The getTable function returns the Tabulator object for the table containing the group */
  def getTable(): typings.tabulatorDashTables.Tabulator
  /**  The getVisibility function returns a boolean to show if the group is visible, a value of true means it is visible.*/
  def getVisibility(): Boolean
  /** The hide function hides the group if it is visible. */
  def hide(): Unit
  /** The show function shows the group if it is hidden. */
  def show(): Unit
  /** The toggle function toggles the visibility of the group, switching between hidden and visible. */
  def toggle(): Unit
}

object GroupComponent {
  @scala.inline
  def apply(
    getElement: () => HTMLElement,
    getField: () => String,
    getKey: () => js.Any,
    getParentGroup: () => GroupComponent | `false`,
    getRows: () => js.Array[RowComponent],
    getSubGroups: () => js.Array[GroupComponent],
    getTable: () => typings.tabulatorDashTables.Tabulator,
    getVisibility: () => Boolean,
    hide: () => Unit,
    show: () => Unit,
    toggle: () => Unit
  ): GroupComponent = {
    val __obj = js.Dynamic.literal(getElement = js.Any.fromFunction0(getElement), getField = js.Any.fromFunction0(getField), getKey = js.Any.fromFunction0(getKey), getParentGroup = js.Any.fromFunction0(getParentGroup), getRows = js.Any.fromFunction0(getRows), getSubGroups = js.Any.fromFunction0(getSubGroups), getTable = js.Any.fromFunction0(getTable), getVisibility = js.Any.fromFunction0(getVisibility), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle))
  
    __obj.asInstanceOf[GroupComponent]
  }
}

