package typings.reactDashVirtualized

import typings.react.reactMod.ReactElement
import typings.react.reactMod.StatelessComponent
import typings.reactDashVirtualized.distEsTableMod.MultiSortOptions
import typings.reactDashVirtualized.distEsTableMod.MultiSortReturn
import typings.reactDashVirtualized.distEsTableMod.SortDirectionStatic
import typings.reactDashVirtualized.distEsTableMod.TableCellDataGetter
import typings.reactDashVirtualized.distEsTableMod.TableCellRenderer
import typings.reactDashVirtualized.distEsTableMod.TableHeaderRowRenderer
import typings.reactDashVirtualized.distEsTableMod.TableRowRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/commonjs/Table", JSImport.Namespace)
@js.native
object distCommonjsTableMod extends js.Object {
  @js.native
  class Column ()
    extends typings.reactDashVirtualized.distEsTableMod.Column
  
  @js.native
  class Table ()
    extends typings.reactDashVirtualized.distEsTableMod.Table
  
  val SortDirection: SortDirectionStatic = js.native
  val SortIndicator: StatelessComponent[Anon_SortDirection] = js.native
  val defaultCellDataGetter: TableCellDataGetter = js.native
  val defaultCellRenderer: TableCellRenderer = js.native
  val defaultHeaderRowRenderer: TableHeaderRowRenderer = js.native
  val defaultRowRenderer: TableRowRenderer = js.native
  def createMultiSort(sortCallback: js.Function1[/* params */ Anon_SortBy, Unit]): MultiSortReturn = js.native
  def createMultiSort(sortCallback: js.Function1[/* params */ Anon_SortBy, Unit], options: MultiSortOptions): MultiSortReturn = js.native
  def defaultHeaderRenderer(): js.Array[ReactElement] = js.native
  /* static members */
  @js.native
  object Column extends js.Object {
    var defaultProps: Anon_01CellDataGetter = js.native
    var propTypes: Anon_ArialabelCellDataGetter = js.native
  }
  
  /* static members */
  @js.native
  object Table extends js.Object {
    var defaultProps: Anon_0110 = js.native
    var propTypes: Anon_ArialabelAutoHeight = js.native
  }
  
}

