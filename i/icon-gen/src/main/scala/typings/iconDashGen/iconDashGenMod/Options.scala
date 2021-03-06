package typings.iconDashGen.iconDashGenMod

import typings.iconDashGen.Anon_Ico
import typings.iconDashGen.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var favicon: js.UndefOr[Anon_Ico | js.Object] = js.undefined
  var icns: js.UndefOr[Anon_Name | js.Object] = js.undefined
  var ico: js.UndefOr[Anon_Name | js.Object] = js.undefined
  var report: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    favicon: Anon_Ico | js.Object = null,
    icns: Anon_Name | js.Object = null,
    ico: Anon_Name | js.Object = null,
    report: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (favicon != null) __obj.updateDynamic("favicon")(favicon.asInstanceOf[js.Any])
    if (icns != null) __obj.updateDynamic("icns")(icns.asInstanceOf[js.Any])
    if (ico != null) __obj.updateDynamic("ico")(ico.asInstanceOf[js.Any])
    if (!js.isUndefined(report)) __obj.updateDynamic("report")(report.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

