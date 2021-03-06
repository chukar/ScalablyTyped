package typings.nodeDashZendesk.nodeDashZendeskMod.Tickets.Comments.CommentsUsers

import typings.nodeDashZendesk.nodeDashZendeskMod.Attachments.Model
import typings.nodeDashZendesk.nodeDashZendeskMod.Users.Role
import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseModel
  extends typings.nodeDashZendesk.nodeDashZendeskMod.Requests.Comments.CommentsUsers.ResponseModel {
  val role: Role
}

object ResponseModel {
  @scala.inline
  def apply(
    agent: Boolean,
    id: ZendeskID,
    name: String,
    role: Role,
    organization_id: Int | Double = null,
    photo: Model = null
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    if (organization_id != null) __obj.updateDynamic("organization_id")(organization_id.asInstanceOf[js.Any])
    if (photo != null) __obj.updateDynamic("photo")(photo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseModel]
  }
}

