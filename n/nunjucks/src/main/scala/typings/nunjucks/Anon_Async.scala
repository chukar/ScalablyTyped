package typings.nunjucks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Async extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var useCache: js.UndefOr[Boolean] = js.undefined
}

object Anon_Async {
  @scala.inline
  def apply(async: js.UndefOr[Boolean] = js.undefined, useCache: js.UndefOr[Boolean] = js.undefined): Anon_Async = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (!js.isUndefined(useCache)) __obj.updateDynamic("useCache")(useCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Async]
  }
}

