package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CorrectedQuery extends js.Object {
  var correctedQuery: js.UndefOr[String] = js.native
  var htmlCorrectedQuery: js.UndefOr[String] = js.native
}

object Anon_CorrectedQuery {
  @scala.inline
  def apply(correctedQuery: String = null, htmlCorrectedQuery: String = null): Anon_CorrectedQuery = {
    val __obj = js.Dynamic.literal()
    if (correctedQuery != null) __obj.updateDynamic("correctedQuery")(correctedQuery.asInstanceOf[js.Any])
    if (htmlCorrectedQuery != null) __obj.updateDynamic("htmlCorrectedQuery")(htmlCorrectedQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CorrectedQuery]
  }
}

