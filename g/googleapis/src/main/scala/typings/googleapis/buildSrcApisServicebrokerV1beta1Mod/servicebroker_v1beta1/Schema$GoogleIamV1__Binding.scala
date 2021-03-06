package typings.googleapis.buildSrcApisServicebrokerV1beta1Mod.servicebroker_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Associates `members` with a `role`.
  */
@js.native
trait Schema$GoogleIamV1__Binding extends js.Object {
  /**
    * The condition that is associated with this binding. NOTE: an unsatisfied
    * condition will not allow user access via current binding. Different
    * bindings, including their conditions, are examined independently.
    */
  var condition: js.UndefOr[Schema$GoogleType__Expr] = js.native
  /**
    * Specifies the identities requesting access for a Cloud Platform resource.
    * `members` can have the following values:  * `allUsers`: A special
    * identifier that represents anyone who is    on the internet; with or
    * without a Google account.  * `allAuthenticatedUsers`: A special
    * identifier that represents anyone    who is authenticated with a Google
    * account or a service account.  * `user:{emailid}`: An email address that
    * represents a specific Google    account. For example, `alice@gmail.com` .
    * * `serviceAccount:{emailid}`: An email address that represents a service
    * account. For example, `my-other-app@appspot.gserviceaccount.com`.  *
    * `group:{emailid}`: An email address that represents a Google group. For
    * example, `admins@example.com`.   * `domain:{domain}`: The G Suite domain
    * (primary) that represents all the    users of that domain. For example,
    * `google.com` or `example.com`.
    */
  var members: js.UndefOr[js.Array[String]] = js.native
  /**
    * Role that is assigned to `members`. For example, `roles/viewer`,
    * `roles/editor`, or `roles/owner`.
    */
  var role: js.UndefOr[String] = js.native
}

object Schema$GoogleIamV1__Binding {
  @scala.inline
  def apply(condition: Schema$GoogleType__Expr = null, members: js.Array[String] = null, role: String = null): Schema$GoogleIamV1__Binding = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (members != null) __obj.updateDynamic("members")(members.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleIamV1__Binding]
  }
}

