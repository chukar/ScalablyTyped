package typings.googleapis.buildSrcApisPlusDomainsV1Mod.plusDomains_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AudiencesFeed extends js.Object {
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The audiences in this result.
    */
  var items: js.UndefOr[js.Array[Schema$Audience]] = js.native
  /**
    * Identifies this resource as a collection of audiences. Value:
    * &quot;plus#audienceFeed&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The total number of ACL entries. The number of entries in this response
    * may be smaller due to paging.
    */
  var totalItems: js.UndefOr[Double] = js.native
}

object Schema$AudiencesFeed {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Schema$Audience] = null,
    kind: String = null,
    nextPageToken: String = null,
    totalItems: Int | Double = null
  ): Schema$AudiencesFeed = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AudiencesFeed]
  }
}

