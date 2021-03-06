package typings.instagramDashPrivateDashApi.distResponsesInsightsDotServiceDotAccountDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServiceAccountResponseUser extends js.Object {
  var business_manager: InsightsServiceAccountResponseBusiness_manager
  var business_profile: InsightsServiceAccountResponseBusiness_profile
  var followers_count: Double
  var id: String
  var instagram_user_id: String
  var profile_picture: InsightsServiceAccountResponseProfile_picture
  var username: String
}

object InsightsServiceAccountResponseUser {
  @scala.inline
  def apply(
    business_manager: InsightsServiceAccountResponseBusiness_manager,
    business_profile: InsightsServiceAccountResponseBusiness_profile,
    followers_count: Double,
    id: String,
    instagram_user_id: String,
    profile_picture: InsightsServiceAccountResponseProfile_picture,
    username: String
  ): InsightsServiceAccountResponseUser = {
    val __obj = js.Dynamic.literal(business_manager = business_manager.asInstanceOf[js.Any], business_profile = business_profile.asInstanceOf[js.Any], followers_count = followers_count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instagram_user_id = instagram_user_id.asInstanceOf[js.Any], profile_picture = profile_picture.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsightsServiceAccountResponseUser]
  }
}

