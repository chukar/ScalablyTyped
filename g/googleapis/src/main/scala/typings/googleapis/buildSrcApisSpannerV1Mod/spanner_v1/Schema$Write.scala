package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Arguments to insert, update, insert_or_update, and replace operations.
  */
@js.native
trait Schema$Write extends js.Object {
  /**
    * The names of the columns in table to be written.  The list of columns
    * must contain enough columns to allow Cloud Spanner to derive values for
    * all primary key columns in the row(s) to be modified.
    */
  var columns: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required. The table whose rows will be written.
    */
  var table: js.UndefOr[String] = js.native
  /**
    * The values to be written. `values` can contain more than one list of
    * values. If it does, then multiple rows are written, one for each entry in
    * `values`. Each list in `values` must have exactly as many entries as
    * there are entries in columns above. Sending multiple lists is equivalent
    * to sending multiple `Mutation`s, each containing one `values` entry and
    * repeating table and columns. Individual values in each list are encoded
    * as described here.
    */
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.native
}

object Schema$Write {
  @scala.inline
  def apply(columns: js.Array[String] = null, table: String = null, values: js.Array[js.Array[_]] = null): Schema$Write = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Write]
  }
}

