package typings.reapop

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Main extends js.Object {
  var main: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[js.Function1[/* position */ String, String]] = js.undefined
}

object Anon_Main {
  @scala.inline
  def apply(main: String = null, position: /* position */ String => String = null): Anon_Main = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(js.Any.fromFunction1(position))
    __obj.asInstanceOf[Anon_Main]
  }
}

