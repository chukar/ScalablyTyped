package typings.promiseDashFs

import typings.promiseDashFs.promiseDashFsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingFalseWithFileTypes extends js.Object {
  var encoding: js.UndefOr[String | Null] = js.undefined
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}

object Anon_EncodingFalseWithFileTypes {
  @scala.inline
  def apply(encoding: String = null, withFileTypes: `false` = null): Anon_EncodingFalseWithFileTypes = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (withFileTypes != null) __obj.updateDynamic("withFileTypes")(withFileTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncodingFalseWithFileTypes]
  }
}

