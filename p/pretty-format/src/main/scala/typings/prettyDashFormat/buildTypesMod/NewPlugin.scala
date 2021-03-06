package typings.prettyDashFormat.buildTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewPlugin extends Plugin {
  var test: Test
  def serialize(`val`: js.Any, config: Config, indentation: String, depth: Double, refs: Refs, printer: Printer): String
}

object NewPlugin {
  @scala.inline
  def apply(
    serialize: (js.Any, Config, String, Double, Refs, Printer) => String,
    test: /* arg0 */ js.Any => Boolean
  ): NewPlugin = {
    val __obj = js.Dynamic.literal(serialize = js.Any.fromFunction6(serialize), test = js.Any.fromFunction1(test))
  
    __obj.asInstanceOf[NewPlugin]
  }
}

