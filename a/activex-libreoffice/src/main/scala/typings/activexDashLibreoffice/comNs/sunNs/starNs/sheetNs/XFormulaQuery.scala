package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to query cells for dependencies in formulas.
  *
  * All methods return a collection of cell ranges.
  * @see com.sun.star.sheet.SheetRangesQuery
  * @see com.sun.star.sheet.SheetCellRanges
  */
trait XFormulaQuery extends XInterface {
  /**
    * queries all dependent formula cells.
    *
    * Dependent cells are cells containing formulas with references to the original cell.
    * @param bRecursive `FALSE` = queries cells dependent from the original range(s), `TRUE` = repeats query with all found cells (finds dependents of depende
    * @returns all dependent cells of any formula cell of the current cell range(s).
    */
  def queryDependents(bRecursive: Boolean): XSheetCellRanges
  /**
    * queries all precedent cells.
    *
    * Precedent cells are cells which are referenced from a formula cell.
    * @param bRecursive `FALSE` = queries precedent cells of the original range(s), `TRUE` = repeats query with all found cells (finds precedents of precedent
    * @returns all precedent cells of any formula cell of the current cell range(s).
    */
  def queryPrecedents(bRecursive: Boolean): XSheetCellRanges
}

object XFormulaQuery {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryDependents: Boolean => XSheetCellRanges,
    queryInterface: `type` => js.Any,
    queryPrecedents: Boolean => XSheetCellRanges,
    release: () => Unit
  ): XFormulaQuery = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryDependents = js.Any.fromFunction1(queryDependents), queryInterface = js.Any.fromFunction1(queryInterface), queryPrecedents = js.Any.fromFunction1(queryPrecedents), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFormulaQuery]
  }
}

