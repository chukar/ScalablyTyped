package typings.sharedb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Register extends js.Object {
  def register(`type`: Anon_Key): Unit
}

object Anon_Register {
  @scala.inline
  def apply(register: Anon_Key => Unit): Anon_Register = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register))
  
    __obj.asInstanceOf[Anon_Register]
  }
}

