package typings.expressDashValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SaveContext extends js.Object {
  var saveContext: js.UndefOr[Boolean] = js.undefined
}

object Anon_SaveContext {
  @scala.inline
  def apply(saveContext: js.UndefOr[Boolean] = js.undefined): Anon_SaveContext = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(saveContext)) __obj.updateDynamic("saveContext")(saveContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SaveContext]
  }
}

