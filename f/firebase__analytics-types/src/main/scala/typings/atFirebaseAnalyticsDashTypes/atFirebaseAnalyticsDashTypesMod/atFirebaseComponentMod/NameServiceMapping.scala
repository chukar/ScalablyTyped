package typings.atFirebaseAnalyticsDashTypes.atFirebaseAnalyticsDashTypesMod.atFirebaseComponentMod

import typings.atFirebaseAnalyticsDashTypes.atFirebaseAnalyticsDashTypesMod.FirebaseAnalytics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameServiceMapping extends js.Object {
  var analytics: FirebaseAnalytics
}

object NameServiceMapping {
  @scala.inline
  def apply(analytics: FirebaseAnalytics): NameServiceMapping = {
    val __obj = js.Dynamic.literal(analytics = analytics.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NameServiceMapping]
  }
}

