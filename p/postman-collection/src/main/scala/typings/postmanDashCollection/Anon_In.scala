package typings.postmanDashCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_In extends js.Object {
  def in(`val`: js.Any): String
  def out(`val`: String): js.Any
}

object Anon_In {
  @scala.inline
  def apply(in: js.Any => String, out: String => js.Any): Anon_In = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), out = js.Any.fromFunction1(out))
  
    __obj.asInstanceOf[Anon_In]
  }
}

