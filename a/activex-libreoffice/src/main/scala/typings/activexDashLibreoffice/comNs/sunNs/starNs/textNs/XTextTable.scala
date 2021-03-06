package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.XCell
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.XTableColumns
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.XTableRows
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * manages a text table.
  * @see com.sun.star.text.TextTable
  * @see com.sun.star.text.Cell
  */
trait XTextTable extends XTextContent {
  /** @returns the names of all cells of this text table. */
  val CellNames: SafeArray[String]
  /**
    * @returns the access object for the text table columns.
    * @see com.sun.star.table.XTableColumns
    */
  val Columns: XTableColumns
  /**
    * @returns the access object for the text table rows.
    * @see com.sun.star.table.XTableRows
    */
  val Rows: XTableRows
  /**
    * creates a text table cursor and returns the {@link XTextTableCursor} interface.
    *
    * Initially the cursor is positioned in the cell with the specified name.
    * @see com.sun.star.text.TextTableCursor
    */
  def createCursorByCellName(aCellName: String): XTextTableCursor
  /**
    * @param aCellName is a concatenation of the alphanumeric column name and the index of the row.  Example: The cell in the 4th column and third row has the
    * @returns the {@link com.sun.star.table.XCell} interface of the cell with the specified name.
    * @see com.sun.star.table.Cell
    * @see com.sun.star.table.XCell
    */
  def getCellByName(aCellName: String): XCell
  /** @returns the names of all cells of this text table. */
  def getCellNames(): SafeArray[String]
  /**
    * @returns the access object for the text table columns.
    * @see com.sun.star.table.XTableColumns
    */
  def getColumns(): XTableColumns
  /**
    * @returns the access object for the text table rows.
    * @see com.sun.star.table.XTableRows
    */
  def getRows(): XTableRows
  /**
    * determines the numbers of rows and columns of the text table.
    *
    * This method must be called after the object is created and before the object is insert or attached elsewhere.
    */
  def initialize(nRows: Double, nColumns: Double): Unit
}

object XTextTable {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    CellNames: SafeArray[String],
    Columns: XTableColumns,
    Rows: XTableRows,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attach: XTextRange => Unit,
    createCursorByCellName: String => XTextTableCursor,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getCellByName: String => XCell,
    getCellNames: () => SafeArray[String],
    getColumns: () => XTableColumns,
    getRows: () => XTableRows,
    initialize: (Double, Double) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): XTextTable = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, CellNames = CellNames, Columns = Columns, Rows = Rows, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), createCursorByCellName = js.Any.fromFunction1(createCursorByCellName), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getCellByName = js.Any.fromFunction1(getCellByName), getCellNames = js.Any.fromFunction0(getCellNames), getColumns = js.Any.fromFunction0(getColumns), getRows = js.Any.fromFunction0(getRows), initialize = js.Any.fromFunction2(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[XTextTable]
  }
}

