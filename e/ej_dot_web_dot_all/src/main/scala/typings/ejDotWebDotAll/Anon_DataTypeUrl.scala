package typings.ejDotWebDotAll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataTypeUrl extends js.Object {
  var data: js.Any
  var `type`: String
  var url: String
}

object Anon_DataTypeUrl {
  @scala.inline
  def apply(data: js.Any, `type`: String, url: String): Anon_DataTypeUrl = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataTypeUrl]
  }
}

