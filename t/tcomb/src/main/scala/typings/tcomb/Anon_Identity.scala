package typings.tcomb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Identity extends js.Object {
  var identity: Boolean
  var kind: String
  var name: String
}

object Anon_Identity {
  @scala.inline
  def apply(identity: Boolean, kind: String, name: String): Anon_Identity = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Identity]
  }
}

