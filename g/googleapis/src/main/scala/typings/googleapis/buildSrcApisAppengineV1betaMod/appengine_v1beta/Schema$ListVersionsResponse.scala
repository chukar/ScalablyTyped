package typings.googleapis.buildSrcApisAppengineV1betaMod.appengine_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for Versions.ListVersions.
  */
@js.native
trait Schema$ListVersionsResponse extends js.Object {
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The versions belonging to the requested service.
    */
  var versions: js.UndefOr[js.Array[Schema$Version]] = js.native
}

object Schema$ListVersionsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, versions: js.Array[Schema$Version] = null): Schema$ListVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListVersionsResponse]
  }
}

