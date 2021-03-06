package typings.grunt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Custom extends js.Object {
  var custom: js.UndefOr[js.Any] = js.undefined
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var detached: js.UndefOr[Boolean] = js.undefined
  var env: js.UndefOr[js.Any] = js.undefined
  var stdio: js.UndefOr[js.Any] = js.undefined
}

object Anon_Custom {
  @scala.inline
  def apply(
    custom: js.Any = null,
    cwd: java.lang.String = null,
    detached: js.UndefOr[Boolean] = js.undefined,
    env: js.Any = null,
    stdio: js.Any = null
  ): Anon_Custom = {
    val __obj = js.Dynamic.literal()
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Custom]
  }
}

