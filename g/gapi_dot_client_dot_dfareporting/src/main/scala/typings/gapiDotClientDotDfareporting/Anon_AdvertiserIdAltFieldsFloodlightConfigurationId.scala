package typings.gapiDotClientDotDfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdvertiserIdAltFieldsFloodlightConfigurationId extends js.Object {
  /**
    * Select only floodlight activity groups with the specified advertiser ID. Must specify either advertiserId or floodlightConfigurationId for a non-empty
    * result.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /**
    * Select only floodlight activity groups with the specified floodlight configuration ID. Must specify either advertiserId, or floodlightConfigurationId
    * for a non-empty result.
    */
  var floodlightConfigurationId: js.UndefOr[String] = js.undefined
  /** Select only floodlight activity groups with the specified IDs. Must specify either advertiserId or floodlightConfigurationId for a non-empty result. */
  var ids: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** User profile ID associated with this request. */
  var profileId: String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * Allows searching for objects by name or ID. Wildcards (&#42;) are allowed. For example, "floodlightactivitygroup&#42;2015" will return objects with names like
    * "floodlightactivitygroup June 2015", "floodlightactivitygroup April 2015", or simply "floodlightactivitygroup 2015". Most of the searches also add
    * wildcards implicitly at the start and the end of the search string. For example, a search string of "floodlightactivitygroup" will match objects with
    * name "my floodlightactivitygroup activity", "floodlightactivitygroup 2015", or simply "floodlightactivitygroup".
    */
  var searchString: js.UndefOr[String] = js.undefined
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[String] = js.undefined
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[String] = js.undefined
  /** Select only floodlight activity groups with the specified floodlight activity group type. */
  var `type`: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object Anon_AdvertiserIdAltFieldsFloodlightConfigurationId {
  @scala.inline
  def apply(
    profileId: String,
    advertiserId: String = null,
    alt: String = null,
    fields: String = null,
    floodlightConfigurationId: String = null,
    ids: String = null,
    key: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    searchString: String = null,
    sortField: String = null,
    sortOrder: String = null,
    `type`: String = null,
    userIp: String = null
  ): Anon_AdvertiserIdAltFieldsFloodlightConfigurationId = {
    val __obj = js.Dynamic.literal(profileId = profileId.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (floodlightConfigurationId != null) __obj.updateDynamic("floodlightConfigurationId")(floodlightConfigurationId.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (searchString != null) __obj.updateDynamic("searchString")(searchString.asInstanceOf[js.Any])
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AdvertiserIdAltFieldsFloodlightConfigurationId]
  }
}

