package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Args extends js.Object {
  var args: js.UndefOr[js.Array[Anon_TypeValue]] = js.native
  var format: js.UndefOr[String] = js.native
}

object Anon_Args {
  @scala.inline
  def apply(args: js.Array[Anon_TypeValue] = null, format: String = null): Anon_Args = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Args]
  }
}

