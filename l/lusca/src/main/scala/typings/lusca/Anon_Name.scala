package typings.lusca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: String
  var options: js.UndefOr[js.Object] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(name: String, options: js.Object = null): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Name]
  }
}

