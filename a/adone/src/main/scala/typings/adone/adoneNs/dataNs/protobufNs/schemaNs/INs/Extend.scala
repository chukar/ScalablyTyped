package typings.adone.adoneNs.dataNs.protobufNs.schemaNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extend extends js.Object {
  var message: Message
  var name: String
}

object Extend {
  @scala.inline
  def apply(message: Message, name: String): Extend = {
    val __obj = js.Dynamic.literal(message = message, name = name)
  
    __obj.asInstanceOf[Extend]
  }
}

