package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsGetStatusForAuthenticatedUserResponse extends js.Object {
  var created_at: String
  var exclude_attachments: Boolean
  var guid: String
  var id: Double
  var lock_repositories: Boolean
  var owner: MigrationsGetStatusForAuthenticatedUserResponseOwner
  var repositories: js.Array[MigrationsGetStatusForAuthenticatedUserResponseRepositoriesItem]
  var state: String
  var updated_at: String
  var url: String
}

object MigrationsGetStatusForAuthenticatedUserResponse {
  @scala.inline
  def apply(
    created_at: String,
    exclude_attachments: Boolean,
    guid: String,
    id: Double,
    lock_repositories: Boolean,
    owner: MigrationsGetStatusForAuthenticatedUserResponseOwner,
    repositories: js.Array[MigrationsGetStatusForAuthenticatedUserResponseRepositoriesItem],
    state: String,
    updated_at: String,
    url: String
  ): MigrationsGetStatusForAuthenticatedUserResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], exclude_attachments = exclude_attachments.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lock_repositories = lock_repositories.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repositories = repositories.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MigrationsGetStatusForAuthenticatedUserResponse]
  }
}

