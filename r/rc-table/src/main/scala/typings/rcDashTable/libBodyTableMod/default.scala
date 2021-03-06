package typings.rcDashTable.libBodyTableMod

import typings.propDashTypes.propDashTypesMod.Requireable
import typings.rcDashTable.Anon_Table
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib/BodyTable", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[ValueType](props: BodyTableProps[ValueType], hasTable: Anon_Table): Element = js.native
  @js.native
  object contextTypes extends js.Object {
    var table: Requireable[_] = js.native
  }
  
}

