package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import typings.googleapis.Anon_Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarUsersDollarMessagesDollarImport extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Mark the email as permanently deleted (not TRASH) and only visible in
    * Google Vault to a Vault administrator. Only used for G Suite accounts.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * Source for Gmail's internal date of the message.
    */
  var internalDateSource: js.UndefOr[String] = js.native
  /**
    * Media metadata
    */
  var media: js.UndefOr[Anon_Body] = js.native
  /**
    * Ignore the Gmail spam classifier decision and never mark this email as
    * SPAM in the mailbox.
    */
  var neverMarkSpam: js.UndefOr[Boolean] = js.native
  /**
    * Process calendar invites in the email and add any extracted meetings to
    * the Google Calendar for this user.
    */
  var processForCalendar: js.UndefOr[Boolean] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Message] = js.native
  /**
    * The user's email address. The special value me can be used to indicate
    * the authenticated user.
    */
  var userId: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarUsersDollarMessagesDollarImport {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    fields: String = null,
    internalDateSource: String = null,
    key: String = null,
    media: Anon_Body = null,
    neverMarkSpam: js.UndefOr[Boolean] = js.undefined,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    processForCalendar: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    requestBody: Schema$Message = null,
    userId: String = null,
    userIp: String = null
  ): ParamsDollarResourceDollarUsersDollarMessagesDollarImport = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (internalDateSource != null) __obj.updateDynamic("internalDateSource")(internalDateSource.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (!js.isUndefined(neverMarkSpam)) __obj.updateDynamic("neverMarkSpam")(neverMarkSpam.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (!js.isUndefined(processForCalendar)) __obj.updateDynamic("processForCalendar")(processForCalendar.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarUsersDollarMessagesDollarImport]
  }
}

