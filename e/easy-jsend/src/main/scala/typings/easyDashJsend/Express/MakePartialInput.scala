package typings.easyDashJsend.Express

import typings.easyDashJsend.Anon_Limit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakePartialInput extends js.Object {
  var model: js.Any
  var opts: Anon_Limit
  var result: js.Any
  var search: js.Object
}

object MakePartialInput {
  @scala.inline
  def apply(model: js.Any, opts: Anon_Limit, result: js.Any, search: js.Object): MakePartialInput = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MakePartialInput]
  }
}

