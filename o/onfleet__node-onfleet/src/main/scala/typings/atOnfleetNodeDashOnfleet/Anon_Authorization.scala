package typings.atOnfleetNodeDashOnfleet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authorization extends js.Object {
  var Authorization: String
  var `Content-Type`: String
  var `User-Agent`: String
}

object Anon_Authorization {
  @scala.inline
  def apply(Authorization: String, `Content-Type`: String, `User-Agent`: String): Anon_Authorization = {
    val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
    __obj.updateDynamic("Content-Type")(`Content-Type`.asInstanceOf[js.Any])
    __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Authorization]
  }
}

