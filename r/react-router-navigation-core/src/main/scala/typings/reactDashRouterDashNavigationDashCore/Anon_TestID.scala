package typings.reactDashRouterDashNavigationDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TestID extends js.Object {
  var testID: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Anon_TestID {
  @scala.inline
  def apply(testID: String = null, title: String = null): Anon_TestID = {
    val __obj = js.Dynamic.literal()
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TestID]
  }
}

