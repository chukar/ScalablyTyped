package typings.sharedb

import typings.sharedb.libClientMod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ResultsArray extends js.Object {
  var results: js.UndefOr[js.Array[Query]] = js.undefined
}

object Anon_ResultsArray {
  @scala.inline
  def apply(results: js.Array[Query] = null): Anon_ResultsArray = {
    val __obj = js.Dynamic.literal()
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ResultsArray]
  }
}

