package typings.astDashTypes

import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Leading extends js.Object {
  var leading: js.UndefOr[Boolean] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var trailing: js.UndefOr[Boolean] = js.undefined
  var value: String
}

object Anon_Leading {
  @scala.inline
  def apply(
    value: String,
    leading: js.UndefOr[Boolean] = js.undefined,
    loc: SourceLocationKind = null,
    trailing: js.UndefOr[Boolean] = js.undefined
  ): Anon_Leading = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(leading)) __obj.updateDynamic("leading")(leading.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(trailing)) __obj.updateDynamic("trailing")(trailing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Leading]
  }
}

