package typings.googleapis.buildSrcApisDoubleclickbidmanagerV1Mod.doubleclickbidmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List reports response.
  */
@js.native
trait Schema$ListReportsResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;doubleclickbidmanager#listReportsResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Retrieved reports.
    */
  var reports: js.UndefOr[js.Array[Schema$Report]] = js.native
}

object Schema$ListReportsResponse {
  @scala.inline
  def apply(kind: String = null, reports: js.Array[Schema$Report] = null): Schema$ListReportsResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (reports != null) __obj.updateDynamic("reports")(reports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListReportsResponse]
  }
}

