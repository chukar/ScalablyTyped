package typings.atFrctlFractal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object Anon_Format {
  @scala.inline
  def apply(format: /* str */ String => String = null, text: String = null): Anon_Format = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Format]
  }
}

