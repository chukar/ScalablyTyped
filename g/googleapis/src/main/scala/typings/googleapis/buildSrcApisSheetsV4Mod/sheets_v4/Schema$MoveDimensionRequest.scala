package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Moves one or more rows or columns.
  */
@js.native
trait Schema$MoveDimensionRequest extends js.Object {
  /**
    * The zero-based start index of where to move the source data to, based on
    * the coordinates *before* the source data is removed from the grid.
    * Existing data will be shifted down or right (depending on the dimension)
    * to make room for the moved dimensions. The source dimensions are removed
    * from the grid, so the the data may end up in a different index than
    * specified.  For example, given `A1..A5` of `0, 1, 2, 3, 4` and wanting to
    * move `&quot;1&quot;` and `&quot;2&quot;` to between `&quot;3&quot;` and
    * `&quot;4&quot;`, the source would be `ROWS [1..3)`,and the destination
    * index would be `&quot;4&quot;` (the zero-based index of row 5). The end
    * result would be `A1..A5` of `0, 3, 1, 2, 4`.
    */
  var destinationIndex: js.UndefOr[Double] = js.native
  /**
    * The source dimensions to move.
    */
  var source: js.UndefOr[Schema$DimensionRange] = js.native
}

object Schema$MoveDimensionRequest {
  @scala.inline
  def apply(destinationIndex: Int | Double = null, source: Schema$DimensionRange = null): Schema$MoveDimensionRequest = {
    val __obj = js.Dynamic.literal()
    if (destinationIndex != null) __obj.updateDynamic("destinationIndex")(destinationIndex.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MoveDimensionRequest]
  }
}

