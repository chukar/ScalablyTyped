package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the `ListReferenceImages` method.
  */
@js.native
trait Schema$ListReferenceImagesResponse extends js.Object {
  /**
    * The next_page_token returned from a previous List request, if any.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The maximum number of items to return. Default 10, maximum 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The list of reference images.
    */
  var referenceImages: js.UndefOr[js.Array[Schema$ReferenceImage]] = js.native
}

object Schema$ListReferenceImagesResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    pageSize: Int | Double = null,
    referenceImages: js.Array[Schema$ReferenceImage] = null
  ): Schema$ListReferenceImagesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (referenceImages != null) __obj.updateDynamic("referenceImages")(referenceImages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListReferenceImagesResponse]
  }
}

