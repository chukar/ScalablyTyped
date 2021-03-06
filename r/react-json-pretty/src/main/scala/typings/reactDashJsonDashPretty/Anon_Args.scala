package typings.reactDashJsonDashPretty

import typings.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var data: Requireable[_]
  var json: Requireable[_]
  var onJSONPrettyError: Requireable[js.Function1[/* repeated */ _, _]]
  var replacer: Requireable[js.Function1[/* repeated */ _, _]]
  var silent: Requireable[Boolean]
  var space: Requireable[String | Double]
  var theme: Requireable[js.Object]
  var themeClassName: Requireable[String]
}

object Anon_Args {
  @scala.inline
  def apply(
    data: Requireable[_],
    json: Requireable[_],
    onJSONPrettyError: Requireable[js.Function1[/* repeated */ _, _]],
    replacer: Requireable[js.Function1[/* repeated */ _, _]],
    silent: Requireable[Boolean],
    space: Requireable[String | Double],
    theme: Requireable[js.Object],
    themeClassName: Requireable[String]
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], onJSONPrettyError = onJSONPrettyError.asInstanceOf[js.Any], replacer = replacer.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], themeClassName = themeClassName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Args]
  }
}

