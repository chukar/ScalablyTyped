package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access and modify spreadsheet groups. Groups are an association between an interval of contiguous
  * rows or columns that can be expanded or collapsed as a unit to hide/show the rows or columns.
  * Each group has a control toggle on the row or column directly before or after the group
  * (depending on settings) that can expand or collapse the group as a whole.
  *
  * The depth of a group refers to the nested position of the group and how many larger
  * groups contain the group. The collapsed state of a group refers to whether the group
  * should remain collapsed or expanded after a parent group has been expanded. Additionally, at the
  * time that a group is collapsed or expanded, the rows or columns within the group are hidden or
  * set visible, though individual rows or columns can be hidden or set visible irrespective of the
  * collapsed state.
  */
trait Group extends js.Object {
  def collapse(): Group
  def expand(): Group
  def getControlIndex(): Integer
  def getDepth(): Integer
  def getRange(): Range
  def isCollapsed(): Boolean
  def remove(): Unit
}

object Group {
  @scala.inline
  def apply(
    collapse: () => Group,
    expand: () => Group,
    getControlIndex: () => Integer,
    getDepth: () => Integer,
    getRange: () => Range,
    isCollapsed: () => Boolean,
    remove: () => Unit
  ): Group = {
    val __obj = js.Dynamic.literal(collapse = js.Any.fromFunction0(collapse), expand = js.Any.fromFunction0(expand), getControlIndex = js.Any.fromFunction0(getControlIndex), getDepth = js.Any.fromFunction0(getDepth), getRange = js.Any.fromFunction0(getRange), isCollapsed = js.Any.fromFunction0(isCollapsed), remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[Group]
  }
}

