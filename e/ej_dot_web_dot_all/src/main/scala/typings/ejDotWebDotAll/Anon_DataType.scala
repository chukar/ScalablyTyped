package typings.ejDotWebDotAll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataType extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var `type`: String
  var url: String
}

object Anon_DataType {
  @scala.inline
  def apply(`type`: String, url: String, data: js.Any = null): Anon_DataType = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataType]
  }
}

