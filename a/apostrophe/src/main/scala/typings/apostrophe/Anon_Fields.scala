package typings.apostrophe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fields extends js.Object {
  var fields: js.Array[String]
  var label: String
  var name: String
}

object Anon_Fields {
  @scala.inline
  def apply(fields: js.Array[String], label: String, name: String): Anon_Fields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Fields]
  }
}

