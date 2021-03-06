package typings.tablesorter

import typings.tablesorter.filteringFormatterOptionsSelect2OptionsMod.Select2Options
import typings.tablesorter.tablesorterMod._Global_.HTMLElement
import typings.tablesorter.tablesorterMod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Filtering/Formatter/Select2Formatter", JSImport.Namespace)
@js.native
object filteringFormatterSelect2FormatterMod extends js.Object {
  @js.native
  trait Select2Formatter extends js.Object {
    /**
      * Creates a select2-control.
      *
      * @param cell
      * The jQuery-object of the cell the control is added to.
      *
      * @param index
      * The column-index of the cell the control is added to.
      *
      * @param options
      * The options for the control-creation.
      *
      * @return
      * The jQuery-object of the created control.
      */
    def select2(cell: JQuery[HTMLElement], index: Double): JQuery[HTMLElement] = js.native
    def select2(cell: JQuery[HTMLElement], index: Double, options: Select2Options): JQuery[HTMLElement] = js.native
  }
  
}

