package typings.reactabularDashTable

import typings.react.reactMod.ReactInstance
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CellProps extends js.Object {
  var cell: js.UndefOr[String | (js.Function1[/* props */ js.Any, Element | ReactInstance])] = js.undefined
  var row: js.UndefOr[
    String | (js.Function2[/* props */ js.Any, /* rowData */ js.Any, Element]) | (js.Function1[/* props */ js.Any, ReactInstance])
  ] = js.undefined
  var wrapper: js.UndefOr[String | (js.Function1[/* props */ js.Any, Element | ReactInstance])] = js.undefined
}

object Anon_CellProps {
  @scala.inline
  def apply(
    cell: String | (js.Function1[/* props */ js.Any, Element | ReactInstance]) = null,
    row: String | (js.Function2[/* props */ js.Any, /* rowData */ js.Any, Element]) | (js.Function1[/* props */ js.Any, ReactInstance]) = null,
    wrapper: String | (js.Function1[/* props */ js.Any, Element | ReactInstance]) = null
  ): Anon_CellProps = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CellProps]
  }
}

