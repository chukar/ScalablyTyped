package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsResponse extends js.Object {
  /**
    * The key-value pair for the resource tag.
    */
  var Tags: js.UndefOr[__mapOf__string] = js.native
}

object ListTagsResponse {
  @scala.inline
  def apply(Tags: __mapOf__string = null): ListTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsResponse]
  }
}

