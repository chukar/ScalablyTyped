package typings.gapiDotClientDotAnalytics.gapi.client.analytics

import typings.gapiDotClientDotAnalytics.Anon_CaseSensitive
import typings.gapiDotClientDotAnalytics.Anon_CaseSensitiveField
import typings.gapiDotClientDotAnalytics.Anon_Field
import typings.gapiDotClientDotAnalytics.Anon_Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  /** Account ID to which this filter belongs. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Details for the filter of the type ADVANCED. */
  var advancedDetails: js.UndefOr[Anon_CaseSensitive] = js.undefined
  /** Time this filter was created. */
  var created: js.UndefOr[String] = js.undefined
  /** Details for the filter of the type EXCLUDE. */
  var excludeDetails: js.UndefOr[FilterExpression] = js.undefined
  /** Filter ID. */
  var id: js.UndefOr[String] = js.undefined
  /** Details for the filter of the type INCLUDE. */
  var includeDetails: js.UndefOr[FilterExpression] = js.undefined
  /** Resource type for Analytics filter. */
  var kind: js.UndefOr[String] = js.undefined
  /** Details for the filter of the type LOWER. */
  var lowercaseDetails: js.UndefOr[Anon_Field] = js.undefined
  /** Name of this filter. */
  var name: js.UndefOr[String] = js.undefined
  /** Parent link for this filter. Points to the account to which this filter belongs. */
  var parentLink: js.UndefOr[Anon_Href] = js.undefined
  /** Details for the filter of the type SEARCH_AND_REPLACE. */
  var searchAndReplaceDetails: js.UndefOr[Anon_CaseSensitiveField] = js.undefined
  /** Link for this filter. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** Type of this filter. Possible values are INCLUDE, EXCLUDE, LOWERCASE, UPPERCASE, SEARCH_AND_REPLACE and ADVANCED. */
  var `type`: js.UndefOr[String] = js.undefined
  /** Time this filter was last modified. */
  var updated: js.UndefOr[String] = js.undefined
  /** Details for the filter of the type UPPER. */
  var uppercaseDetails: js.UndefOr[Anon_Field] = js.undefined
}

object Filter {
  @scala.inline
  def apply(
    accountId: String = null,
    advancedDetails: Anon_CaseSensitive = null,
    created: String = null,
    excludeDetails: FilterExpression = null,
    id: String = null,
    includeDetails: FilterExpression = null,
    kind: String = null,
    lowercaseDetails: Anon_Field = null,
    name: String = null,
    parentLink: Anon_Href = null,
    searchAndReplaceDetails: Anon_CaseSensitiveField = null,
    selfLink: String = null,
    `type`: String = null,
    updated: String = null,
    uppercaseDetails: Anon_Field = null
  ): Filter = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (advancedDetails != null) __obj.updateDynamic("advancedDetails")(advancedDetails.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (excludeDetails != null) __obj.updateDynamic("excludeDetails")(excludeDetails.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (includeDetails != null) __obj.updateDynamic("includeDetails")(includeDetails.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lowercaseDetails != null) __obj.updateDynamic("lowercaseDetails")(lowercaseDetails.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentLink != null) __obj.updateDynamic("parentLink")(parentLink.asInstanceOf[js.Any])
    if (searchAndReplaceDetails != null) __obj.updateDynamic("searchAndReplaceDetails")(searchAndReplaceDetails.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (uppercaseDetails != null) __obj.updateDynamic("uppercaseDetails")(uppercaseDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

