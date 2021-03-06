package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to move paragraph by paragraph. */
trait XParagraphCursor extends XTextCursor {
  /**
    * moves the cursor to the end of the current paragraph.
    * @returns `TRUE` if the cursor is now at the end of a paragraph, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoEndOfParagraph(bExpand: Boolean): Boolean
  /**
    * moves the cursor to the next paragraph.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoNextParagraph(bExpand: Boolean): Boolean
  /**
    * moves the cursor to the previous paragraph.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoPreviousParagraph(bExpand: Boolean): Boolean
  /**
    * moves the cursor to the start of the current paragraph.
    * @returns `TRUE` if the cursor is now at the start of a paragraph, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoStartOfParagraph(bExpand: Boolean): Boolean
  /** determines if the cursor is positioned at the end of a paragraph. */
  def isEndOfParagraph(): Boolean
  /** determines if the cursor is positioned at the start of a paragraph. */
  def isStartOfParagraph(): Boolean
}

object XParagraphCursor {
  @scala.inline
  def apply(
    End: XTextRange,
    Start: XTextRange,
    String: String,
    acquire: () => Unit,
    collapseToEnd: () => Unit,
    collapseToStart: () => Unit,
    getEnd: () => XTextRange,
    getStart: () => XTextRange,
    getString: () => String,
    getText: () => XText,
    goLeft: (Double, Boolean) => Boolean,
    goRight: (Double, Boolean) => Boolean,
    gotoEnd: Boolean => Unit,
    gotoEndOfParagraph: Boolean => Boolean,
    gotoNextParagraph: Boolean => Boolean,
    gotoPreviousParagraph: Boolean => Boolean,
    gotoRange: (XTextRange, Boolean) => Unit,
    gotoStart: Boolean => Unit,
    gotoStartOfParagraph: Boolean => Boolean,
    isCollapsed: () => Boolean,
    isEndOfParagraph: () => Boolean,
    isStartOfParagraph: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setString: String => Unit
  ): XParagraphCursor = {
    val __obj = js.Dynamic.literal(End = End, Start = Start, String = String, acquire = js.Any.fromFunction0(acquire), collapseToEnd = js.Any.fromFunction0(collapseToEnd), collapseToStart = js.Any.fromFunction0(collapseToStart), getEnd = js.Any.fromFunction0(getEnd), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), goLeft = js.Any.fromFunction2(goLeft), goRight = js.Any.fromFunction2(goRight), gotoEnd = js.Any.fromFunction1(gotoEnd), gotoEndOfParagraph = js.Any.fromFunction1(gotoEndOfParagraph), gotoNextParagraph = js.Any.fromFunction1(gotoNextParagraph), gotoPreviousParagraph = js.Any.fromFunction1(gotoPreviousParagraph), gotoRange = js.Any.fromFunction2(gotoRange), gotoStart = js.Any.fromFunction1(gotoStart), gotoStartOfParagraph = js.Any.fromFunction1(gotoStartOfParagraph), isCollapsed = js.Any.fromFunction0(isCollapsed), isEndOfParagraph = js.Any.fromFunction0(isEndOfParagraph), isStartOfParagraph = js.Any.fromFunction0(isStartOfParagraph), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setString = js.Any.fromFunction1(setString))
  
    __obj.asInstanceOf[XParagraphCursor]
  }
}

