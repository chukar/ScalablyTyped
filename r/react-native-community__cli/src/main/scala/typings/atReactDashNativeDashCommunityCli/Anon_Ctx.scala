package typings.atReactDashNativeDashCommunityCli

import typings.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ctx extends js.Object {
  var default: js.UndefOr[
    String | Boolean | Double | (js.Function1[/* ctx */ Config, String | Boolean | Double])
  ] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var name: String
  var parse: js.UndefOr[js.Function1[/* val */ String, _]] = js.undefined
}

object Anon_Ctx {
  @scala.inline
  def apply(
    name: String,
    default: String | Boolean | Double | (js.Function1[/* ctx */ Config, String | Boolean | Double]) = null,
    description: String = null,
    parse: /* val */ String => _ = null
  ): Anon_Ctx = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(js.Any.fromFunction1(parse))
    __obj.asInstanceOf[Anon_Ctx]
  }
}

