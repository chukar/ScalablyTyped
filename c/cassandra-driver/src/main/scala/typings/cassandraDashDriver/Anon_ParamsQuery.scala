package typings.cassandraDashDriver

import typings.cassandraDashDriver.cassandraDashDriverMod.ArrayOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ParamsQuery extends js.Object {
  var params: js.UndefOr[ArrayOrObject] = js.undefined
  var query: String
}

object Anon_ParamsQuery {
  @scala.inline
  def apply(query: String, params: ArrayOrObject = null): Anon_ParamsQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ParamsQuery]
  }
}

