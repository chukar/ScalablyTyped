package typings.googleapis.buildSrcApisYoutubeAnalyticsV2Mod.youtubeAnalytics_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The description of a column of the result table.
  */
@js.native
trait Schema$ResultTableColumnHeader extends js.Object {
  /**
    * The type of the column (`DIMENSION` or `METRIC`).
    */
  var columnType: js.UndefOr[String] = js.native
  /**
    * The type of the data in the column (`STRING`, `INTEGER`, `FLOAT`, etc.).
    */
  var dataType: js.UndefOr[String] = js.native
  /**
    * The name of the dimension or metric.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$ResultTableColumnHeader {
  @scala.inline
  def apply(columnType: String = null, dataType: String = null, name: String = null): Schema$ResultTableColumnHeader = {
    val __obj = js.Dynamic.literal()
    if (columnType != null) __obj.updateDynamic("columnType")(columnType.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResultTableColumnHeader]
  }
}

