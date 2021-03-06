package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A SubscriptionDeferralInfo contains the data needed to defer a subscription
  * purchase to a future expiry time.
  */
@js.native
trait Schema$SubscriptionDeferralInfo extends js.Object {
  /**
    * The desired next expiry time to assign to the subscription, in
    * milliseconds since the Epoch. The given time must be later/greater than
    * the current expiry time for the subscription.
    */
  var desiredExpiryTimeMillis: js.UndefOr[String] = js.native
  /**
    * The expected expiry time for the subscription. If the current expiry time
    * for the subscription is not the value specified here, the deferral will
    * not occur.
    */
  var expectedExpiryTimeMillis: js.UndefOr[String] = js.native
}

object Schema$SubscriptionDeferralInfo {
  @scala.inline
  def apply(desiredExpiryTimeMillis: String = null, expectedExpiryTimeMillis: String = null): Schema$SubscriptionDeferralInfo = {
    val __obj = js.Dynamic.literal()
    if (desiredExpiryTimeMillis != null) __obj.updateDynamic("desiredExpiryTimeMillis")(desiredExpiryTimeMillis.asInstanceOf[js.Any])
    if (expectedExpiryTimeMillis != null) __obj.updateDynamic("expectedExpiryTimeMillis")(expectedExpiryTimeMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SubscriptionDeferralInfo]
  }
}

