package typings.gapiDotClientDotTagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltFieldsKeyOauthtokenPathPrettyPrint extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** GTM Folder's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/folders/{folder_id} */
  var path: String
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** The tags to be moved to the folder. */
  var tagId: js.UndefOr[String] = js.undefined
  /** The triggers to be moved to the folder. */
  var triggerId: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
  /** The variables to be moved to the folder. */
  var variableId: js.UndefOr[String] = js.undefined
}

object Anon_AltFieldsKeyOauthtokenPathPrettyPrint {
  @scala.inline
  def apply(
    path: String,
    alt: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    tagId: String = null,
    triggerId: String = null,
    userIp: String = null,
    variableId: String = null
  ): Anon_AltFieldsKeyOauthtokenPathPrettyPrint = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (tagId != null) __obj.updateDynamic("tagId")(tagId.asInstanceOf[js.Any])
    if (triggerId != null) __obj.updateDynamic("triggerId")(triggerId.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (variableId != null) __obj.updateDynamic("variableId")(variableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AltFieldsKeyOauthtokenPathPrettyPrint]
  }
}

