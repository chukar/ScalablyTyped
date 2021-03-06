package typings.googleapis.buildSrcApisDriveV3Mod.drive_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of files.
  */
@js.native
trait Schema$FileList extends js.Object {
  /**
    * The list of files. If nextPageToken is populated, then this list may be
    * incomplete and an additional page of results should be fetched.
    */
  var files: js.UndefOr[js.Array[Schema$File]] = js.native
  /**
    * Whether the search process was incomplete. If true, then some search
    * results may be missing, since all documents were not searched. This may
    * occur when searching multiple Team Drives with the
    * &quot;user,allTeamDrives&quot; corpora, but all corpora could not be
    * searched. When this happens, it is suggested that clients narrow their
    * query by choosing a different corpus such as &quot;user&quot; or
    * &quot;teamDrive&quot;.
    */
  var incompleteSearch: js.UndefOr[Boolean] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#fileList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The page token for the next page of files. This will be absent if the end
    * of the files list has been reached. If the token is rejected for any
    * reason, it should be discarded, and pagination should be restarted from
    * the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$FileList {
  @scala.inline
  def apply(
    files: js.Array[Schema$File] = null,
    incompleteSearch: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$FileList = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (!js.isUndefined(incompleteSearch)) __obj.updateDynamic("incompleteSearch")(incompleteSearch.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FileList]
  }
}

