package typings.atCkeditorCkeditor5DashEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConvertMarkers extends js.Object {
  var convertMarkers: js.UndefOr[Boolean] = js.undefined
  var rootName: js.UndefOr[String] = js.undefined
  var withoutSelection: js.UndefOr[Boolean] = js.undefined
}

object Anon_ConvertMarkers {
  @scala.inline
  def apply(
    convertMarkers: js.UndefOr[Boolean] = js.undefined,
    rootName: String = null,
    withoutSelection: js.UndefOr[Boolean] = js.undefined
  ): Anon_ConvertMarkers = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(convertMarkers)) __obj.updateDynamic("convertMarkers")(convertMarkers.asInstanceOf[js.Any])
    if (rootName != null) __obj.updateDynamic("rootName")(rootName.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutSelection)) __obj.updateDynamic("withoutSelection")(withoutSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ConvertMarkers]
  }
}

