package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information relevant only to a query entry.
  */
@js.native
trait Schema$QueryItem extends js.Object {
  /**
    * True if the text was generated by means other than a previous user
    * search.
    */
  var isSynthetic: js.UndefOr[Boolean] = js.native
}

object Schema$QueryItem {
  @scala.inline
  def apply(isSynthetic: js.UndefOr[Boolean] = js.undefined): Schema$QueryItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isSynthetic)) __obj.updateDynamic("isSynthetic")(isSynthetic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$QueryItem]
  }
}

