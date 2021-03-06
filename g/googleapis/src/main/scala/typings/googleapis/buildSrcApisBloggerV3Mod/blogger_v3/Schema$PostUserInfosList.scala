package typings.googleapis.buildSrcApisBloggerV3Mod.blogger_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PostUserInfosList extends js.Object {
  /**
    * The list of Posts with User information for the post, for this Blog.
    */
  var items: js.UndefOr[js.Array[Schema$PostUserInfo]] = js.native
  /**
    * The kind of this entity. Always blogger#postList
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to fetch the next page, if one exists.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$PostUserInfosList {
  @scala.inline
  def apply(items: js.Array[Schema$PostUserInfo] = null, kind: String = null, nextPageToken: String = null): Schema$PostUserInfosList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PostUserInfosList]
  }
}

