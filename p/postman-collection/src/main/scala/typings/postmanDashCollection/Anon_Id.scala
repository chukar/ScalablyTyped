package typings.postmanDashCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(id: String = null, name: String = null, version: String = null): Anon_Id = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Id]
  }
}

