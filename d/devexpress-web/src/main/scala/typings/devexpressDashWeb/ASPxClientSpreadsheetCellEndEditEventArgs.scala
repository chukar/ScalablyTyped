package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSpreadsheet.CellEndEdit event.
  */
@JSGlobal("ASPxClientSpreadsheetCellEndEditEventArgs")
@js.native
class ASPxClientSpreadsheetCellEndEditEventArgs protected () extends ASPxClientSpreadsheetCellBeginEditEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSpreadsheetCellEndEditEventArgs object. For internal use only.
    * @param columnIndex Gets the active cell's column index.
    * @param rowIndex Gets the active cell's row index.
    * @param formula Gets the active cell's formula.
    * @param value Gets the active cell's current value.
    * @param sheetName Gets the current worksheet's name.
    * @param editorText Gets or sets the text stored within an active cell's editor.
    */
  def this(
    columnIndex: Double,
    rowIndex: Double,
    formula: String,
    value: String,
    sheetName: String,
    editorText: String
  ) = this()
  /**
    * Gets or sets the text stored within the active cell's editor.
    */
  var editorText: String = js.native
}

