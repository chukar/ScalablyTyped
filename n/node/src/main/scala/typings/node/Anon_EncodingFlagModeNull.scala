package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingFlagModeNull extends js.Object {
  var encoding: js.UndefOr[java.lang.String | Null] = js.undefined
  var flag: js.UndefOr[java.lang.String | Double] = js.undefined
  var mode: js.UndefOr[java.lang.String | Double] = js.undefined
}

object Anon_EncodingFlagModeNull {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    flag: java.lang.String | Double = null,
    mode: java.lang.String | Double = null
  ): Anon_EncodingFlagModeNull = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncodingFlagModeNull]
  }
}

