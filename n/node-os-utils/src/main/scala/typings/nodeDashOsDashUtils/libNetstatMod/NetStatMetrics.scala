package typings.nodeDashOsDashUtils.libNetstatMod

import org.scalablytyped.runtime.StringDictionary
import typings.nodeDashOsDashUtils.Anon_InputMb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetStatMetrics extends /* key */ StringDictionary[Anon_InputMb] {
  var total: Anon_InputMb
}

object NetStatMetrics {
  @scala.inline
  def apply(total: Anon_InputMb, StringDictionary: /* key */ StringDictionary[Anon_InputMb] = null): NetStatMetrics = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[NetStatMetrics]
  }
}

