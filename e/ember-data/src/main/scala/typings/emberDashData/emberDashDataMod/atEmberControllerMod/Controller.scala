package typings.emberDashData.emberDashDataMod.atEmberControllerMod

import typings.emberDashData.emberDashDataMod.DS.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Controller extends js.Object {
  var store: Store
}

object Controller {
  @scala.inline
  def apply(store: Store): Controller = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Controller]
  }
}

