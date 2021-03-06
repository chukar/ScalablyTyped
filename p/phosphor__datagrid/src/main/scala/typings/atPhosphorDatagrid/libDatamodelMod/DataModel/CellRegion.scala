package typings.atPhosphorDatagrid.libDatamodelMod.DataModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the data model cell regions.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atPhosphorDatagrid.atPhosphorDatagridStrings.body
  - typings.atPhosphorDatagrid.atPhosphorDatagridStrings.`row-header`
  - typings.atPhosphorDatagrid.atPhosphorDatagridStrings.`column-header`
  - typings.atPhosphorDatagrid.atPhosphorDatagridStrings.`corner-header`
*/
trait CellRegion extends js.Object

object CellRegion {
  @scala.inline
  def body: typings.atPhosphorDatagrid.atPhosphorDatagridStrings.body = this.cast("body")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `column-header`: typings.atPhosphorDatagrid.atPhosphorDatagridStrings.`column-header` = this.cast("column-header")
  @scala.inline
  def `corner-header`: typings.atPhosphorDatagrid.atPhosphorDatagridStrings.`corner-header` = this.cast("corner-header")
  @scala.inline
  def `row-header`: typings.atPhosphorDatagrid.atPhosphorDatagridStrings.`row-header` = this.cast("row-header")
}

