package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationRevision extends js.Object {
  /**
    * Required. The date and time of the configuration revision.
    */
  var Created: js.UndefOr[__timestampIso8601] = js.native
  /**
    * The description of the configuration revision.
    */
  var Description: js.UndefOr[__string] = js.native
  /**
    * Required. The revision number of the configuration.
    */
  var Revision: js.UndefOr[__integer] = js.native
}

object ConfigurationRevision {
  @scala.inline
  def apply(Created: __timestampIso8601 = null, Description: __string = null, Revision: Int | Double = null): ConfigurationRevision = {
    val __obj = js.Dynamic.literal()
    if (Created != null) __obj.updateDynamic("Created")(Created.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Revision != null) __obj.updateDynamic("Revision")(Revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationRevision]
  }
}

