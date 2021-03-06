package typings.googleapis.buildSrcApisAlertcenterV1beta1Mod.alertcenter_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a CSV file attachment, as a list of column headers and
  * a list of data rows.
  */
@js.native
trait Schema$Csv extends js.Object {
  /**
    * The list of data rows in a CSV file, as string arrays rather than as a
    * single comma-separated string.
    */
  var dataRows: js.UndefOr[js.Array[Schema$CsvRow]] = js.native
  /**
    * The list of headers for data columns in a CSV file.
    */
  var headers: js.UndefOr[js.Array[String]] = js.native
}

object Schema$Csv {
  @scala.inline
  def apply(dataRows: js.Array[Schema$CsvRow] = null, headers: js.Array[String] = null): Schema$Csv = {
    val __obj = js.Dynamic.literal()
    if (dataRows != null) __obj.updateDynamic("dataRows")(dataRows.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Csv]
  }
}

