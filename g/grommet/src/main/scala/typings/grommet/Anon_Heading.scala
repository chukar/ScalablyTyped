package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Heading extends js.Object {
  var heading: js.UndefOr[Anon_Level] = js.undefined
  var icons: js.UndefOr[Anon_NextPrevious] = js.undefined
  var large: js.UndefOr[Anon_DaySize] = js.undefined
  var medium: js.UndefOr[Anon_DaySize] = js.undefined
  var small: js.UndefOr[Anon_DaySize] = js.undefined
}

object Anon_Heading {
  @scala.inline
  def apply(
    heading: Anon_Level = null,
    icons: Anon_NextPrevious = null,
    large: Anon_DaySize = null,
    medium: Anon_DaySize = null,
    small: Anon_DaySize = null
  ): Anon_Heading = {
    val __obj = js.Dynamic.literal()
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Heading]
  }
}

