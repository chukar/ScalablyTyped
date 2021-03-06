package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The list of elections available for this version of the API.
  */
@js.native
trait Schema$ElectionsQueryResponse extends js.Object {
  /**
    * A list of available elections
    */
  var elections: js.UndefOr[js.Array[Schema$Election]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;civicinfo#electionsQueryResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$ElectionsQueryResponse {
  @scala.inline
  def apply(elections: js.Array[Schema$Election] = null, kind: String = null): Schema$ElectionsQueryResponse = {
    val __obj = js.Dynamic.literal()
    if (elections != null) __obj.updateDynamic("elections")(elections.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ElectionsQueryResponse]
  }
}

